// This is a generated file. Not intended for manual editing.
package org.example.jenkinsfile_support.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.example.jenkinsfile_support.psi.JenkinsfileTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class JenkinsfileParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return jenkinsfile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // multiplicative_expression ((PLUS | MINUS) multiplicative_expression)*
  public static boolean additive_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ADDITIVE_EXPRESSION, "<additive expression>");
    result_ = multiplicative_expression(builder_, level_ + 1);
    result_ = result_ && additive_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ((PLUS | MINUS) multiplicative_expression)*
  private static boolean additive_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_expression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!additive_expression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "additive_expression_1", pos_)) break;
    }
    return true;
  }

  // (PLUS | MINUS) multiplicative_expression
  private static boolean additive_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = additive_expression_1_0_0(builder_, level_ + 1);
    result_ = result_ && multiplicative_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PLUS | MINUS
  private static boolean additive_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_expression_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    return result_;
  }

  /* ********************************************************** */
  // KW_AGENT agent_spec
  public static boolean agent_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "agent_block")) return false;
    if (!nextTokenIs(builder_, KW_AGENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_AGENT);
    result_ = result_ && agent_spec(builder_, level_ + 1);
    exit_section_(builder_, marker_, AGENT_BLOCK, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_LABEL COLON string_expression
  //                | KW_NODE COLON string_expression
  //                | KW_DOCKER COLON docker_spec
  //                | KW_DOCKERFILE COLON dockerfile_spec
  //                | KW_KUBERNETES COLON kubernetes_spec
  public static boolean agent_content(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "agent_content")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, AGENT_CONTENT, "<agent content>");
    result_ = agent_content_0(builder_, level_ + 1);
    if (!result_) result_ = agent_content_1(builder_, level_ + 1);
    if (!result_) result_ = agent_content_2(builder_, level_ + 1);
    if (!result_) result_ = agent_content_3(builder_, level_ + 1);
    if (!result_) result_ = agent_content_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // KW_LABEL COLON string_expression
  private static boolean agent_content_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "agent_content_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_LABEL, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_NODE COLON string_expression
  private static boolean agent_content_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "agent_content_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_NODE, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_DOCKER COLON docker_spec
  private static boolean agent_content_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "agent_content_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_DOCKER, COLON);
    result_ = result_ && docker_spec(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_DOCKERFILE COLON dockerfile_spec
  private static boolean agent_content_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "agent_content_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_DOCKERFILE, COLON);
    result_ = result_ && dockerfile_spec(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_KUBERNETES COLON kubernetes_spec
  private static boolean agent_content_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "agent_content_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_KUBERNETES, COLON);
    result_ = result_ && kubernetes_spec(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_ANY | KW_NONE | KW_LABEL string_expression | KW_NODE string_expression
  public static boolean agent_simple(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "agent_simple")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, AGENT_SIMPLE, "<agent simple>");
    result_ = consumeToken(builder_, KW_ANY);
    if (!result_) result_ = consumeToken(builder_, KW_NONE);
    if (!result_) result_ = agent_simple_2(builder_, level_ + 1);
    if (!result_) result_ = agent_simple_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // KW_LABEL string_expression
  private static boolean agent_simple_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "agent_simple_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_LABEL);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_NODE string_expression
  private static boolean agent_simple_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "agent_simple_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_NODE);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE agent_content* RBRACE
  //             | agent_simple
  public static boolean agent_spec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "agent_spec")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, AGENT_SPEC, "<agent spec>");
    result_ = agent_spec_0(builder_, level_ + 1);
    if (!result_) result_ = agent_simple(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LBRACE agent_content* RBRACE
  private static boolean agent_spec_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "agent_spec_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && agent_spec_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // agent_content*
  private static boolean agent_spec_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "agent_spec_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!agent_content(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "agent_spec_0_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // equality_expression (BIT_AND equality_expression)*
  public static boolean and_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "and_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, AND_EXPRESSION, "<and expression>");
    result_ = equality_expression(builder_, level_ + 1);
    result_ = result_ && and_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (BIT_AND equality_expression)*
  private static boolean and_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "and_expression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!and_expression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "and_expression_1", pos_)) break;
    }
    return true;
  }

  // BIT_AND equality_expression
  private static boolean and_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "and_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BIT_AND);
    result_ = result_ && equality_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expression (COMMA expression)*
  public static boolean argument_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARGUMENT_LIST, "<argument list>");
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && argument_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (COMMA expression)*
  private static boolean argument_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_list_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!argument_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "argument_list_1", pos_)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean argument_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argument_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACKET expression_list? RBRACKET
  public static boolean array_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_literal")) return false;
    if (!nextTokenIs(builder_, LBRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && array_literal_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, ARRAY_LITERAL, result_);
    return result_;
  }

  // expression_list?
  private static boolean array_literal_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_literal_1")) return false;
    expression_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER assignment_operator expression
  public static boolean assignment_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_expression")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && assignment_operator(builder_, level_ + 1);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, ASSIGNMENT_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | MULT_ASSIGN | DIV_ASSIGN | MOD_ASSIGN
  public static boolean assignment_operator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignment_operator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASSIGNMENT_OPERATOR, "<assignment operator>");
    result_ = consumeToken(builder_, ASSIGN);
    if (!result_) result_ = consumeToken(builder_, PLUS_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, MINUS_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, MULT_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, DIV_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, MOD_ASSIGN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // axes LBRACE axis_definition* RBRACE
  public static boolean axes_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "axes_block")) return false;
    if (!nextTokenIs(builder_, AXES)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, AXES, LBRACE);
    result_ = result_ && axes_block_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, AXES_BLOCK, result_);
    return result_;
  }

  // axis_definition*
  private static boolean axes_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "axes_block_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!axis_definition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "axes_block_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER LBRACKET string_list RBRACKET
  public static boolean axis_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "axis_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, LBRACKET);
    result_ = result_ && string_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, AXIS_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER string_expression
  public static boolean axis_value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "axis_value")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, AXIS_VALUE, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE statement* RBRACE
  public static boolean block_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_statement")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && block_statement_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, BLOCK_STATEMENT, result_);
    return result_;
  }

  // statement*
  private static boolean block_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block_statement_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "block_statement_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // boolean_literal | expression
  public static boolean boolean_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "boolean_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BOOLEAN_EXPRESSION, "<boolean expression>");
    result_ = boolean_literal(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KW_TRUE | KW_FALSE
  public static boolean boolean_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "boolean_literal")) return false;
    if (!nextTokenIs(builder_, "<boolean literal>", KW_FALSE, KW_TRUE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BOOLEAN_LITERAL, "<boolean literal>");
    result_ = consumeToken(builder_, KW_TRUE);
    if (!result_) result_ = consumeToken(builder_, KW_FALSE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KW_BREAK SEMICOLON?
  public static boolean break_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "break_statement")) return false;
    if (!nextTokenIs(builder_, KW_BREAK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_BREAK);
    result_ = result_ && break_statement_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, BREAK_STATEMENT, result_);
    return result_;
  }

  // SEMICOLON?
  private static boolean break_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "break_statement_1")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER LPAREN log_rotator_options RPAREN
  public static boolean build_discarder_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "build_discarder_params")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, LPAREN);
    result_ = result_ && log_rotator_options(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, BUILD_DISCARDER_PARAMS, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON string_expression
  //                | IDENTIFIER COLON parameter_array
  //                | IDENTIFIER COLON boolean_expression
  public static boolean build_options(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "build_options")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = build_options_0(builder_, level_ + 1);
    if (!result_) result_ = build_options_1(builder_, level_ + 1);
    if (!result_) result_ = build_options_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, BUILD_OPTIONS, result_);
    return result_;
  }

  // IDENTIFIER COLON string_expression
  private static boolean build_options_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "build_options_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER COLON parameter_array
  private static boolean build_options_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "build_options_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && parameter_array(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER COLON boolean_expression
  private static boolean build_options_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "build_options_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && boolean_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE build_options* RBRACE
  public static boolean build_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "build_params")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && build_params_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, BUILD_PARAMS, result_);
    return result_;
  }

  // build_options*
  private static boolean build_params_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "build_params_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!build_options(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "build_params_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_ECHO LPAREN string_expression RPAREN
  //               | KW_SH LPAREN sh_params RPAREN
  //               | KW_BAT LPAREN string_expression RPAREN
  //               | KW_POWERSHELL LPAREN string_expression RPAREN
  //               | KW_PWSH LPAREN string_expression RPAREN
  //               | KW_CHECKOUT LPAREN scm_expression RPAREN
  //               | KW_GIT LPAREN git_params RPAREN
  //               | KW_ARCHIVE_ARTIFACTS LPAREN string_expression RPAREN
  //               | KW_PUBLISH_TEST_RESULTS LPAREN test_params RPAREN
  //               | KW_STASH LPAREN stash_params RPAREN
  //               | KW_UNSTASH LPAREN string_expression RPAREN
  //               | KW_BUILD LPAREN build_params RPAREN
  //               | KW_SLEEP LPAREN time_params RPAREN
  //               | KW_DELETE_DIR LPAREN RPAREN
  public static boolean builtin_step(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_step")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BUILTIN_STEP, "<builtin step>");
    result_ = builtin_step_0(builder_, level_ + 1);
    if (!result_) result_ = builtin_step_1(builder_, level_ + 1);
    if (!result_) result_ = builtin_step_2(builder_, level_ + 1);
    if (!result_) result_ = builtin_step_3(builder_, level_ + 1);
    if (!result_) result_ = builtin_step_4(builder_, level_ + 1);
    if (!result_) result_ = builtin_step_5(builder_, level_ + 1);
    if (!result_) result_ = builtin_step_6(builder_, level_ + 1);
    if (!result_) result_ = builtin_step_7(builder_, level_ + 1);
    if (!result_) result_ = builtin_step_8(builder_, level_ + 1);
    if (!result_) result_ = builtin_step_9(builder_, level_ + 1);
    if (!result_) result_ = builtin_step_10(builder_, level_ + 1);
    if (!result_) result_ = builtin_step_11(builder_, level_ + 1);
    if (!result_) result_ = builtin_step_12(builder_, level_ + 1);
    if (!result_) result_ = parseTokens(builder_, 0, KW_DELETE_DIR, LPAREN, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // KW_ECHO LPAREN string_expression RPAREN
  private static boolean builtin_step_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_step_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_ECHO, LPAREN);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_SH LPAREN sh_params RPAREN
  private static boolean builtin_step_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_step_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_SH, LPAREN);
    result_ = result_ && sh_params(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_BAT LPAREN string_expression RPAREN
  private static boolean builtin_step_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_step_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_BAT, LPAREN);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_POWERSHELL LPAREN string_expression RPAREN
  private static boolean builtin_step_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_step_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_POWERSHELL, LPAREN);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_PWSH LPAREN string_expression RPAREN
  private static boolean builtin_step_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_step_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_PWSH, LPAREN);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_CHECKOUT LPAREN scm_expression RPAREN
  private static boolean builtin_step_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_step_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_CHECKOUT, LPAREN);
    result_ = result_ && scm_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_GIT LPAREN git_params RPAREN
  private static boolean builtin_step_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_step_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_GIT, LPAREN);
    result_ = result_ && git_params(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_ARCHIVE_ARTIFACTS LPAREN string_expression RPAREN
  private static boolean builtin_step_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_step_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_ARCHIVE_ARTIFACTS, LPAREN);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_PUBLISH_TEST_RESULTS LPAREN test_params RPAREN
  private static boolean builtin_step_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_step_8")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_PUBLISH_TEST_RESULTS, LPAREN);
    result_ = result_ && test_params(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_STASH LPAREN stash_params RPAREN
  private static boolean builtin_step_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_step_9")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_STASH, LPAREN);
    result_ = result_ && stash_params(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_UNSTASH LPAREN string_expression RPAREN
  private static boolean builtin_step_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_step_10")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_UNSTASH, LPAREN);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_BUILD LPAREN build_params RPAREN
  private static boolean builtin_step_11(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_step_11")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_BUILD, LPAREN);
    result_ = result_ && build_params(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_SLEEP LPAREN time_params RPAREN
  private static boolean builtin_step_12(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_step_12")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_SLEEP, LPAREN);
    result_ = result_ && time_params(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_CASE expression COLON statement*
  public static boolean case_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_statement")) return false;
    if (!nextTokenIs(builder_, KW_CASE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_CASE);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && case_statement_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, CASE_STATEMENT, result_);
    return result_;
  }

  // statement*
  private static boolean case_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "case_statement_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "case_statement_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_CATCH LPAREN parameter RPAREN block_statement
  public static boolean catch_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "catch_clause")) return false;
    if (!nextTokenIs(builder_, KW_CATCH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_CATCH, LPAREN);
    result_ = result_ && parameter(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && block_statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, CATCH_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // field_declaration | method_declaration | constructor_declaration
  public static boolean class_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_BODY, "<class body>");
    result_ = field_declaration(builder_, level_ + 1);
    if (!result_) result_ = method_declaration(builder_, level_ + 1);
    if (!result_) result_ = constructor_declaration(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KW_CLASS IDENTIFIER (KW_EXTENDS IDENTIFIER)? (KW_IMPLEMENTS identifier_list)? LBRACE class_body* RBRACE
  public static boolean class_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration")) return false;
    if (!nextTokenIs(builder_, KW_CLASS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_CLASS, IDENTIFIER);
    result_ = result_ && class_declaration_2(builder_, level_ + 1);
    result_ = result_ && class_declaration_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LBRACE);
    result_ = result_ && class_declaration_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, CLASS_DECLARATION, result_);
    return result_;
  }

  // (KW_EXTENDS IDENTIFIER)?
  private static boolean class_declaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_2")) return false;
    class_declaration_2_0(builder_, level_ + 1);
    return true;
  }

  // KW_EXTENDS IDENTIFIER
  private static boolean class_declaration_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_EXTENDS, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (KW_IMPLEMENTS identifier_list)?
  private static boolean class_declaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_3")) return false;
    class_declaration_3_0(builder_, level_ + 1);
    return true;
  }

  // KW_IMPLEMENTS identifier_list
  private static boolean class_declaration_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_IMPLEMENTS);
    result_ = result_ && identifier_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // class_body*
  private static boolean class_declaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_declaration_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!class_body(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "class_declaration_5", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // statement*
  public static boolean closure_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_body")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLOSURE_BODY, "<closure body>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "closure_body", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // LBRACE closure_parameters? closure_body RBRACE
  public static boolean closure_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_expression")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && closure_expression_1(builder_, level_ + 1);
    result_ = result_ && closure_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, CLOSURE_EXPRESSION, result_);
    return result_;
  }

  // closure_parameters?
  private static boolean closure_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_expression_1")) return false;
    closure_parameters(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // parameter_list? KW_ARROW
  public static boolean closure_parameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_parameters")) return false;
    if (!nextTokenIs(builder_, "<closure parameters>", IDENTIFIER, KW_ARROW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLOSURE_PARAMETERS, "<closure parameters>");
    result_ = closure_parameters_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, KW_ARROW);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // parameter_list?
  private static boolean closure_parameters_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_parameters_0")) return false;
    parameter_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // logical_or_expression (QUESTION expression COLON conditional_expression)?
  public static boolean conditional_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONDITIONAL_EXPRESSION, "<conditional expression>");
    result_ = logical_or_expression(builder_, level_ + 1);
    result_ = result_ && conditional_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (QUESTION expression COLON conditional_expression)?
  private static boolean conditional_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_expression_1")) return false;
    conditional_expression_1_0(builder_, level_ + 1);
    return true;
  }

  // QUESTION expression COLON conditional_expression
  private static boolean conditional_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditional_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, QUESTION);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && conditional_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // modifier* IDENTIFIER LPAREN parameter_list? RPAREN block_statement
  public static boolean constructor_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constructor_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONSTRUCTOR_DECLARATION, "<constructor declaration>");
    result_ = constructor_declaration_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, IDENTIFIER, LPAREN);
    result_ = result_ && constructor_declaration_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && block_statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // modifier*
  private static boolean constructor_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constructor_declaration_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!modifier(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "constructor_declaration_0", pos_)) break;
    }
    return true;
  }

  // parameter_list?
  private static boolean constructor_declaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constructor_declaration_3")) return false;
    parameter_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_CONTINUE SEMICOLON?
  public static boolean continue_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "continue_statement")) return false;
    if (!nextTokenIs(builder_, KW_CONTINUE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_CONTINUE);
    result_ = result_ && continue_statement_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, CONTINUE_STATEMENT, result_);
    return result_;
  }

  // SEMICOLON?
  private static boolean continue_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "continue_statement_1")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // if_statement
  //                    | for_statement
  //                    | while_statement
  //                    | switch_statement
  //                    | break_statement
  //                    | continue_statement
  public static boolean control_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "control_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONTROL_STATEMENT, "<control statement>");
    result_ = if_statement(builder_, level_ + 1);
    if (!result_) result_ = for_statement(builder_, level_ + 1);
    if (!result_) result_ = while_statement(builder_, level_ + 1);
    if (!result_) result_ = switch_statement(builder_, level_ + 1);
    if (!result_) result_ = break_statement(builder_, level_ + 1);
    if (!result_) result_ = continue_statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KW_USERNAME_PASSWORD LPAREN credential_params RPAREN
  //                     | KW_SSH_USER_PRIVATE_KEY LPAREN ssh_params RPAREN
  //                     | KW_SECRET_FILE LPAREN secret_file_params RPAREN
  //                     | KW_SECRET_TEXT LPAREN secret_text_params RPAREN
  public static boolean credential_binding(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "credential_binding")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CREDENTIAL_BINDING, "<credential binding>");
    result_ = credential_binding_0(builder_, level_ + 1);
    if (!result_) result_ = credential_binding_1(builder_, level_ + 1);
    if (!result_) result_ = credential_binding_2(builder_, level_ + 1);
    if (!result_) result_ = credential_binding_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // KW_USERNAME_PASSWORD LPAREN credential_params RPAREN
  private static boolean credential_binding_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "credential_binding_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_USERNAME_PASSWORD, LPAREN);
    result_ = result_ && credential_params(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_SSH_USER_PRIVATE_KEY LPAREN ssh_params RPAREN
  private static boolean credential_binding_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "credential_binding_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_SSH_USER_PRIVATE_KEY, LPAREN);
    result_ = result_ && ssh_params(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_SECRET_FILE LPAREN secret_file_params RPAREN
  private static boolean credential_binding_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "credential_binding_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_SECRET_FILE, LPAREN);
    result_ = result_ && secret_file_params(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_SECRET_TEXT LPAREN secret_text_params RPAREN
  private static boolean credential_binding_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "credential_binding_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_SECRET_TEXT, LPAREN);
    result_ = result_ && secret_text_params(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACKET credential_binding (COMMA credential_binding)* RBRACKET
  public static boolean credential_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "credential_list")) return false;
    if (!nextTokenIs(builder_, LBRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && credential_binding(builder_, level_ + 1);
    result_ = result_ && credential_list_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, CREDENTIAL_LIST, result_);
    return result_;
  }

  // (COMMA credential_binding)*
  private static boolean credential_list_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "credential_list_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!credential_list_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "credential_list_2", pos_)) break;
    }
    return true;
  }

  // COMMA credential_binding
  private static boolean credential_list_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "credential_list_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && credential_binding(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE IDENTIFIER COLON string_expression COMMA IDENTIFIER COLON string_expression COMMA IDENTIFIER COLON string_expression RBRACE
  public static boolean credential_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "credential_params")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LBRACE, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMA, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMA, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, CREDENTIAL_PARAMS, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable_declaration
  //              | function_declaration
  //              | class_declaration
  public static boolean declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DECLARATION, "<declaration>");
    result_ = variable_declaration(builder_, level_ + 1);
    if (!result_) result_ = function_declaration(builder_, level_ + 1);
    if (!result_) result_ = class_declaration(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KW_DEFAULT COLON statement*
  public static boolean default_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "default_statement")) return false;
    if (!nextTokenIs(builder_, KW_DEFAULT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_DEFAULT, COLON);
    result_ = result_ && default_statement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, DEFAULT_STATEMENT, result_);
    return result_;
  }

  // statement*
  private static boolean default_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "default_statement_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "default_statement_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_DIR LPAREN string_expression RPAREN LBRACE step* RBRACE
  public static boolean dir_step(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dir_step")) return false;
    if (!nextTokenIs(builder_, KW_DIR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_DIR, LPAREN);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, LBRACE);
    result_ = result_ && dir_step_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, DIR_STEP, result_);
    return result_;
  }

  // step*
  private static boolean dir_step_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dir_step_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!step(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "dir_step_5", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON string_expression
  //                 | IDENTIFIER COLON boolean_expression
  public static boolean docker_options(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "docker_options")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = docker_options_0(builder_, level_ + 1);
    if (!result_) result_ = docker_options_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, DOCKER_OPTIONS, result_);
    return result_;
  }

  // IDENTIFIER COLON string_expression
  private static boolean docker_options_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "docker_options_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER COLON boolean_expression
  private static boolean docker_options_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "docker_options_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && boolean_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // string_expression
  //              | LBRACE docker_options* RBRACE
  public static boolean docker_spec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "docker_spec")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DOCKER_SPEC, "<docker spec>");
    result_ = string_expression(builder_, level_ + 1);
    if (!result_) result_ = docker_spec_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LBRACE docker_options* RBRACE
  private static boolean docker_spec_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "docker_spec_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && docker_spec_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // docker_options*
  private static boolean docker_spec_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "docker_spec_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!docker_options(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "docker_spec_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON string_expression
  public static boolean dockerfile_options(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dockerfile_options")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, DOCKERFILE_OPTIONS, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE dockerfile_options* RBRACE
  public static boolean dockerfile_spec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dockerfile_spec")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && dockerfile_spec_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, DOCKERFILE_SPEC, result_);
    return result_;
  }

  // dockerfile_options*
  private static boolean dockerfile_spec_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dockerfile_spec_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!dockerfile_options(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "dockerfile_spec_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_ENVIRONMENT LBRACE environment_variable* RBRACE
  public static boolean environment_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "environment_block")) return false;
    if (!nextTokenIs(builder_, KW_ENVIRONMENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_ENVIRONMENT, LBRACE);
    result_ = result_ && environment_block_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, ENVIRONMENT_BLOCK, result_);
    return result_;
  }

  // environment_variable*
  private static boolean environment_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "environment_block_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!environment_variable(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "environment_block_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER ASSIGN expression
  public static boolean environment_variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "environment_variable")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, ASSIGN);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, ENVIRONMENT_VARIABLE, result_);
    return result_;
  }

  /* ********************************************************** */
  // relational_expression ((EQ | NEQ | REGEX_FIND | REGEX_MATCH) relational_expression)*
  public static boolean equality_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equality_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EQUALITY_EXPRESSION, "<equality expression>");
    result_ = relational_expression(builder_, level_ + 1);
    result_ = result_ && equality_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ((EQ | NEQ | REGEX_FIND | REGEX_MATCH) relational_expression)*
  private static boolean equality_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equality_expression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!equality_expression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "equality_expression_1", pos_)) break;
    }
    return true;
  }

  // (EQ | NEQ | REGEX_FIND | REGEX_MATCH) relational_expression
  private static boolean equality_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equality_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = equality_expression_1_0_0(builder_, level_ + 1);
    result_ = result_ && relational_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // EQ | NEQ | REGEX_FIND | REGEX_MATCH
  private static boolean equality_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equality_expression_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, EQ);
    if (!result_) result_ = consumeToken(builder_, NEQ);
    if (!result_) result_ = consumeToken(builder_, REGEX_FIND);
    if (!result_) result_ = consumeToken(builder_, REGEX_MATCH);
    return result_;
  }

  /* ********************************************************** */
  // axis LBRACE axis_value* RBRACE
  public static boolean exclude_condition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exclude_condition")) return false;
    if (!nextTokenIs(builder_, AXIS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, AXIS, LBRACE);
    result_ = result_ && exclude_condition_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, EXCLUDE_CONDITION, result_);
    return result_;
  }

  // axis_value*
  private static boolean exclude_condition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exclude_condition_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!axis_value(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "exclude_condition_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // excludes LBRACE exclude_condition* RBRACE
  public static boolean excludes_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "excludes_block")) return false;
    if (!nextTokenIs(builder_, EXCLUDES)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, EXCLUDES, LBRACE);
    result_ = result_ && excludes_block_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, EXCLUDES_BLOCK, result_);
    return result_;
  }

  // exclude_condition*
  private static boolean excludes_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "excludes_block_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!exclude_condition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "excludes_block_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // and_expression (BIT_XOR and_expression)*
  public static boolean exclusive_or_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exclusive_or_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXCLUSIVE_OR_EXPRESSION, "<exclusive or expression>");
    result_ = and_expression(builder_, level_ + 1);
    result_ = result_ && exclusive_or_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (BIT_XOR and_expression)*
  private static boolean exclusive_or_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exclusive_or_expression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!exclusive_or_expression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "exclusive_or_expression_1", pos_)) break;
    }
    return true;
  }

  // BIT_XOR and_expression
  private static boolean exclusive_or_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exclusive_or_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BIT_XOR);
    result_ = result_ && and_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // conditional_expression
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION, "<expression>");
    result_ = conditional_expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // expression (COMMA expression)*
  public static boolean expression_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION_LIST, "<expression list>");
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && expression_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (COMMA expression)*
  private static boolean expression_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!expression_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expression_list_1", pos_)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean expression_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expression SEMICOLON?
  public static boolean expression_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION_STATEMENT, "<expression statement>");
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && expression_statement_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // SEMICOLON?
  private static boolean expression_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_statement_1")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // modifier* type? IDENTIFIER (ASSIGN expression)? SEMICOLON?
  public static boolean field_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FIELD_DECLARATION, "<field declaration>");
    result_ = field_declaration_0(builder_, level_ + 1);
    result_ = result_ && field_declaration_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && field_declaration_3(builder_, level_ + 1);
    result_ = result_ && field_declaration_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // modifier*
  private static boolean field_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!modifier(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "field_declaration_0", pos_)) break;
    }
    return true;
  }

  // type?
  private static boolean field_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_1")) return false;
    type(builder_, level_ + 1);
    return true;
  }

  // (ASSIGN expression)?
  private static boolean field_declaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_3")) return false;
    field_declaration_3_0(builder_, level_ + 1);
    return true;
  }

  // ASSIGN expression
  private static boolean field_declaration_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ASSIGN);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // SEMICOLON?
  private static boolean field_declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_declaration_4")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // KW_FINALLY block_statement
  public static boolean finally_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "finally_clause")) return false;
    if (!nextTokenIs(builder_, KW_FINALLY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_FINALLY);
    result_ = result_ && block_statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, FINALLY_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable_declaration | expression_list
  public static boolean for_init(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_init")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FOR_INIT, "<for init>");
    result_ = variable_declaration(builder_, level_ + 1);
    if (!result_) result_ = expression_list(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KW_FOR LPAREN for_init? SEMICOLON expression? SEMICOLON for_update? RPAREN statement
  public static boolean for_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_statement")) return false;
    if (!nextTokenIs(builder_, KW_FOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_FOR, LPAREN);
    result_ = result_ && for_statement_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    result_ = result_ && for_statement_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMICOLON);
    result_ = result_ && for_statement_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOR_STATEMENT, result_);
    return result_;
  }

  // for_init?
  private static boolean for_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_statement_2")) return false;
    for_init(builder_, level_ + 1);
    return true;
  }

  // expression?
  private static boolean for_statement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_statement_4")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  // for_update?
  private static boolean for_statement_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_statement_6")) return false;
    for_update(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // expression_list
  public static boolean for_update(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_update")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FOR_UPDATE, "<for update>");
    result_ = expression_list(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KW_DEF? type? IDENTIFIER LPAREN parameter_list? RPAREN block_statement
  public static boolean function_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration")) return false;
    if (!nextTokenIs(builder_, "<function declaration>", IDENTIFIER, KW_DEF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FUNCTION_DECLARATION, "<function declaration>");
    result_ = function_declaration_0(builder_, level_ + 1);
    result_ = result_ && function_declaration_1(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, IDENTIFIER, LPAREN);
    result_ = result_ && function_declaration_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && block_statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // KW_DEF?
  private static boolean function_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_0")) return false;
    consumeToken(builder_, KW_DEF);
    return true;
  }

  // type?
  private static boolean function_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_1")) return false;
    type(builder_, level_ + 1);
    return true;
  }

  // parameter_list?
  private static boolean function_declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_declaration_4")) return false;
    parameter_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON string_expression
  //              | IDENTIFIER COLON boolean_expression
  public static boolean git_options(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "git_options")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = git_options_0(builder_, level_ + 1);
    if (!result_) result_ = git_options_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, GIT_OPTIONS, result_);
    return result_;
  }

  // IDENTIFIER COLON string_expression
  private static boolean git_options_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "git_options_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER COLON boolean_expression
  private static boolean git_options_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "git_options_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && boolean_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // string_expression
  //             | LBRACE git_options* RBRACE
  public static boolean git_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "git_params")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GIT_PARAMS, "<git params>");
    result_ = string_expression(builder_, level_ + 1);
    if (!result_) result_ = git_params_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LBRACE git_options* RBRACE
  private static boolean git_params_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "git_params_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && git_params_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // git_options*
  private static boolean git_params_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "git_params_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!git_options(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "git_params_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // statement NEWLINE*
  public static boolean groovy_code(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "groovy_code")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GROOVY_CODE, "<groovy code>");
    result_ = statement(builder_, level_ + 1);
    result_ = result_ && groovy_code_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // NEWLINE*
  private static boolean groovy_code_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "groovy_code_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, NEWLINE)) break;
      if (!empty_element_parsed_guard_(builder_, "groovy_code_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // GSTRING
  public static boolean gstring_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "gstring_expression")) return false;
    if (!nextTokenIs(builder_, GSTRING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, GSTRING);
    exit_section_(builder_, marker_, GSTRING_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER (COMMA IDENTIFIER)*
  public static boolean identifier_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_list")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && identifier_list_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, IDENTIFIER_LIST, result_);
    return result_;
  }

  // (COMMA IDENTIFIER)*
  private static boolean identifier_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_list_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!identifier_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "identifier_list_1", pos_)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean identifier_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_IF LPAREN expression RPAREN statement (KW_ELSE statement)?
  public static boolean if_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement")) return false;
    if (!nextTokenIs(builder_, KW_IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_IF, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && statement(builder_, level_ + 1);
    result_ = result_ && if_statement_5(builder_, level_ + 1);
    exit_section_(builder_, marker_, IF_STATEMENT, result_);
    return result_;
  }

  // (KW_ELSE statement)?
  private static boolean if_statement_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement_5")) return false;
    if_statement_5_0(builder_, level_ + 1);
    return true;
  }

  // KW_ELSE statement
  private static boolean if_statement_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_statement_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_ELSE);
    result_ = result_ && statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_IMPORT (KW_STATIC)? type (DOT MULT)? SEMICOLON?
  public static boolean import_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_statement")) return false;
    if (!nextTokenIs(builder_, KW_IMPORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_IMPORT);
    result_ = result_ && import_statement_1(builder_, level_ + 1);
    result_ = result_ && type(builder_, level_ + 1);
    result_ = result_ && import_statement_3(builder_, level_ + 1);
    result_ = result_ && import_statement_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, IMPORT_STATEMENT, result_);
    return result_;
  }

  // (KW_STATIC)?
  private static boolean import_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_statement_1")) return false;
    consumeToken(builder_, KW_STATIC);
    return true;
  }

  // (DOT MULT)?
  private static boolean import_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_statement_3")) return false;
    import_statement_3_0(builder_, level_ + 1);
    return true;
  }

  // DOT MULT
  private static boolean import_statement_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_statement_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, MULT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // SEMICOLON?
  private static boolean import_statement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_statement_4")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // exclusive_or_expression (BIT_OR exclusive_or_expression)*
  public static boolean inclusive_or_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inclusive_or_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INCLUSIVE_OR_EXPRESSION, "<inclusive or expression>");
    result_ = exclusive_or_expression(builder_, level_ + 1);
    result_ = result_ && inclusive_or_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (BIT_OR exclusive_or_expression)*
  private static boolean inclusive_or_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inclusive_or_expression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!inclusive_or_expression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "inclusive_or_expression_1", pos_)) break;
    }
    return true;
  }

  // BIT_OR exclusive_or_expression
  private static boolean inclusive_or_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inclusive_or_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BIT_OR);
    result_ = result_ && exclusive_or_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_INPUT LBRACE input_content* RBRACE
  public static boolean input_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_block")) return false;
    if (!nextTokenIs(builder_, KW_INPUT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_INPUT, LBRACE);
    result_ = result_ && input_block_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, INPUT_BLOCK, result_);
    return result_;
  }

  // input_content*
  private static boolean input_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_block_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!input_content(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "input_block_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON string_expression
  //                | IDENTIFIER COLON parameter_array
  public static boolean input_content(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_content")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = input_content_0(builder_, level_ + 1);
    if (!result_) result_ = input_content_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, INPUT_CONTENT, result_);
    return result_;
  }

  // IDENTIFIER COLON string_expression
  private static boolean input_content_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_content_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER COLON parameter_array
  private static boolean input_content_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_content_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && parameter_array(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // pipeline_block | scripted_pipeline
  static boolean jenkinsfile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "jenkinsfile")) return false;
    boolean result_;
    result_ = pipeline_block(builder_, level_ + 1);
    if (!result_) result_ = scripted_pipeline(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON string_expression
  public static boolean kubernetes_options(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "kubernetes_options")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, KUBERNETES_OPTIONS, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE kubernetes_options* RBRACE
  public static boolean kubernetes_spec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "kubernetes_spec")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && kubernetes_spec_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, KUBERNETES_SPEC, result_);
    return result_;
  }

  // kubernetes_options*
  private static boolean kubernetes_spec_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "kubernetes_spec_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!kubernetes_options(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "kubernetes_spec_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_LIBRARY LPAREN string_expression RPAREN
  public static boolean library_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "library_block")) return false;
    if (!nextTokenIs(builder_, KW_LIBRARY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_LIBRARY, LPAREN);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, LIBRARY_BLOCK, result_);
    return result_;
  }

  /* ********************************************************** */
  // string_literal_expr | number_literal | boolean_literal | null_literal
  public static boolean literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LITERAL, "<literal>");
    result_ = string_literal_expr(builder_, level_ + 1);
    if (!result_) result_ = number_literal(builder_, level_ + 1);
    if (!result_) result_ = boolean_literal(builder_, level_ + 1);
    if (!result_) result_ = null_literal(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON string_expression
  public static boolean log_rotator_option(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "log_rotator_option")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, LOG_ROTATOR_OPTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE log_rotator_option (COMMA log_rotator_option)* RBRACE
  public static boolean log_rotator_options(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "log_rotator_options")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && log_rotator_option(builder_, level_ + 1);
    result_ = result_ && log_rotator_options_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, LOG_ROTATOR_OPTIONS, result_);
    return result_;
  }

  // (COMMA log_rotator_option)*
  private static boolean log_rotator_options_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "log_rotator_options_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!log_rotator_options_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "log_rotator_options_2", pos_)) break;
    }
    return true;
  }

  // COMMA log_rotator_option
  private static boolean log_rotator_options_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "log_rotator_options_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && log_rotator_option(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // inclusive_or_expression (AND inclusive_or_expression)*
  public static boolean logical_and_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logical_and_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LOGICAL_AND_EXPRESSION, "<logical and expression>");
    result_ = inclusive_or_expression(builder_, level_ + 1);
    result_ = result_ && logical_and_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (AND inclusive_or_expression)*
  private static boolean logical_and_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logical_and_expression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!logical_and_expression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "logical_and_expression_1", pos_)) break;
    }
    return true;
  }

  // AND inclusive_or_expression
  private static boolean logical_and_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logical_and_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AND);
    result_ = result_ && inclusive_or_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // logical_and_expression (OR logical_and_expression)*
  public static boolean logical_or_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logical_or_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LOGICAL_OR_EXPRESSION, "<logical or expression>");
    result_ = logical_and_expression(builder_, level_ + 1);
    result_ = result_ && logical_or_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (OR logical_and_expression)*
  private static boolean logical_or_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logical_or_expression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!logical_or_expression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "logical_or_expression_1", pos_)) break;
    }
    return true;
  }

  // OR logical_and_expression
  private static boolean logical_or_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logical_or_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OR);
    result_ = result_ && logical_and_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // map_key COLON expression
  public static boolean map_entry(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_entry")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MAP_ENTRY, "<map entry>");
    result_ = map_key(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // map_entry (COMMA map_entry)*
  public static boolean map_entry_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_entry_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MAP_ENTRY_LIST, "<map entry list>");
    result_ = map_entry(builder_, level_ + 1);
    result_ = result_ && map_entry_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (COMMA map_entry)*
  private static boolean map_entry_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_entry_list_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!map_entry_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "map_entry_list_1", pos_)) break;
    }
    return true;
  }

  // COMMA map_entry
  private static boolean map_entry_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_entry_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && map_entry(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expression | IDENTIFIER
  public static boolean map_key(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_key")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MAP_KEY, "<map key>");
    result_ = expression(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LBRACKET map_entry_list? RBRACKET | LBRACKET COLON RBRACKET
  public static boolean map_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_literal")) return false;
    if (!nextTokenIs(builder_, LBRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = map_literal_0(builder_, level_ + 1);
    if (!result_) result_ = parseTokens(builder_, 0, LBRACKET, COLON, RBRACKET);
    exit_section_(builder_, marker_, MAP_LITERAL, result_);
    return result_;
  }

  // LBRACKET map_entry_list? RBRACKET
  private static boolean map_literal_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_literal_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && map_literal_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // map_entry_list?
  private static boolean map_literal_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_literal_0_1")) return false;
    map_entry_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_MATRIX LBRACE matrix_content* RBRACE
  public static boolean matrix_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "matrix_block")) return false;
    if (!nextTokenIs(builder_, KW_MATRIX)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_MATRIX, LBRACE);
    result_ = result_ && matrix_block_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, MATRIX_BLOCK, result_);
    return result_;
  }

  // matrix_content*
  private static boolean matrix_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "matrix_block_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!matrix_content(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "matrix_block_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // axes_block | stages_block | excludes_block
  public static boolean matrix_content(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "matrix_content")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MATRIX_CONTENT, "<matrix content>");
    result_ = axes_block(builder_, level_ + 1);
    if (!result_) result_ = stages_block(builder_, level_ + 1);
    if (!result_) result_ = excludes_block(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER LPAREN argument_list? RPAREN
  //              | IDENTIFIER argument_list
  //              | expression DOT IDENTIFIER LPAREN argument_list? RPAREN
  //              | expression DOT IDENTIFIER argument_list
  public static boolean method_call(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, METHOD_CALL, "<method call>");
    result_ = method_call_0(builder_, level_ + 1);
    if (!result_) result_ = method_call_1(builder_, level_ + 1);
    if (!result_) result_ = method_call_2(builder_, level_ + 1);
    if (!result_) result_ = method_call_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // IDENTIFIER LPAREN argument_list? RPAREN
  private static boolean method_call_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, LPAREN);
    result_ = result_ && method_call_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // argument_list?
  private static boolean method_call_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_0_2")) return false;
    argument_list(builder_, level_ + 1);
    return true;
  }

  // IDENTIFIER argument_list
  private static boolean method_call_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && argument_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression DOT IDENTIFIER LPAREN argument_list? RPAREN
  private static boolean method_call_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DOT, IDENTIFIER, LPAREN);
    result_ = result_ && method_call_2_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // argument_list?
  private static boolean method_call_2_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_2_4")) return false;
    argument_list(builder_, level_ + 1);
    return true;
  }

  // expression DOT IDENTIFIER argument_list
  private static boolean method_call_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_call_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, DOT, IDENTIFIER);
    result_ = result_ && argument_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // modifier* type? IDENTIFIER LPAREN parameter_list? RPAREN block_statement
  public static boolean method_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_declaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, METHOD_DECLARATION, "<method declaration>");
    result_ = method_declaration_0(builder_, level_ + 1);
    result_ = result_ && method_declaration_1(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, IDENTIFIER, LPAREN);
    result_ = result_ && method_declaration_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && block_statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // modifier*
  private static boolean method_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_declaration_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!modifier(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "method_declaration_0", pos_)) break;
    }
    return true;
  }

  // type?
  private static boolean method_declaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_declaration_1")) return false;
    type(builder_, level_ + 1);
    return true;
  }

  // parameter_list?
  private static boolean method_declaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_declaration_4")) return false;
    parameter_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_STATIC | KW_FINAL | KW_PRIVATE | KW_PROTECTED | KW_PUBLIC | KW_ABSTRACT
  public static boolean modifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "modifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODIFIER, "<modifier>");
    result_ = consumeToken(builder_, KW_STATIC);
    if (!result_) result_ = consumeToken(builder_, KW_FINAL);
    if (!result_) result_ = consumeToken(builder_, KW_PRIVATE);
    if (!result_) result_ = consumeToken(builder_, KW_PROTECTED);
    if (!result_) result_ = consumeToken(builder_, KW_PUBLIC);
    if (!result_) result_ = consumeToken(builder_, KW_ABSTRACT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // power_expression ((MULT | DIV | MOD) power_expression)*
  public static boolean multiplicative_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MULTIPLICATIVE_EXPRESSION, "<multiplicative expression>");
    result_ = power_expression(builder_, level_ + 1);
    result_ = result_ && multiplicative_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ((MULT | DIV | MOD) power_expression)*
  private static boolean multiplicative_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_expression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!multiplicative_expression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "multiplicative_expression_1", pos_)) break;
    }
    return true;
  }

  // (MULT | DIV | MOD) power_expression
  private static boolean multiplicative_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = multiplicative_expression_1_0_0(builder_, level_ + 1);
    result_ = result_ && power_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // MULT | DIV | MOD
  private static boolean multiplicative_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_expression_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, MULT);
    if (!result_) result_ = consumeToken(builder_, DIV);
    if (!result_) result_ = consumeToken(builder_, MOD);
    return result_;
  }

  /* ********************************************************** */
  // KW_NULL
  public static boolean null_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "null_literal")) return false;
    if (!nextTokenIs(builder_, KW_NULL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_NULL);
    exit_section_(builder_, marker_, NULL_LITERAL, result_);
    return result_;
  }

  /* ********************************************************** */
  // number_literal | expression
  public static boolean number_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "number_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NUMBER_EXPRESSION, "<number expression>");
    result_ = number_literal(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // NUMBER
  public static boolean number_literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "number_literal")) return false;
    if (!nextTokenIs(builder_, NUMBER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NUMBER);
    exit_section_(builder_, marker_, NUMBER_LITERAL, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER LPAREN build_discarder_params RPAREN
  //         | IDENTIFIER LPAREN boolean_expression? RPAREN
  //         | IDENTIFIER LPAREN RPAREN
  //         | IDENTIFIER LPAREN boolean_expression RPAREN
  //         | IDENTIFIER LPAREN number_expression? RPAREN
  //         | IDENTIFIER LPAREN number_expression RPAREN
  //         | IDENTIFIER LPAREN timeout_params RPAREN
  public static boolean option(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "option")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = option_0(builder_, level_ + 1);
    if (!result_) result_ = option_1(builder_, level_ + 1);
    if (!result_) result_ = parseTokens(builder_, 0, IDENTIFIER, LPAREN, RPAREN);
    if (!result_) result_ = option_3(builder_, level_ + 1);
    if (!result_) result_ = option_4(builder_, level_ + 1);
    if (!result_) result_ = option_5(builder_, level_ + 1);
    if (!result_) result_ = option_6(builder_, level_ + 1);
    exit_section_(builder_, marker_, OPTION, result_);
    return result_;
  }

  // IDENTIFIER LPAREN build_discarder_params RPAREN
  private static boolean option_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "option_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, LPAREN);
    result_ = result_ && build_discarder_params(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER LPAREN boolean_expression? RPAREN
  private static boolean option_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "option_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, LPAREN);
    result_ = result_ && option_1_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // boolean_expression?
  private static boolean option_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "option_1_2")) return false;
    boolean_expression(builder_, level_ + 1);
    return true;
  }

  // IDENTIFIER LPAREN boolean_expression RPAREN
  private static boolean option_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "option_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, LPAREN);
    result_ = result_ && boolean_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER LPAREN number_expression? RPAREN
  private static boolean option_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "option_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, LPAREN);
    result_ = result_ && option_4_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // number_expression?
  private static boolean option_4_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "option_4_2")) return false;
    number_expression(builder_, level_ + 1);
    return true;
  }

  // IDENTIFIER LPAREN number_expression RPAREN
  private static boolean option_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "option_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, LPAREN);
    result_ = result_ && number_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER LPAREN timeout_params RPAREN
  private static boolean option_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "option_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, LPAREN);
    result_ = result_ && timeout_params(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_OPTIONS LBRACE option* RBRACE
  public static boolean options_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "options_block")) return false;
    if (!nextTokenIs(builder_, KW_OPTIONS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_OPTIONS, LBRACE);
    result_ = result_ && options_block_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, OPTIONS_BLOCK, result_);
    return result_;
  }

  // option*
  private static boolean options_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "options_block_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!option(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "options_block_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_PACKAGE type SEMICOLON?
  public static boolean package_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "package_statement")) return false;
    if (!nextTokenIs(builder_, KW_PACKAGE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_PACKAGE);
    result_ = result_ && type(builder_, level_ + 1);
    result_ = result_ && package_statement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, PACKAGE_STATEMENT, result_);
    return result_;
  }

  // SEMICOLON?
  private static boolean package_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "package_statement_2")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // KW_PARALLEL LBRACE parallel_stages RBRACE
  public static boolean parallel_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parallel_block")) return false;
    if (!nextTokenIs(builder_, KW_PARALLEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_PARALLEL, LBRACE);
    result_ = result_ && parallel_stages(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, PARALLEL_BLOCK, result_);
    return result_;
  }

  /* ********************************************************** */
  // string_expression COLON LBRACE step* RBRACE
  public static boolean parallel_branch(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parallel_branch")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PARALLEL_BRANCH, "<parallel branch>");
    result_ = string_expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COLON, LBRACE);
    result_ = result_ && parallel_branch_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // step*
  private static boolean parallel_branch_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parallel_branch_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!step(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parallel_branch_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LBRACE parallel_branch (COMMA parallel_branch)* RBRACE
  public static boolean parallel_branches(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parallel_branches")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && parallel_branch(builder_, level_ + 1);
    result_ = result_ && parallel_branches_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, PARALLEL_BRANCHES, result_);
    return result_;
  }

  // (COMMA parallel_branch)*
  private static boolean parallel_branches_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parallel_branches_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parallel_branches_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parallel_branches_2", pos_)) break;
    }
    return true;
  }

  // COMMA parallel_branch
  private static boolean parallel_branches_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parallel_branches_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && parallel_branch(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // stage_block (COMMA stage_block)*
  public static boolean parallel_stages(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parallel_stages")) return false;
    if (!nextTokenIs(builder_, KW_STAGE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = stage_block(builder_, level_ + 1);
    result_ = result_ && parallel_stages_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARALLEL_STAGES, result_);
    return result_;
  }

  // (COMMA stage_block)*
  private static boolean parallel_stages_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parallel_stages_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parallel_stages_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parallel_stages_1", pos_)) break;
    }
    return true;
  }

  // COMMA stage_block
  private static boolean parallel_stages_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parallel_stages_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && stage_block(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_PARALLEL parallel_branches
  public static boolean parallel_step(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parallel_step")) return false;
    if (!nextTokenIs(builder_, KW_PARALLEL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_PARALLEL);
    result_ = result_ && parallel_branches(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARALLEL_STEP, result_);
    return result_;
  }

  /* ********************************************************** */
  // type? IDENTIFIER (ASSIGN expression)?
  public static boolean parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && parameter_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARAMETER, result_);
    return result_;
  }

  // type?
  private static boolean parameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_0")) return false;
    type(builder_, level_ + 1);
    return true;
  }

  // (ASSIGN expression)?
  private static boolean parameter_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_2")) return false;
    parameter_2_0(builder_, level_ + 1);
    return true;
  }

  // ASSIGN expression
  private static boolean parameter_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ASSIGN);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACKET parameter_assignment (COMMA parameter_assignment)* RBRACKET
  public static boolean parameter_array(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_array")) return false;
    if (!nextTokenIs(builder_, LBRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && parameter_assignment(builder_, level_ + 1);
    result_ = result_ && parameter_array_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, PARAMETER_ARRAY, result_);
    return result_;
  }

  // (COMMA parameter_assignment)*
  private static boolean parameter_array_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_array_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parameter_array_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parameter_array_2", pos_)) break;
    }
    return true;
  }

  // COMMA parameter_assignment
  private static boolean parameter_array_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_array_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && parameter_assignment(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER LPAREN expression RPAREN
  //                       | KW_STRING LPAREN name COLON string_expression COMMA value COLON expression RPAREN
  public static boolean parameter_assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_assignment")) return false;
    if (!nextTokenIs(builder_, "<parameter assignment>", IDENTIFIER, KW_STRING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PARAMETER_ASSIGNMENT, "<parameter assignment>");
    result_ = parameter_assignment_0(builder_, level_ + 1);
    if (!result_) result_ = parameter_assignment_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // IDENTIFIER LPAREN expression RPAREN
  private static boolean parameter_assignment_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_assignment_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_STRING LPAREN name COLON string_expression COMMA value COLON expression RPAREN
  private static boolean parameter_assignment_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_assignment_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_STRING, LPAREN, NAME, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMA, VALUE, COLON);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // parameter_type LPAREN parameter_options RPAREN
  public static boolean parameter_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_definition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PARAMETER_DEFINITION, "<parameter definition>");
    result_ = parameter_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN);
    result_ = result_ && parameter_options(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // parameter (COMMA parameter)*
  public static boolean parameter_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter(builder_, level_ + 1);
    result_ = result_ && parameter_list_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARAMETER_LIST, result_);
    return result_;
  }

  // (COMMA parameter)*
  private static boolean parameter_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parameter_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parameter_list_1", pos_)) break;
    }
    return true;
  }

  // COMMA parameter
  private static boolean parameter_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && parameter(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON string_expression
  //                   | IDENTIFIER COLON expression
  //                   | IDENTIFIER COLON string_list
  public static boolean parameter_option(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_option")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parameter_option_0(builder_, level_ + 1);
    if (!result_) result_ = parameter_option_1(builder_, level_ + 1);
    if (!result_) result_ = parameter_option_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, PARAMETER_OPTION, result_);
    return result_;
  }

  // IDENTIFIER COLON string_expression
  private static boolean parameter_option_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_option_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER COLON expression
  private static boolean parameter_option_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_option_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER COLON string_list
  private static boolean parameter_option_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_option_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && string_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE parameter_option (COMMA parameter_option)* RBRACE
  public static boolean parameter_options(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_options")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && parameter_option(builder_, level_ + 1);
    result_ = result_ && parameter_options_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, PARAMETER_OPTIONS, result_);
    return result_;
  }

  // (COMMA parameter_option)*
  private static boolean parameter_options_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_options_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parameter_options_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parameter_options_2", pos_)) break;
    }
    return true;
  }

  // COMMA parameter_option
  private static boolean parameter_options_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_options_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && parameter_option(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_STRING | KW_TEXT | KW_BOOLEAN_PARAM | KW_CHOICE | KW_PASSWORD
  public static boolean parameter_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PARAMETER_TYPE, "<parameter type>");
    result_ = consumeToken(builder_, KW_STRING);
    if (!result_) result_ = consumeToken(builder_, KW_TEXT);
    if (!result_) result_ = consumeToken(builder_, KW_BOOLEAN_PARAM);
    if (!result_) result_ = consumeToken(builder_, KW_CHOICE);
    if (!result_) result_ = consumeToken(builder_, KW_PASSWORD);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KW_PARAMETERS LBRACE parameter_definition* RBRACE
  public static boolean parameters_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters_block")) return false;
    if (!nextTokenIs(builder_, KW_PARAMETERS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_PARAMETERS, LBRACE);
    result_ = result_ && parameters_block_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, PARAMETERS_BLOCK, result_);
    return result_;
  }

  // parameter_definition*
  private static boolean parameters_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameters_block_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parameter_definition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parameters_block_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_PIPELINE LBRACE pipeline_content* RBRACE
  public static boolean pipeline_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pipeline_block")) return false;
    if (!nextTokenIs(builder_, KW_PIPELINE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_PIPELINE, LBRACE);
    result_ = result_ && pipeline_block_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, PIPELINE_BLOCK, result_);
    return result_;
  }

  // pipeline_content*
  private static boolean pipeline_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pipeline_block_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!pipeline_content(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "pipeline_block_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // agent_block
  //                    | stages_block
  //                    | post_block
  //                    | options_block
  //                    | environment_block
  //                    | parameters_block
  //                    | triggers_block
  //                    | tools_block
  //                    | library_block
  public static boolean pipeline_content(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pipeline_content")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PIPELINE_CONTENT, "<pipeline content>");
    result_ = agent_block(builder_, level_ + 1);
    if (!result_) result_ = stages_block(builder_, level_ + 1);
    if (!result_) result_ = post_block(builder_, level_ + 1);
    if (!result_) result_ = options_block(builder_, level_ + 1);
    if (!result_) result_ = environment_block(builder_, level_ + 1);
    if (!result_) result_ = parameters_block(builder_, level_ + 1);
    if (!result_) result_ = triggers_block(builder_, level_ + 1);
    if (!result_) result_ = tools_block(builder_, level_ + 1);
    if (!result_) result_ = library_block(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KW_POST LBRACE post_condition* RBRACE
  public static boolean post_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "post_block")) return false;
    if (!nextTokenIs(builder_, KW_POST)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_POST, LBRACE);
    result_ = result_ && post_block_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, POST_BLOCK, result_);
    return result_;
  }

  // post_condition*
  private static boolean post_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "post_block_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!post_condition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "post_block_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // post_condition_type LBRACE step* RBRACE
  public static boolean post_condition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "post_condition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, POST_CONDITION, "<post condition>");
    result_ = post_condition_type(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LBRACE);
    result_ = result_ && post_condition_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // step*
  private static boolean post_condition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "post_condition_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!step(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "post_condition_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_ALWAYS | KW_CHANGED | KW_FIXED | KW_REGRESSION | KW_ABORTED | KW_FAILURE | KW_SUCCESS | KW_UNSTABLE | KW_UNSUCCESSFUL | KW_CLEANUP
  public static boolean post_condition_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "post_condition_type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, POST_CONDITION_TYPE, "<post condition type>");
    result_ = consumeToken(builder_, KW_ALWAYS);
    if (!result_) result_ = consumeToken(builder_, KW_CHANGED);
    if (!result_) result_ = consumeToken(builder_, KW_FIXED);
    if (!result_) result_ = consumeToken(builder_, KW_REGRESSION);
    if (!result_) result_ = consumeToken(builder_, KW_ABORTED);
    if (!result_) result_ = consumeToken(builder_, KW_FAILURE);
    if (!result_) result_ = consumeToken(builder_, KW_SUCCESS);
    if (!result_) result_ = consumeToken(builder_, KW_UNSTABLE);
    if (!result_) result_ = consumeToken(builder_, KW_UNSUCCESSFUL);
    if (!result_) result_ = consumeToken(builder_, KW_CLEANUP);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // primary_expression postfix_op*
  public static boolean postfix_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "postfix_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, POSTFIX_EXPRESSION, "<postfix expression>");
    result_ = primary_expression(builder_, level_ + 1);
    result_ = result_ && postfix_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // postfix_op*
  private static boolean postfix_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "postfix_expression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!postfix_op(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "postfix_expression_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // DOT IDENTIFIER
  //             | SAFE_DOT IDENTIFIER
  //             | SPREAD IDENTIFIER
  //             | LBRACKET expression RBRACKET
  //             | LPAREN argument_list? RPAREN
  //             | LBRACE closure_body RBRACE
  public static boolean postfix_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "postfix_op")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, POSTFIX_OP, "<postfix op>");
    result_ = parseTokens(builder_, 0, DOT, IDENTIFIER);
    if (!result_) result_ = parseTokens(builder_, 0, SAFE_DOT, IDENTIFIER);
    if (!result_) result_ = parseTokens(builder_, 0, SPREAD, IDENTIFIER);
    if (!result_) result_ = postfix_op_3(builder_, level_ + 1);
    if (!result_) result_ = postfix_op_4(builder_, level_ + 1);
    if (!result_) result_ = postfix_op_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LBRACKET expression RBRACKET
  private static boolean postfix_op_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "postfix_op_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LPAREN argument_list? RPAREN
  private static boolean postfix_op_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "postfix_op_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && postfix_op_4_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // argument_list?
  private static boolean postfix_op_4_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "postfix_op_4_1")) return false;
    argument_list(builder_, level_ + 1);
    return true;
  }

  // LBRACE closure_body RBRACE
  private static boolean postfix_op_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "postfix_op_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && closure_body(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // unary_expression (POWER unary_expression)*
  public static boolean power_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "power_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, POWER_EXPRESSION, "<power expression>");
    result_ = unary_expression(builder_, level_ + 1);
    result_ = result_ && power_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (POWER unary_expression)*
  private static boolean power_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "power_expression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!power_expression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "power_expression_1", pos_)) break;
    }
    return true;
  }

  // POWER unary_expression
  private static boolean power_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "power_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, POWER);
    result_ = result_ && unary_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // literal
  //                     | IDENTIFIER
  //                     | KW_THIS
  //                     | KW_SUPER
  //                     | LPAREN expression RPAREN
  //                     | array_literal
  //                     | map_literal
  //                     | closure_expression
  //                     | gstring_expression
  public static boolean primary_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PRIMARY_EXPRESSION, "<primary expression>");
    result_ = literal(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = consumeToken(builder_, KW_THIS);
    if (!result_) result_ = consumeToken(builder_, KW_SUPER);
    if (!result_) result_ = primary_expression_4(builder_, level_ + 1);
    if (!result_) result_ = array_literal(builder_, level_ + 1);
    if (!result_) result_ = map_literal(builder_, level_ + 1);
    if (!result_) result_ = closure_expression(builder_, level_ + 1);
    if (!result_) result_ = gstring_expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LPAREN expression RPAREN
  private static boolean primary_expression_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_expression_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // shift_expression ((LT | LE | GT | GE | KW_INSTANCEOF | KW_IN) shift_expression)*
  public static boolean relational_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relational_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RELATIONAL_EXPRESSION, "<relational expression>");
    result_ = shift_expression(builder_, level_ + 1);
    result_ = result_ && relational_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ((LT | LE | GT | GE | KW_INSTANCEOF | KW_IN) shift_expression)*
  private static boolean relational_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relational_expression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!relational_expression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "relational_expression_1", pos_)) break;
    }
    return true;
  }

  // (LT | LE | GT | GE | KW_INSTANCEOF | KW_IN) shift_expression
  private static boolean relational_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relational_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = relational_expression_1_0_0(builder_, level_ + 1);
    result_ = result_ && shift_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LT | LE | GT | GE | KW_INSTANCEOF | KW_IN
  private static boolean relational_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relational_expression_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, LT);
    if (!result_) result_ = consumeToken(builder_, LE);
    if (!result_) result_ = consumeToken(builder_, GT);
    if (!result_) result_ = consumeToken(builder_, GE);
    if (!result_) result_ = consumeToken(builder_, KW_INSTANCEOF);
    if (!result_) result_ = consumeToken(builder_, KW_IN);
    return result_;
  }

  /* ********************************************************** */
  // KW_RETRY LPAREN number_expression RPAREN LBRACE step* RBRACE
  public static boolean retry_step(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "retry_step")) return false;
    if (!nextTokenIs(builder_, KW_RETRY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_RETRY, LPAREN);
    result_ = result_ && number_expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, LBRACE);
    result_ = result_ && retry_step_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, RETRY_STEP, result_);
    return result_;
  }

  // step*
  private static boolean retry_step_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "retry_step_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!step(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "retry_step_5", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_RETURN expression? SEMICOLON?
  public static boolean return_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_statement")) return false;
    if (!nextTokenIs(builder_, KW_RETURN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_RETURN);
    result_ = result_ && return_statement_1(builder_, level_ + 1);
    result_ = result_ && return_statement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, RETURN_STATEMENT, result_);
    return result_;
  }

  // expression?
  private static boolean return_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_statement_1")) return false;
    expression(builder_, level_ + 1);
    return true;
  }

  // SEMICOLON?
  private static boolean return_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "return_statement_2")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // DOLLAR IDENTIFIER COLON string_expression COMMA IDENTIFIER COLON string_expression (COMMA scm_option)*
  public static boolean scm_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scm_definition")) return false;
    if (!nextTokenIs(builder_, DOLLAR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOLLAR, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMA, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && scm_definition_8(builder_, level_ + 1);
    exit_section_(builder_, marker_, SCM_DEFINITION, result_);
    return result_;
  }

  // (COMMA scm_option)*
  private static boolean scm_definition_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scm_definition_8")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!scm_definition_8_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "scm_definition_8", pos_)) break;
    }
    return true;
  }

  // COMMA scm_option
  private static boolean scm_definition_8_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scm_definition_8_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && scm_option(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_SCM
  //                 | KW_GIT LPAREN string_expression RPAREN
  //                 | LBRACKET scm_definition RBRACKET
  public static boolean scm_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scm_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SCM_EXPRESSION, "<scm expression>");
    result_ = consumeToken(builder_, KW_SCM);
    if (!result_) result_ = scm_expression_1(builder_, level_ + 1);
    if (!result_) result_ = scm_expression_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // KW_GIT LPAREN string_expression RPAREN
  private static boolean scm_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scm_expression_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_GIT, LPAREN);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACKET scm_definition RBRACKET
  private static boolean scm_expression_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scm_expression_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACKET);
    result_ = result_ && scm_definition(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON string_expression
  public static boolean scm_option(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scm_option")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, SCM_OPTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_SCRIPT LBRACE groovy_code* RBRACE
  public static boolean script_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "script_block")) return false;
    if (!nextTokenIs(builder_, KW_SCRIPT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_SCRIPT, LBRACE);
    result_ = result_ && script_block_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, SCRIPT_BLOCK, result_);
    return result_;
  }

  // groovy_code*
  private static boolean script_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "script_block_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!groovy_code(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "script_block_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // groovy_code*
  public static boolean scripted_pipeline(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scripted_pipeline")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SCRIPTED_PIPELINE, "<scripted pipeline>");
    while (true) {
      int pos_ = current_position_(builder_);
      if (!groovy_code(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "scripted_pipeline", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // LBRACE IDENTIFIER COLON string_expression COMMA IDENTIFIER COLON string_expression RBRACE
  public static boolean secret_file_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "secret_file_params")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LBRACE, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMA, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, SECRET_FILE_PARAMS, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE IDENTIFIER COLON string_expression COMMA IDENTIFIER COLON string_expression RBRACE
  public static boolean secret_text_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "secret_text_params")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LBRACE, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMA, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, SECRET_TEXT_PARAMS, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON string_expression
  //             | IDENTIFIER COLON boolean_expression
  public static boolean sh_options(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sh_options")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = sh_options_0(builder_, level_ + 1);
    if (!result_) result_ = sh_options_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, SH_OPTIONS, result_);
    return result_;
  }

  // IDENTIFIER COLON string_expression
  private static boolean sh_options_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sh_options_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER COLON boolean_expression
  private static boolean sh_options_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sh_options_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && boolean_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // string_expression
  //            | LBRACE sh_options* RBRACE
  public static boolean sh_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sh_params")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SH_PARAMS, "<sh params>");
    result_ = string_expression(builder_, level_ + 1);
    if (!result_) result_ = sh_params_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LBRACE sh_options* RBRACE
  private static boolean sh_params_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sh_params_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && sh_params_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // sh_options*
  private static boolean sh_params_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sh_params_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!sh_options(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "sh_params_1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // additive_expression ((LSHIFT | RSHIFT | URSHIFT) additive_expression)*
  public static boolean shift_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shift_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SHIFT_EXPRESSION, "<shift expression>");
    result_ = additive_expression(builder_, level_ + 1);
    result_ = result_ && shift_expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ((LSHIFT | RSHIFT | URSHIFT) additive_expression)*
  private static boolean shift_expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shift_expression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!shift_expression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "shift_expression_1", pos_)) break;
    }
    return true;
  }

  // (LSHIFT | RSHIFT | URSHIFT) additive_expression
  private static boolean shift_expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shift_expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = shift_expression_1_0_0(builder_, level_ + 1);
    result_ = result_ && additive_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LSHIFT | RSHIFT | URSHIFT
  private static boolean shift_expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "shift_expression_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, LSHIFT);
    if (!result_) result_ = consumeToken(builder_, RSHIFT);
    if (!result_) result_ = consumeToken(builder_, URSHIFT);
    return result_;
  }

  /* ********************************************************** */
  // builtin_step
  //              | method_call
  //              | assignment_expression
  //              | expression
  public static boolean simple_step(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_step")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SIMPLE_STEP, "<simple step>");
    result_ = builtin_step(builder_, level_ + 1);
    if (!result_) result_ = method_call(builder_, level_ + 1);
    if (!result_) result_ = assignment_expression(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE IDENTIFIER COLON string_expression COMMA IDENTIFIER COLON string_expression (COMMA IDENTIFIER COLON string_expression)? RBRACE
  public static boolean ssh_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ssh_params")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LBRACE, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMA, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && ssh_params_8(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, SSH_PARAMS, result_);
    return result_;
  }

  // (COMMA IDENTIFIER COLON string_expression)?
  private static boolean ssh_params_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ssh_params_8")) return false;
    ssh_params_8_0(builder_, level_ + 1);
    return true;
  }

  // COMMA IDENTIFIER COLON string_expression
  private static boolean ssh_params_8_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ssh_params_8_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_STAGE LPAREN string_expression RPAREN LBRACE stage_content* RBRACE
  public static boolean stage_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stage_block")) return false;
    if (!nextTokenIs(builder_, KW_STAGE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_STAGE, LPAREN);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, LBRACE);
    result_ = result_ && stage_block_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, STAGE_BLOCK, result_);
    return result_;
  }

  // stage_content*
  private static boolean stage_block_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stage_block_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!stage_content(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "stage_block_5", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // agent_block
  //                | when_block
  //                | steps_block
  //                | parallel_block
  //                | matrix_block
  //                | post_block
  //                | environment_block
  //                | tools_block
  //                | input_block
  public static boolean stage_content(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stage_content")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STAGE_CONTENT, "<stage content>");
    result_ = agent_block(builder_, level_ + 1);
    if (!result_) result_ = when_block(builder_, level_ + 1);
    if (!result_) result_ = steps_block(builder_, level_ + 1);
    if (!result_) result_ = parallel_block(builder_, level_ + 1);
    if (!result_) result_ = matrix_block(builder_, level_ + 1);
    if (!result_) result_ = post_block(builder_, level_ + 1);
    if (!result_) result_ = environment_block(builder_, level_ + 1);
    if (!result_) result_ = tools_block(builder_, level_ + 1);
    if (!result_) result_ = input_block(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KW_STAGES LBRACE stage_block* RBRACE
  public static boolean stages_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stages_block")) return false;
    if (!nextTokenIs(builder_, KW_STAGES)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_STAGES, LBRACE);
    result_ = result_ && stages_block_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, STAGES_BLOCK, result_);
    return result_;
  }

  // stage_block*
  private static boolean stages_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stages_block_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!stage_block(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "stages_block_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON string_expression
  //                | IDENTIFIER COLON boolean_expression
  public static boolean stash_options(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stash_options")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = stash_options_0(builder_, level_ + 1);
    if (!result_) result_ = stash_options_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, STASH_OPTIONS, result_);
    return result_;
  }

  // IDENTIFIER COLON string_expression
  private static boolean stash_options_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stash_options_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER COLON boolean_expression
  private static boolean stash_options_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stash_options_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && boolean_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE stash_options* RBRACE
  public static boolean stash_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stash_params")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && stash_params_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, STASH_PARAMS, result_);
    return result_;
  }

  // stash_options*
  private static boolean stash_params_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stash_params_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!stash_options(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "stash_params_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // declaration
  //            | expression_statement
  //            | control_statement
  //            | try_statement
  //            | throw_statement
  //            | return_statement
  //            | import_statement
  //            | package_statement
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENT, "<statement>");
    result_ = declaration(builder_, level_ + 1);
    if (!result_) result_ = expression_statement(builder_, level_ + 1);
    if (!result_) result_ = control_statement(builder_, level_ + 1);
    if (!result_) result_ = try_statement(builder_, level_ + 1);
    if (!result_) result_ = throw_statement(builder_, level_ + 1);
    if (!result_) result_ = return_statement(builder_, level_ + 1);
    if (!result_) result_ = import_statement(builder_, level_ + 1);
    if (!result_) result_ = package_statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // step_expression NEWLINE*
  public static boolean step(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "step")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STEP, "<step>");
    result_ = step_expression(builder_, level_ + 1);
    result_ = result_ && step_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // NEWLINE*
  private static boolean step_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "step_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, NEWLINE)) break;
      if (!empty_element_parsed_guard_(builder_, "step_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // simple_step
  //                  | script_block
  //                  | dir_step
  //                  | timeout_step
  //                  | retry_step
  //                  | withCredentials_step
  //                  | parallel_step
  public static boolean step_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "step_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STEP_EXPRESSION, "<step expression>");
    result_ = simple_step(builder_, level_ + 1);
    if (!result_) result_ = script_block(builder_, level_ + 1);
    if (!result_) result_ = dir_step(builder_, level_ + 1);
    if (!result_) result_ = timeout_step(builder_, level_ + 1);
    if (!result_) result_ = retry_step(builder_, level_ + 1);
    if (!result_) result_ = withCredentials_step(builder_, level_ + 1);
    if (!result_) result_ = parallel_step(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KW_STEPS LBRACE step* RBRACE
  public static boolean steps_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "steps_block")) return false;
    if (!nextTokenIs(builder_, KW_STEPS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_STEPS, LBRACE);
    result_ = result_ && steps_block_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, STEPS_BLOCK, result_);
    return result_;
  }

  // step*
  private static boolean steps_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "steps_block_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!step(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "steps_block_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // string_literal_expr | expression
  public static boolean string_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRING_EXPRESSION, "<string expression>");
    result_ = string_literal_expr(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // string_expression (COMMA string_expression)*
  public static boolean string_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRING_LIST, "<string list>");
    result_ = string_expression(builder_, level_ + 1);
    result_ = result_ && string_list_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (COMMA string_expression)*
  private static boolean string_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_list_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!string_list_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "string_list_1", pos_)) break;
    }
    return true;
  }

  // COMMA string_expression
  private static boolean string_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_list_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // STRING_LITERAL | SINGLE_QUOTED_STRING | MULTILINE_STRING | MULTILINE_SINGLE_STRING
  public static boolean string_literal_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_literal_expr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRING_LITERAL_EXPR, "<string literal expr>");
    result_ = consumeToken(builder_, STRING_LITERAL);
    if (!result_) result_ = consumeToken(builder_, SINGLE_QUOTED_STRING);
    if (!result_) result_ = consumeToken(builder_, MULTILINE_STRING);
    if (!result_) result_ = consumeToken(builder_, MULTILINE_SINGLE_STRING);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // case_statement | default_statement
  public static boolean switch_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_body")) return false;
    if (!nextTokenIs(builder_, "<switch body>", KW_CASE, KW_DEFAULT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SWITCH_BODY, "<switch body>");
    result_ = case_statement(builder_, level_ + 1);
    if (!result_) result_ = default_statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KW_SWITCH LPAREN expression RPAREN LBRACE switch_body* RBRACE
  public static boolean switch_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_statement")) return false;
    if (!nextTokenIs(builder_, KW_SWITCH)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_SWITCH, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, LBRACE);
    result_ = result_ && switch_statement_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, SWITCH_STATEMENT, result_);
    return result_;
  }

  // switch_body*
  private static boolean switch_statement_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switch_statement_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!switch_body(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "switch_statement_5", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON string_expression
  //               | IDENTIFIER COLON boolean_expression
  //               | IDENTIFIER COLON number_expression
  public static boolean test_options(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "test_options")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = test_options_0(builder_, level_ + 1);
    if (!result_) result_ = test_options_1(builder_, level_ + 1);
    if (!result_) result_ = test_options_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, TEST_OPTIONS, result_);
    return result_;
  }

  // IDENTIFIER COLON string_expression
  private static boolean test_options_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "test_options_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER COLON boolean_expression
  private static boolean test_options_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "test_options_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && boolean_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IDENTIFIER COLON number_expression
  private static boolean test_options_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "test_options_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && number_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE test_options* RBRACE
  public static boolean test_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "test_params")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACE);
    result_ = result_ && test_params_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, TEST_PARAMS, result_);
    return result_;
  }

  // test_options*
  private static boolean test_params_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "test_params_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!test_options(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "test_params_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SUCCESS | UNSTABLE | FAILURE
  public static boolean threshold_value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "threshold_value")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, THRESHOLD_VALUE, "<threshold value>");
    result_ = consumeToken(builder_, SUCCESS);
    if (!result_) result_ = consumeToken(builder_, UNSTABLE);
    if (!result_) result_ = consumeToken(builder_, FAILURE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // KW_THROW expression SEMICOLON?
  public static boolean throw_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "throw_statement")) return false;
    if (!nextTokenIs(builder_, KW_THROW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_THROW);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && throw_statement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, THROW_STATEMENT, result_);
    return result_;
  }

  // SEMICOLON?
  private static boolean throw_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "throw_statement_2")) return false;
    consumeToken(builder_, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // number_expression
  //              | LBRACE time COLON number_expression (COMMA unit COLON time_unit)? RBRACE
  public static boolean time_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "time_params")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TIME_PARAMS, "<time params>");
    result_ = number_expression(builder_, level_ + 1);
    if (!result_) result_ = time_params_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LBRACE time COLON number_expression (COMMA unit COLON time_unit)? RBRACE
  private static boolean time_params_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "time_params_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LBRACE, TIME, COLON);
    result_ = result_ && number_expression(builder_, level_ + 1);
    result_ = result_ && time_params_1_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA unit COLON time_unit)?
  private static boolean time_params_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "time_params_1_4")) return false;
    time_params_1_4_0(builder_, level_ + 1);
    return true;
  }

  // COMMA unit COLON time_unit
  private static boolean time_params_1_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "time_params_1_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, UNIT, COLON);
    result_ = result_ && time_unit(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // SECONDS | MINUTES | HOURS
  public static boolean time_unit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "time_unit")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TIME_UNIT, "<time unit>");
    result_ = consumeToken(builder_, SECONDS);
    if (!result_) result_ = consumeToken(builder_, MINUTES);
    if (!result_) result_ = consumeToken(builder_, HOURS);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // number_expression
  //                 | LBRACE time COLON number_expression (COMMA unit COLON time_unit)? (COMMA activity COLON boolean_expression)? RBRACE
  public static boolean timeout_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "timeout_params")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TIMEOUT_PARAMS, "<timeout params>");
    result_ = number_expression(builder_, level_ + 1);
    if (!result_) result_ = timeout_params_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LBRACE time COLON number_expression (COMMA unit COLON time_unit)? (COMMA activity COLON boolean_expression)? RBRACE
  private static boolean timeout_params_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "timeout_params_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LBRACE, TIME, COLON);
    result_ = result_ && number_expression(builder_, level_ + 1);
    result_ = result_ && timeout_params_1_4(builder_, level_ + 1);
    result_ = result_ && timeout_params_1_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA unit COLON time_unit)?
  private static boolean timeout_params_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "timeout_params_1_4")) return false;
    timeout_params_1_4_0(builder_, level_ + 1);
    return true;
  }

  // COMMA unit COLON time_unit
  private static boolean timeout_params_1_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "timeout_params_1_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, UNIT, COLON);
    result_ = result_ && time_unit(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA activity COLON boolean_expression)?
  private static boolean timeout_params_1_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "timeout_params_1_5")) return false;
    timeout_params_1_5_0(builder_, level_ + 1);
    return true;
  }

  // COMMA activity COLON boolean_expression
  private static boolean timeout_params_1_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "timeout_params_1_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, ACTIVITY, COLON);
    result_ = result_ && boolean_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_TIMEOUT LPAREN timeout_params RPAREN LBRACE step* RBRACE
  public static boolean timeout_step(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "timeout_step")) return false;
    if (!nextTokenIs(builder_, KW_TIMEOUT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_TIMEOUT, LPAREN);
    result_ = result_ && timeout_params(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, LBRACE);
    result_ = result_ && timeout_step_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, TIMEOUT_STEP, result_);
    return result_;
  }

  // step*
  private static boolean timeout_step_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "timeout_step_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!step(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "timeout_step_5", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // tool_name string_expression
  public static boolean tool_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tool_definition")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = tool_name(builder_, level_ + 1);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, TOOL_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean tool_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tool_name")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, TOOL_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_TOOLS LBRACE tool_definition* RBRACE
  public static boolean tools_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tools_block")) return false;
    if (!nextTokenIs(builder_, KW_TOOLS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_TOOLS, LBRACE);
    result_ = result_ && tools_block_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, TOOLS_BLOCK, result_);
    return result_;
  }

  // tool_definition*
  private static boolean tools_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tools_block_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!tool_definition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "tools_block_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_CRON LPAREN string_expression RPAREN
  //                     | KW_POLL_SCM LPAREN string_expression RPAREN
  //                     | KW_UPSTREAM LPAREN upstream_params RPAREN
  public static boolean trigger_definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trigger_definition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TRIGGER_DEFINITION, "<trigger definition>");
    result_ = trigger_definition_0(builder_, level_ + 1);
    if (!result_) result_ = trigger_definition_1(builder_, level_ + 1);
    if (!result_) result_ = trigger_definition_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // KW_CRON LPAREN string_expression RPAREN
  private static boolean trigger_definition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trigger_definition_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_CRON, LPAREN);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_POLL_SCM LPAREN string_expression RPAREN
  private static boolean trigger_definition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trigger_definition_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_POLL_SCM, LPAREN);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_UPSTREAM LPAREN upstream_params RPAREN
  private static boolean trigger_definition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "trigger_definition_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_UPSTREAM, LPAREN);
    result_ = result_ && upstream_params(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_TRIGGERS LBRACE trigger_definition* RBRACE
  public static boolean triggers_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "triggers_block")) return false;
    if (!nextTokenIs(builder_, KW_TRIGGERS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_TRIGGERS, LBRACE);
    result_ = result_ && triggers_block_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, TRIGGERS_BLOCK, result_);
    return result_;
  }

  // trigger_definition*
  private static boolean triggers_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "triggers_block_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!trigger_definition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "triggers_block_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_TRY block_statement catch_clause* finally_clause?
  public static boolean try_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "try_statement")) return false;
    if (!nextTokenIs(builder_, KW_TRY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_TRY);
    result_ = result_ && block_statement(builder_, level_ + 1);
    result_ = result_ && try_statement_2(builder_, level_ + 1);
    result_ = result_ && try_statement_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, TRY_STATEMENT, result_);
    return result_;
  }

  // catch_clause*
  private static boolean try_statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "try_statement_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!catch_clause(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "try_statement_2", pos_)) break;
    }
    return true;
  }

  // finally_clause?
  private static boolean try_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "try_statement_3")) return false;
    finally_clause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER (DOT IDENTIFIER)* (LBRACKET RBRACKET)*
  public static boolean type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    result_ = result_ && type_1(builder_, level_ + 1);
    result_ = result_ && type_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE, result_);
    return result_;
  }

  // (DOT IDENTIFIER)*
  private static boolean type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!type_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_1", pos_)) break;
    }
    return true;
  }

  // DOT IDENTIFIER
  private static boolean type_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (LBRACKET RBRACKET)*
  private static boolean type_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!type_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_2", pos_)) break;
    }
    return true;
  }

  // LBRACKET RBRACKET
  private static boolean type_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LBRACKET, RBRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (PLUS | MINUS | NOT | BIT_NOT)? postfix_expression
  public static boolean unary_expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, UNARY_EXPRESSION, "<unary expression>");
    result_ = unary_expression_0(builder_, level_ + 1);
    result_ = result_ && postfix_expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (PLUS | MINUS | NOT | BIT_NOT)?
  private static boolean unary_expression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_expression_0")) return false;
    unary_expression_0_0(builder_, level_ + 1);
    return true;
  }

  // PLUS | MINUS | NOT | BIT_NOT
  private static boolean unary_expression_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_expression_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, NOT);
    if (!result_) result_ = consumeToken(builder_, BIT_NOT);
    return result_;
  }

  /* ********************************************************** */
  // LBRACE IDENTIFIER COLON string_expression COMMA IDENTIFIER COLON threshold_value RBRACE
  public static boolean upstream_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "upstream_params")) return false;
    if (!nextTokenIs(builder_, LBRACE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LBRACE, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMA, IDENTIFIER, COLON);
    result_ = result_ && threshold_value(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, UPSTREAM_PARAMS, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_DEF? IDENTIFIER (ASSIGN expression)?
  public static boolean variable_declaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_declaration")) return false;
    if (!nextTokenIs(builder_, "<variable declaration>", IDENTIFIER, KW_DEF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    result_ = variable_declaration_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENTIFIER);
    result_ = result_ && variable_declaration_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // KW_DEF?
  private static boolean variable_declaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_declaration_0")) return false;
    consumeToken(builder_, KW_DEF);
    return true;
  }

  // (ASSIGN expression)?
  private static boolean variable_declaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_declaration_2")) return false;
    variable_declaration_2_0(builder_, level_ + 1);
    return true;
  }

  // ASSIGN expression
  private static boolean variable_declaration_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable_declaration_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ASSIGN);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_WHEN LBRACE when_condition* RBRACE
  public static boolean when_block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_block")) return false;
    if (!nextTokenIs(builder_, KW_WHEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_WHEN, LBRACE);
    result_ = result_ && when_block_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, WHEN_BLOCK, result_);
    return result_;
  }

  // when_condition*
  private static boolean when_block_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_block_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!when_condition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "when_block_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LPAREN when_cr_options RPAREN
  public static boolean when_change_request_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_change_request_params")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && when_cr_options(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, WHEN_CHANGE_REQUEST_PARAMS, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_BRANCH string_expression
  //                 | KW_BUILDING_TAG LPAREN RPAREN
  //                 | KW_CHANGELOG string_expression
  //                 | KW_CHANGESET string_expression
  //                 | KW_CHANGE_REQUEST when_change_request_params?
  //                 | KW_ENVIRONMENT when_environment_params
  //                 | KW_EQUALS when_equals_params
  //                 | KW_EXPRESSION LBRACE groovy_code* RBRACE
  //                 | KW_TAG string_expression
  //                 | KW_NOT LBRACE when_condition* RBRACE
  //                 | KW_ALL_OF LBRACE when_condition* RBRACE
  //                 | KW_ANY_OF LBRACE when_condition* RBRACE
  public static boolean when_condition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, WHEN_CONDITION, "<when condition>");
    result_ = when_condition_0(builder_, level_ + 1);
    if (!result_) result_ = parseTokens(builder_, 0, KW_BUILDING_TAG, LPAREN, RPAREN);
    if (!result_) result_ = when_condition_2(builder_, level_ + 1);
    if (!result_) result_ = when_condition_3(builder_, level_ + 1);
    if (!result_) result_ = when_condition_4(builder_, level_ + 1);
    if (!result_) result_ = when_condition_5(builder_, level_ + 1);
    if (!result_) result_ = when_condition_6(builder_, level_ + 1);
    if (!result_) result_ = when_condition_7(builder_, level_ + 1);
    if (!result_) result_ = when_condition_8(builder_, level_ + 1);
    if (!result_) result_ = when_condition_9(builder_, level_ + 1);
    if (!result_) result_ = when_condition_10(builder_, level_ + 1);
    if (!result_) result_ = when_condition_11(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // KW_BRANCH string_expression
  private static boolean when_condition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_BRANCH);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_CHANGELOG string_expression
  private static boolean when_condition_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_CHANGELOG);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_CHANGESET string_expression
  private static boolean when_condition_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_CHANGESET);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_CHANGE_REQUEST when_change_request_params?
  private static boolean when_condition_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_CHANGE_REQUEST);
    result_ = result_ && when_condition_4_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // when_change_request_params?
  private static boolean when_condition_4_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_4_1")) return false;
    when_change_request_params(builder_, level_ + 1);
    return true;
  }

  // KW_ENVIRONMENT when_environment_params
  private static boolean when_condition_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_ENVIRONMENT);
    result_ = result_ && when_environment_params(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_EQUALS when_equals_params
  private static boolean when_condition_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_6")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_EQUALS);
    result_ = result_ && when_equals_params(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_EXPRESSION LBRACE groovy_code* RBRACE
  private static boolean when_condition_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_EXPRESSION, LBRACE);
    result_ = result_ && when_condition_7_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // groovy_code*
  private static boolean when_condition_7_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_7_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!groovy_code(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "when_condition_7_2", pos_)) break;
    }
    return true;
  }

  // KW_TAG string_expression
  private static boolean when_condition_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_8")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, KW_TAG);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // KW_NOT LBRACE when_condition* RBRACE
  private static boolean when_condition_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_9")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_NOT, LBRACE);
    result_ = result_ && when_condition_9_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // when_condition*
  private static boolean when_condition_9_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_9_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!when_condition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "when_condition_9_2", pos_)) break;
    }
    return true;
  }

  // KW_ALL_OF LBRACE when_condition* RBRACE
  private static boolean when_condition_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_10")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_ALL_OF, LBRACE);
    result_ = result_ && when_condition_10_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // when_condition*
  private static boolean when_condition_10_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_10_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!when_condition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "when_condition_10_2", pos_)) break;
    }
    return true;
  }

  // KW_ANY_OF LBRACE when_condition* RBRACE
  private static boolean when_condition_11(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_11")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_ANY_OF, LBRACE);
    result_ = result_ && when_condition_11_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // when_condition*
  private static boolean when_condition_11_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_condition_11_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!when_condition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "when_condition_11_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON string_expression
  public static boolean when_cr_options(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_cr_options")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, WHEN_CR_OPTIONS, result_);
    return result_;
  }

  /* ********************************************************** */
  // LPAREN IDENTIFIER COLON string_expression COMMA IDENTIFIER COLON string_expression RPAREN
  public static boolean when_environment_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_environment_params")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LPAREN, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMA, IDENTIFIER, COLON);
    result_ = result_ && string_expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, WHEN_ENVIRONMENT_PARAMS, result_);
    return result_;
  }

  /* ********************************************************** */
  // LPAREN IDENTIFIER COLON expression COMMA IDENTIFIER COLON expression RPAREN
  public static boolean when_equals_params(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "when_equals_params")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LPAREN, IDENTIFIER, COLON);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, COMMA, IDENTIFIER, COLON);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, WHEN_EQUALS_PARAMS, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_WHILE LPAREN expression RPAREN statement
  public static boolean while_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "while_statement")) return false;
    if (!nextTokenIs(builder_, KW_WHILE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_WHILE, LPAREN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, WHILE_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // KW_WITH_CREDENTIALS LPAREN credential_list RPAREN LBRACE step* RBRACE
  public static boolean withCredentials_step(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "withCredentials_step")) return false;
    if (!nextTokenIs(builder_, KW_WITH_CREDENTIALS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, KW_WITH_CREDENTIALS, LPAREN);
    result_ = result_ && credential_list(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, LBRACE);
    result_ = result_ && withCredentials_step_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACE);
    exit_section_(builder_, marker_, WITH_CREDENTIALS_STEP, result_);
    return result_;
  }

  // step*
  private static boolean withCredentials_step_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "withCredentials_step_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!step(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "withCredentials_step_5", pos_)) break;
    }
    return true;
  }

}
