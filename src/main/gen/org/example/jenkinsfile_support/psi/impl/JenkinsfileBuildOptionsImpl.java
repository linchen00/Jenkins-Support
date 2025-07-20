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

public class JenkinsfileBuildOptionsImpl extends ASTWrapperPsiElement implements JenkinsfileBuildOptions {

  public JenkinsfileBuildOptionsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsfileVisitor visitor) {
    visitor.visitBuildOptions(this);
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
  public JenkinsfileParameterArray getParameterArray() {
    return findChildByClass(JenkinsfileParameterArray.class);
  }

  @Override
  @Nullable
  public JenkinsfileStringExpression getStringExpression() {
    return findChildByClass(JenkinsfileStringExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
