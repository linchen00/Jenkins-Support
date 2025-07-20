// This is a generated file. Not intended for manual editing.
package org.example.jenkinsfile_support.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.example.jenkinsfile_support.psi.JenkinsfileTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.example.jenkinsfile_support.psi.*;

public class JenkinsfilePrimaryExpressionImpl extends ASTWrapperPsiElement implements JenkinsfilePrimaryExpression {

  public JenkinsfilePrimaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsfileVisitor visitor) {
    visitor.visitPrimaryExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JenkinsfileVisitor) accept((JenkinsfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JenkinsfileArrayLiteral getArrayLiteral() {
    return findChildByClass(JenkinsfileArrayLiteral.class);
  }

  @Override
  @Nullable
  public JenkinsfileClosureExpression getClosureExpression() {
    return findChildByClass(JenkinsfileClosureExpression.class);
  }

  @Override
  @Nullable
  public JenkinsfileExpression getExpression() {
    return findChildByClass(JenkinsfileExpression.class);
  }

  @Override
  @Nullable
  public JenkinsfileGstringExpression getGstringExpression() {
    return findChildByClass(JenkinsfileGstringExpression.class);
  }

  @Override
  @Nullable
  public JenkinsfileLiteral getLiteral() {
    return findChildByClass(JenkinsfileLiteral.class);
  }

  @Override
  @Nullable
  public JenkinsfileMapLiteral getMapLiteral() {
    return findChildByClass(JenkinsfileMapLiteral.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
