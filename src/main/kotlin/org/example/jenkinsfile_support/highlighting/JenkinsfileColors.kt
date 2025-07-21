package org.example.jenkinsfile_support.highlighting

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors

/**
 * Defines color attributes for Jenkinsfile syntax highlighting.
 */
object JenkinsfileColors {
    
    // Pipeline structure keywords
    val PIPELINE_KEYWORD = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_PIPELINE_KEYWORD",
        DefaultLanguageHighlighterColors.KEYWORD
    )
    
    // Agent types
    val AGENT_TYPE = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_AGENT_TYPE", 
        DefaultLanguageHighlighterColors.CONSTANT
    )
    
    // Built-in steps
    val BUILTIN_STEP = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_BUILTIN_STEP",
        DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL
    )
    
    // Post conditions
    val POST_CONDITION = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_POST_CONDITION",
        DefaultLanguageHighlighterColors.STATIC_METHOD
    )
    
    // When conditions
    val WHEN_CONDITION = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_WHEN_CONDITION",
        DefaultLanguageHighlighterColors.INSTANCE_METHOD
    )
    
    // Parameter types
    val PARAMETER_TYPE = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_PARAMETER_TYPE",
        DefaultLanguageHighlighterColors.CLASS_NAME
    )
    
    // Trigger types  
    val TRIGGER_TYPE = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_TRIGGER_TYPE",
        DefaultLanguageHighlighterColors.INTERFACE_NAME
    )
    
    // Credentials
    val CREDENTIAL_TYPE = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_CREDENTIAL_TYPE",
        DefaultLanguageHighlighterColors.STATIC_FIELD
    )
    
    // Groovy keywords
    val GROOVY_KEYWORD = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_GROOVY_KEYWORD",
        DefaultLanguageHighlighterColors.KEYWORD
    )
    
    // Literals
    val STRING_LITERAL = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_STRING_LITERAL",
        DefaultLanguageHighlighterColors.STRING
    )
    
    val GSTRING = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_GSTRING",
        DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE
    )
    
    val NUMBER = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_NUMBER",
        DefaultLanguageHighlighterColors.NUMBER
    )
    
    val BOOLEAN_LITERAL = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_BOOLEAN",
        DefaultLanguageHighlighterColors.KEYWORD
    )
    
    val NULL_LITERAL = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_NULL",
        DefaultLanguageHighlighterColors.KEYWORD
    )
    
    // Comments
    val COMMENT = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_COMMENT",
        DefaultLanguageHighlighterColors.LINE_COMMENT
    )
    
    val BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_BLOCK_COMMENT", 
        DefaultLanguageHighlighterColors.BLOCK_COMMENT
    )
    
    // Operators
    val OPERATOR = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_OPERATOR",
        DefaultLanguageHighlighterColors.OPERATION_SIGN
    )
    
    // Separators and delimiters
    val SEPARATOR = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_SEPARATOR",
        DefaultLanguageHighlighterColors.SEMICOLON
    )
    
    val BRACES = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_BRACES",
        DefaultLanguageHighlighterColors.BRACES
    )
    
    val BRACKETS = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_BRACKETS",
        DefaultLanguageHighlighterColors.BRACKETS
    )
    
    val PARENTHESES = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_PARENTHESES",
        DefaultLanguageHighlighterColors.PARENTHESES
    )
    
    // Identifiers
    val IDENTIFIER = TextAttributesKey.createTextAttributesKey(
        "JENKINSFILE_IDENTIFIER",
        DefaultLanguageHighlighterColors.IDENTIFIER
    )
}