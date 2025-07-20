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

public class JenkinsfileBuiltinStepImpl extends ASTWrapperPsiElement implements JenkinsfileBuiltinStep {

  public JenkinsfileBuiltinStepImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsfileVisitor visitor) {
    visitor.visitBuiltinStep(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JenkinsfileVisitor) accept((JenkinsfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JenkinsfileBuildParams getBuildParams() {
    return findChildByClass(JenkinsfileBuildParams.class);
  }

  @Override
  @Nullable
  public JenkinsfileGitParams getGitParams() {
    return findChildByClass(JenkinsfileGitParams.class);
  }

  @Override
  @Nullable
  public JenkinsfileScmExpression getScmExpression() {
    return findChildByClass(JenkinsfileScmExpression.class);
  }

  @Override
  @Nullable
  public JenkinsfileShParams getShParams() {
    return findChildByClass(JenkinsfileShParams.class);
  }

  @Override
  @Nullable
  public JenkinsfileStashParams getStashParams() {
    return findChildByClass(JenkinsfileStashParams.class);
  }

  @Override
  @Nullable
  public JenkinsfileStringExpression getStringExpression() {
    return findChildByClass(JenkinsfileStringExpression.class);
  }

  @Override
  @Nullable
  public JenkinsfileTestParams getTestParams() {
    return findChildByClass(JenkinsfileTestParams.class);
  }

  @Override
  @Nullable
  public JenkinsfileTimeParams getTimeParams() {
    return findChildByClass(JenkinsfileTimeParams.class);
  }

}
