package org.example.jenkinsfile_support

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.example.jenkinsfile_support.lexer.JenkinsfileLexerAdapter
import org.example.jenkinsfile_support.parser.JenkinsfileParser
import org.example.jenkinsfile_support.psi.JenkinsfileFile
import org.example.jenkinsfile_support.psi.JenkinsfileTypes

/**
 * Parser definition for Jenkinsfile language.
 */
class JenkinsfileParserDefinition : ParserDefinition {
    
    companion object {
        val FILE = IFileElementType("JENKINSFILE_FILE", JenkinsfileLanguage)
        
        val STRING_LITERALS = TokenSet.create(
            JenkinsfileTypes.STRING_LITERAL,
            JenkinsfileTypes.SINGLE_QUOTED_STRING,
            JenkinsfileTypes.MULTILINE_STRING,
            JenkinsfileTypes.MULTILINE_SINGLE_STRING,
            JenkinsfileTypes.GSTRING
        )
        
        val COMMENTS = TokenSet.create(
            JenkinsfileTypes.LINE_COMMENT,
            JenkinsfileTypes.BLOCK_COMMENT
        )
        
        val WHITESPACES = TokenSet.create(
            JenkinsfileTypes.NEWLINE
        )
    }
    
    override fun createLexer(project: Project?): Lexer {
        return JenkinsfileLexerAdapter()
    }
    
    override fun createParser(project: Project?): PsiParser {
        return JenkinsfileParser()
    }
    
    override fun getFileNodeType(): IFileElementType {
        return FILE
    }
    
    override fun getStringLiteralElements(): TokenSet {
        return STRING_LITERALS
    }
    
    override fun getCommentTokens(): TokenSet {
        return COMMENTS
    }
    
    override fun getWhitespaceTokens(): TokenSet {
        return WHITESPACES
    }
    
    override fun createElement(node: ASTNode): PsiElement {
        return JenkinsfileTypes.Factory.createElement(node)
    }
    
    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return JenkinsfileFile(viewProvider)
    }
}