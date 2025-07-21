package org.example.jenkinsfile_support.highlighting

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.example.jenkinsfile_support.lexer.JenkinsfileLexerAdapter
import org.example.jenkinsfile_support.psi.JenkinsfileTypes.*

/**
 * Syntax highlighter for Jenkinsfile language.
 */
class JenkinsfileSyntaxHighlighter : SyntaxHighlighterBase() {
    
    override fun getHighlightingLexer(): Lexer = JenkinsfileLexerAdapter()
    
    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return when (tokenType) {
            
            // Pipeline structure keywords
            KW_PIPELINE, KW_STAGE, KW_STAGES, KW_STEPS, KW_POST, KW_AGENT,
            KW_OPTIONS, KW_ENVIRONMENT, KW_PARAMETERS, KW_TRIGGERS, KW_TOOLS,
            KW_WHEN, KW_PARALLEL, KW_MATRIX, KW_INPUT, KW_SCRIPT, KW_LIBRARY -> {
                arrayOf(JenkinsfileColors.PIPELINE_KEYWORD)
            }
            
            // Agent types
            KW_ANY, KW_NONE, KW_LABEL, KW_NODE, KW_DOCKER, KW_DOCKERFILE, KW_KUBERNETES -> {
                arrayOf(JenkinsfileColors.AGENT_TYPE)
            }
            
            // Built-in steps
            KW_ECHO, KW_SH, KW_BAT, KW_POWERSHELL, KW_PWSH, KW_CHECKOUT, KW_GIT,
            KW_ARCHIVE_ARTIFACTS, KW_PUBLISH_TEST_RESULTS, KW_PUBLISH_HTML,
            KW_STASH, KW_UNSTASH, KW_BUILD, KW_RETRY, KW_TIMEOUT, KW_WAIT_UNTIL,
            KW_SLEEP, KW_DIR, KW_DELETE_DIR, KW_FILE_EXISTS, KW_READ_FILE, KW_WRITE_FILE -> {
                arrayOf(JenkinsfileColors.BUILTIN_STEP)
            }
            
            // Post conditions
            KW_ALWAYS, KW_CHANGED, KW_FIXED, KW_REGRESSION, KW_ABORTED,
            KW_FAILURE, KW_SUCCESS, KW_UNSTABLE, KW_UNSUCCESSFUL, KW_CLEANUP -> {
                arrayOf(JenkinsfileColors.POST_CONDITION)
            }
            
            // When conditions
            KW_BRANCH, KW_BUILDING_TAG, KW_CHANGELOG, KW_CHANGESET, KW_CHANGE_REQUEST,
            KW_EQUALS, KW_EXPRESSION, KW_TAG, KW_NOT, KW_ALL_OF, KW_ANY_OF -> {
                arrayOf(JenkinsfileColors.WHEN_CONDITION)
            }
            
            // Parameter types
            KW_STRING, KW_TEXT, KW_BOOLEAN_PARAM, KW_CHOICE, KW_PASSWORD -> {
                arrayOf(JenkinsfileColors.PARAMETER_TYPE)
            }
            
            // Trigger types
            KW_CRON, KW_POLL_SCM, KW_UPSTREAM -> {
                arrayOf(JenkinsfileColors.TRIGGER_TYPE)
            }
            
            // Credentials
            KW_WITH_CREDENTIALS, KW_USERNAME_PASSWORD, KW_SSH_USER_PRIVATE_KEY,
            KW_SECRET_FILE, KW_SECRET_TEXT -> {
                arrayOf(JenkinsfileColors.CREDENTIAL_TYPE)
            }
            
            // Groovy keywords
            KW_DEF, KW_RETURN, KW_IF, KW_ELSE, KW_FOR, KW_WHILE, KW_TRY, KW_CATCH,
            KW_FINALLY, KW_THROW, KW_SWITCH, KW_CASE, KW_DEFAULT, KW_BREAK, KW_CONTINUE,
            KW_CLASS, KW_INTERFACE, KW_IMPORT, KW_PACKAGE, KW_EXTENDS, KW_IMPLEMENTS,
            KW_STATIC, KW_FINAL, KW_PRIVATE, KW_PROTECTED, KW_PUBLIC, KW_ABSTRACT,
            KW_NEW, KW_THIS, KW_SUPER, KW_INSTANCEOF, KW_IN -> {
                arrayOf(JenkinsfileColors.GROOVY_KEYWORD)
            }
            
            // Boolean and null literals
            KW_TRUE, KW_FALSE -> {
                arrayOf(JenkinsfileColors.BOOLEAN_LITERAL)
            }
            
            KW_NULL -> {
                arrayOf(JenkinsfileColors.NULL_LITERAL)
            }
            
            // String literals
            STRING_LITERAL, SINGLE_QUOTED_STRING, MULTILINE_STRING, MULTILINE_SINGLE_STRING -> {
                arrayOf(JenkinsfileColors.STRING_LITERAL)
            }
            
            // GString (Groovy string interpolation)
            GSTRING -> {
                arrayOf(JenkinsfileColors.GSTRING)
            }
            
            // Numbers
            NUMBER -> {
                arrayOf(JenkinsfileColors.NUMBER)
            }
            
            // Comments
            LINE_COMMENT -> {
                arrayOf(JenkinsfileColors.COMMENT)
            }
            
            BLOCK_COMMENT -> {
                arrayOf(JenkinsfileColors.BLOCK_COMMENT)
            }
            
            // Operators
            ASSIGN, PLUS_ASSIGN, MINUS_ASSIGN, MULT_ASSIGN, DIV_ASSIGN, MOD_ASSIGN,
            PLUS, MINUS, MULT, DIV, MOD, POWER, EQ, NEQ, LT, LE, GT, GE,
            AND, OR, NOT, BIT_AND, BIT_OR, BIT_XOR, BIT_NOT, LSHIFT, RSHIFT, URSHIFT,
            ELVIS, SAFE_DOT, SPREAD, RANGE, SPACESHIP, REGEX_FIND, REGEX_MATCH -> {
                arrayOf(JenkinsfileColors.OPERATOR)
            }
            
            // Braces
            LBRACE, RBRACE -> {
                arrayOf(JenkinsfileColors.BRACES)
            }
            
            // Brackets
            LBRACKET, RBRACKET -> {
                arrayOf(JenkinsfileColors.BRACKETS)
            }
            
            // Parentheses
            LPAREN, RPAREN -> {
                arrayOf(JenkinsfileColors.PARENTHESES)
            }
            
            // Separators
            SEMICOLON, COMMA, DOT, COLON, QUESTION, AT, DOLLAR -> {
                arrayOf(JenkinsfileColors.SEPARATOR)
            }
            
            // Identifiers
            IDENTIFIER -> {
                arrayOf(JenkinsfileColors.IDENTIFIER)
            }
            
            // Special tokens that might not be defined yet
            KW_ARROW -> {
                arrayOf(JenkinsfileColors.OPERATOR)
            }
            
            KW_SCM -> {
                arrayOf(JenkinsfileColors.BUILTIN_STEP)
            }
            
            else -> emptyArray()
        }
    }
}