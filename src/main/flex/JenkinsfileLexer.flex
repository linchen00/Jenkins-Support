package org.example.jenkinsfile_support.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static org.example.jenkinsfile_support.psi.JenkinsfileTypes.*;

%%

%class JenkinsfileLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{
  return;
%eof}

// Whitespace
WHITE_SPACE = [ \t\f]+
NEWLINE = \r?\n

// Comments
LINE_COMMENT = "//"[^\r\n]*
BLOCK_COMMENT = "/*"([^*]|\*[^/])*"*/"

// String literals
STRING_LITERAL = \"([^\"\\\r\n]|\\.)*\"
SINGLE_QUOTED_STRING = '([^'\\\r\n]|\\.)*'
MULTILINE_STRING = \"\"\"([^\"]|\"[^\"]|\"\"[^\"])*\"\"\"
MULTILINE_SINGLE_STRING = '''([^']|'[^']|''[^'])*'''

// Numbers
NUMBER = [0-9]+(\.[0-9]+)?

// Identifiers
IDENTIFIER = [a-zA-Z_][a-zA-Z0-9_]*

%%

// Keywords - Pipeline structure
"pipeline"          { return KW_PIPELINE; }
"agent"             { return KW_AGENT; }
"stages"            { return KW_STAGES; }
"stage"             { return KW_STAGE; }
"steps"             { return KW_STEPS; }
"post"              { return KW_POST; }
"options"           { return KW_OPTIONS; }
"environment"       { return KW_ENVIRONMENT; }
"parameters"        { return KW_PARAMETERS; }
"triggers"          { return KW_TRIGGERS; }
"tools"             { return KW_TOOLS; }
"when"              { return KW_WHEN; }
"parallel"          { return KW_PARALLEL; }
"matrix"            { return KW_MATRIX; }
"input"             { return KW_INPUT; }
"script"            { return KW_SCRIPT; }

// Post conditions
"always"            { return KW_ALWAYS; }
"changed"           { return KW_CHANGED; }
"fixed"             { return KW_FIXED; }
"regression"        { return KW_REGRESSION; }
"aborted"           { return KW_ABORTED; }
"failure"           { return KW_FAILURE; }
"success"           { return KW_SUCCESS; }
"unstable"          { return KW_UNSTABLE; }
"unsuccessful"      { return KW_UNSUCCESSFUL; }
"cleanup"           { return KW_CLEANUP; }

// Agent types
"any"               { return KW_ANY; }
"none"              { return KW_NONE; }
"label"             { return KW_LABEL; }
"node"              { return KW_NODE; }
"docker"            { return KW_DOCKER; }
"dockerfile"        { return KW_DOCKERFILE; }
"kubernetes"        { return KW_KUBERNETES; }

// When conditions
"branch"            { return KW_BRANCH; }
"buildingTag"       { return KW_BUILDING_TAG; }
"changelog"         { return KW_CHANGELOG; }
"changeset"         { return KW_CHANGESET; }
"changeRequest"     { return KW_CHANGE_REQUEST; }
"equals"            { return KW_EQUALS; }
"expression"        { return KW_EXPRESSION; }
"tag"               { return KW_TAG; }
"not"               { return KW_NOT; }
"allOf"             { return KW_ALL_OF; }
"anyOf"             { return KW_ANY_OF; }

// Parameter types
"string"            { return KW_STRING; }
"text"              { return KW_TEXT; }
"booleanParam"      { return KW_BOOLEAN_PARAM; }
"choice"            { return KW_CHOICE; }
"password"          { return KW_PASSWORD; }

// Trigger types
"cron"              { return KW_CRON; }
"pollSCM"           { return KW_POLL_SCM; }
"upstream"          { return KW_UPSTREAM; }

// Built-in steps
"echo"              { return KW_ECHO; }
"sh"                { return KW_SH; }
"bat"               { return KW_BAT; }
"powershell"        { return KW_POWERSHELL; }
"pwsh"              { return KW_PWSH; }
"checkout"          { return KW_CHECKOUT; }
"git"               { return KW_GIT; }
"archiveArtifacts"  { return KW_ARCHIVE_ARTIFACTS; }
"publishTestResults" { return KW_PUBLISH_TEST_RESULTS; }
"publishHTML"       { return KW_PUBLISH_HTML; }
"stash"             { return KW_STASH; }
"unstash"           { return KW_UNSTASH; }
"build"             { return KW_BUILD; }
"retry"             { return KW_RETRY; }
"timeout"           { return KW_TIMEOUT; }
"waitUntil"         { return KW_WAIT_UNTIL; }
"sleep"             { return KW_SLEEP; }
"dir"               { return KW_DIR; }
"deleteDir"         { return KW_DELETE_DIR; }
"fileExists"        { return KW_FILE_EXISTS; }
"readFile"          { return KW_READ_FILE; }
"writeFile"         { return KW_WRITE_FILE; }

