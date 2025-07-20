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

public class JenkinsfileScmDefinitionImpl extends ASTWrapperPsiElement implements JenkinsfileScmDefinition {

  public JenkinsfileScmDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsfileVisitor visitor) {
    visitor.visitScmDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JenkinsfileVisitor) accept((JenkinsfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JenkinsfileScmOption> getScmOptionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JenkinsfileScmOption.class);
  }

  @Override
  @NotNull
  public List<JenkinsfileStringExpression> getStringExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JenkinsfileStringExpression.class);
  }

}
