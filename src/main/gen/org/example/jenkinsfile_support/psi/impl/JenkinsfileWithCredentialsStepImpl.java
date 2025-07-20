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

public class JenkinsfileWithCredentialsStepImpl extends ASTWrapperPsiElement implements JenkinsfileWithCredentialsStep {

  public JenkinsfileWithCredentialsStepImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsfileVisitor visitor) {
    visitor.visitWithCredentialsStep(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JenkinsfileVisitor) accept((JenkinsfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JenkinsfileCredentialList getCredentialList() {
    return findNotNullChildByClass(JenkinsfileCredentialList.class);
  }

  @Override
  @NotNull
  public List<JenkinsfileStep> getStepList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JenkinsfileStep.class);
  }

}
