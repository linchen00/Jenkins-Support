package org.example.jenkinsfile_support.editor

import com.intellij.lang.ASTNode
import com.intellij.lang.folding.FoldingBuilderEx
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.editor.Document
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import org.example.jenkinsfile_support.psi.JenkinsfileTypes

/**
 * Simple and reliable code folding builder for Jenkinsfile language.
 */
class JenkinsfileFoldingBuilder : FoldingBuilderEx(), DumbAware {
    
    override fun buildFoldRegions(root: PsiElement, document: Document, quick: Boolean): Array<FoldingDescriptor> {
        val descriptors = mutableListOf<FoldingDescriptor>()
        
        // Simple approach: find all brace pairs and block comments
        findFoldableElements(root, descriptors, document)
        
        return descriptors.toTypedArray()
    }
    
    private fun findFoldableElements(element: PsiElement, descriptors: MutableList<FoldingDescriptor>, document: Document) {
        val node = element.node ?: return
        val elementType = node.elementType
        
        when (elementType) {
            // Fold block comments
            JenkinsfileTypes.BLOCK_COMMENT -> {
                if (element.text.contains('\n')) {
                    descriptors.add(FoldingDescriptor(node, element.textRange))
                }
            }
            
            // Fold brace blocks
            JenkinsfileTypes.LBRACE -> {
                val matchingBrace = findMatchingRightBrace(element)
                if (matchingBrace != null) {
                    val range = TextRange(element.textRange.startOffset, matchingBrace.textRange.endOffset)
                    
                    // Only add if it spans multiple lines and has reasonable size
                    if (spansMultipleLines(range, document) && range.length > 5) {
                        descriptors.add(FoldingDescriptor(node, range))
                    }
                }
            }
        }
        
        // Recursively process all children
        for (child in element.children) {
            findFoldableElements(child, descriptors, document)
        }
    }
    
    private fun findMatchingRightBrace(leftBrace: PsiElement): PsiElement? {
        var current = leftBrace.nextSibling
        var braceCount = 1  // We start with 1 because we've seen the opening brace
        
        while (current != null && braceCount > 0) {
            when (current.node?.elementType) {
                JenkinsfileTypes.LBRACE -> braceCount++
                JenkinsfileTypes.RBRACE -> {
                    braceCount--
                    if (braceCount == 0) {
                        return current
                    }
                }
            }
            
            // Also check children recursively
            val childMatch = findMatchingRightBraceInChildren(current, braceCount)
            if (childMatch != null) {
                return childMatch.first
            }
            
            current = current.nextSibling
        }
        
        return null
    }
    
    private fun findMatchingRightBraceInChildren(element: PsiElement, startBraceCount: Int): Pair<PsiElement, Int>? {
        var braceCount = startBraceCount
        
        for (child in element.children) {
            when (child.node?.elementType) {
                JenkinsfileTypes.LBRACE -> braceCount++
                JenkinsfileTypes.RBRACE -> {
                    braceCount--
                    if (braceCount == 0) {
                        return Pair(child, braceCount)
                    }
                }
            }
            
            // Recursively check children
            val result = findMatchingRightBraceInChildren(child, braceCount)
            if (result != null) {
                return result
            }
        }
        
        return null
    }
    
    private fun spansMultipleLines(range: TextRange, document: Document): Boolean {
        return try {
            val startLine = document.getLineNumber(range.startOffset)
            val endLine = document.getLineNumber(range.endOffset)
            endLine > startLine
        } catch (e: Exception) {
            false
        }
    }
    
    override fun getPlaceholderText(node: ASTNode): String {
        return when (node.elementType) {
            JenkinsfileTypes.BLOCK_COMMENT -> "/* ... */"
            JenkinsfileTypes.LBRACE -> {
                // Try to determine context from preceding text
                val context = getBlockContext(node.psi)
                when {
                    context.contains("pipeline") -> "pipeline {...}"
                    context.contains("stage") -> "stage {...}"
                    context.contains("steps") -> "steps {...}"
                    context.contains("post") -> "post {...}"
                    context.contains("agent") -> "agent {...}"
                    context.contains("environment") -> "environment {...}"
                    context.contains("when") -> "when {...}"
                    context.contains("script") -> "script {...}"
                    else -> "{...}"
                }
            }
            else -> "{...}"
        }
    }
    
    private fun getBlockContext(element: PsiElement): String {
        // Look at previous siblings to find keywords
        var current = element.prevSibling
        var lookupCount = 0
        
        while (current != null && lookupCount < 3) {
            val text = current.text?.trim()?.lowercase()
            if (text != null && text.isNotEmpty()) {
                if (text in setOf("pipeline", "stage", "steps", "post", "agent", "environment", "when", "script")) {
                    return text
                }
            }
            current = current.prevSibling
            lookupCount++
        }
        
        return ""
    }
    
    override fun isCollapsedByDefault(node: ASTNode): Boolean {
        // Only collapse block comments by default
        return node.elementType == JenkinsfileTypes.BLOCK_COMMENT
    }
}