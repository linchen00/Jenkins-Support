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

public class JenkinsfileAgentContentImpl extends ASTWrapperPsiElement implements JenkinsfileAgentContent {

  public JenkinsfileAgentContentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsfileVisitor visitor) {
    visitor.visitAgentContent(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JenkinsfileVisitor) accept((JenkinsfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JenkinsfileDockerSpec getDockerSpec() {
    return findChildByClass(JenkinsfileDockerSpec.class);
  }

  @Override
  @Nullable
  public JenkinsfileDockerfileSpec getDockerfileSpec() {
    return findChildByClass(JenkinsfileDockerfileSpec.class);
  }

  @Override
  @Nullable
  public JenkinsfileKubernetesSpec getKubernetesSpec() {
    return findChildByClass(JenkinsfileKubernetesSpec.class);
  }

  @Override
  @Nullable
  public JenkinsfileStringExpression getStringExpression() {
    return findChildByClass(JenkinsfileStringExpression.class);
  }

}
