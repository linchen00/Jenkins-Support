package org.example.jenkinsfile_support.editor

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import org.example.jenkinsfile_support.psi.JenkinsfileTypes

/**
 * Brace matcher for Jenkinsfile language.
 * Provides matching for braces, brackets, and parentheses.
 */
class JenkinsfileBraceMatcher : PairedBraceMatcher {
    
    private val pairs = arrayOf(
        // Curly braces - for blocks
        BracePair(JenkinsfileTypes.LBRACE, JenkinsfileTypes.RBRACE, true),
        
        // Parentheses - for method calls, expressions, etc.
        BracePair(JenkinsfileTypes.LPAREN, JenkinsfileTypes.RPAREN, false),
        
        // Square brackets - for arrays, maps, etc.
        BracePair(JenkinsfileTypes.LBRACKET, JenkinsfileTypes.RBRACKET, false)
    )
    
    override fun getPairs(): Array<BracePair> = pairs
    
    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?): Boolean {
        // Allow paired braces before most token types
        return when (contextType) {
            // Don't show matching brace within comments
            JenkinsfileTypes.LINE_COMMENT,
            JenkinsfileTypes.BLOCK_COMMENT -> false
            
            // Don't show matching brace within string literals
            JenkinsfileTypes.STRING_LITERAL,
            JenkinsfileTypes.SINGLE_QUOTED_STRING,
            JenkinsfileTypes.MULTILINE_STRING,
            JenkinsfileTypes.MULTILINE_SINGLE_STRING,
            JenkinsfileTypes.GSTRING -> false
            
            // Allow for all other contexts
            else -> true
        }
    }
    
    override fun getCodeConstructStart(file: PsiFile, openingBraceOffset: Int): Int {
        // Return the start of the code construct containing the opening brace
        val element = file.findElementAt(openingBraceOffset)
        
        // For blocks, try to find the start of the block declaration
        element?.parent?.let { parent ->
            // For pipeline, stage, steps, etc. blocks, return the start of the keyword
            return parent.textRange.startOffset
        }
        
        // Default to the opening brace position
        return openingBraceOffset
    }
}