// Credentials
"withCredentials"   { return KW_WITH_CREDENTIALS; }
"usernamePassword"  { return KW_USERNAME_PASSWORD; }
"sshUserPrivateKey" { return KW_SSH_USER_PRIVATE_KEY; }
"secretFile"        { return KW_SECRET_FILE; }
"secretText"        { return KW_SECRET_TEXT; }

// Additional keywords
"library"           { return KW_LIBRARY; }
"scm"               { return KW_SCM; }
"instanceof"        { return KW_INSTANCEOF; }
"in"                { return KW_IN; }

// Groovy keywords
"def"               { return KW_DEF; }
"return"            { return KW_RETURN; }
"if"                { return KW_IF; }
"else"              { return KW_ELSE; }
"for"               { return KW_FOR; }
"while"             { return KW_WHILE; }
"try"               { return KW_TRY; }
"catch"             { return KW_CATCH; }
"finally"           { return KW_FINALLY; }
"throw"             { return KW_THROW; }
"switch"            { return KW_SWITCH; }
"case"              { return KW_CASE; }
"default"           { return KW_DEFAULT; }
"break"             { return KW_BREAK; }
"continue"          { return KW_CONTINUE; }
"class"             { return KW_CLASS; }
"interface"         { return KW_INTERFACE; }
"import"            { return KW_IMPORT; }
"package"           { return KW_PACKAGE; }
"extends"           { return KW_EXTENDS; }
"implements"        { return KW_IMPLEMENTS; }
"static"            { return KW_STATIC; }
"final"             { return KW_FINAL; }
"private"           { return KW_PRIVATE; }
"protected"         { return KW_PROTECTED; }
"public"            { return KW_PUBLIC; }
"abstract"          { return KW_ABSTRACT; }
"new"               { return KW_NEW; }
"this"              { return KW_THIS; }
"super"             { return KW_SUPER; }
"null"              { return KW_NULL; }
"true"              { return KW_TRUE; }
"false"             { return KW_FALSE; }

// Multi-character operators
"+="                { return PLUS_ASSIGN; }
"-="                { return MINUS_ASSIGN; }
"*="                { return MULT_ASSIGN; }
"/="                { return DIV_ASSIGN; }
"%="                { return MOD_ASSIGN; }
"**"                { return POWER; }
"=="                { return EQ; }
"!="                { return NEQ; }
"<="                { return LE; }
">="                { return GE; }
"&&"                { return AND; }
"||"                { return OR; }
"<<"                { return LSHIFT; }
">>"                { return RSHIFT; }
">>>"               { return URSHIFT; }
"?:"                { return ELVIS; }
"?."                { return SAFE_DOT; }
"*."                { return SPREAD; }
".."                { return RANGE; }
"<=>"               { return SPACESHIP; }
"=~"                { return REGEX_FIND; }
"==~"               { return REGEX_MATCH; }
"->"                { return KW_ARROW; }

// Single character tokens
"{"                 { return LBRACE; }
"}"                 { return RBRACE; }
"("                 { return LPAREN; }
")"                 { return RPAREN; }
"["                 { return LBRACKET; }
"]"                 { return RBRACKET; }
";"                 { return SEMICOLON; }
","                 { return COMMA; }
"."                 { return DOT; }
":"                 { return COLON; }
"?"                 { return QUESTION; }
"@"                 { return AT; }
"$"                 { return DOLLAR; }
"+"                 { return PLUS; }
"-"                 { return MINUS; }
"*"                 { return MULT; }
"/"                 { return DIV; }
"%"                 { return MOD; }
"="                 { return ASSIGN; }
"!"                 { return NOT; }
"&"                 { return BIT_AND; }
"|"                 { return BIT_OR; }
"^"                 { return BIT_XOR; }
"~"                 { return BIT_NOT; }
"<"                 { return LT; }
">"                 { return GT; }

// Literals
{STRING_LITERAL}    { return STRING_LITERAL; }
{SINGLE_QUOTED_STRING} { return SINGLE_QUOTED_STRING; }
{MULTILINE_STRING}  { return MULTILINE_STRING; }
{MULTILINE_SINGLE_STRING} { return MULTILINE_SINGLE_STRING; }
{NUMBER}            { return NUMBER; }
{IDENTIFIER}        { return IDENTIFIER; }

// Comments
{LINE_COMMENT}      { return LINE_COMMENT; }
{BLOCK_COMMENT}     { return BLOCK_COMMENT; }

// Whitespace and newlines
{NEWLINE}           { return NEWLINE; }
{WHITE_SPACE}       { /* skip whitespace */ }

// Any other character - just skip it for now
.                   { /* skip unknown characters */ }