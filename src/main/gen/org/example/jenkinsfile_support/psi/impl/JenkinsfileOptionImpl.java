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

public class JenkinsfileOptionImpl extends ASTWrapperPsiElement implements JenkinsfileOption {

  public JenkinsfileOptionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsfileVisitor visitor) {
    visitor.visitOption(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JenkinsfileVisitor) accept((JenkinsfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JenkinsfileBooleanExpression getBooleanExpression() {
    return findChildByClass(JenkinsfileBooleanExpression.class);
  }

  @Override
  @Nullable
  public JenkinsfileBuildDiscarderParams getBuildDiscarderParams() {
    return findChildByClass(JenkinsfileBuildDiscarderParams.class);
  }

  @Override
  @Nullable
  public JenkinsfileNumberExpression getNumberExpression() {
    return findChildByClass(JenkinsfileNumberExpression.class);
  }

  @Override
  @Nullable
  public JenkinsfileTimeoutParams getTimeoutParams() {
    return findChildByClass(JenkinsfileTimeoutParams.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
