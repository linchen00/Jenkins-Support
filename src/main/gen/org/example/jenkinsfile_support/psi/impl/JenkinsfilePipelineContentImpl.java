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

public class JenkinsfilePipelineContentImpl extends ASTWrapperPsiElement implements JenkinsfilePipelineContent {

  public JenkinsfilePipelineContentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsfileVisitor visitor) {
    visitor.visitPipelineContent(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JenkinsfileVisitor) accept((JenkinsfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JenkinsfileAgentBlock getAgentBlock() {
    return findChildByClass(JenkinsfileAgentBlock.class);
  }

  @Override
  @Nullable
  public JenkinsfileEnvironmentBlock getEnvironmentBlock() {
    return findChildByClass(JenkinsfileEnvironmentBlock.class);
  }

  @Override
  @Nullable
  public JenkinsfileLibraryBlock getLibraryBlock() {
    return findChildByClass(JenkinsfileLibraryBlock.class);
  }

  @Override
  @Nullable
  public JenkinsfileOptionsBlock getOptionsBlock() {
    return findChildByClass(JenkinsfileOptionsBlock.class);
  }

  @Override
  @Nullable
  public JenkinsfileParametersBlock getParametersBlock() {
    return findChildByClass(JenkinsfileParametersBlock.class);
  }

  @Override
  @Nullable
  public JenkinsfilePostBlock getPostBlock() {
    return findChildByClass(JenkinsfilePostBlock.class);
  }

  @Override
  @Nullable
  public JenkinsfileStagesBlock getStagesBlock() {
    return findChildByClass(JenkinsfileStagesBlock.class);
  }

  @Override
  @Nullable
  public JenkinsfileToolsBlock getToolsBlock() {
    return findChildByClass(JenkinsfileToolsBlock.class);
  }

  @Override
  @Nullable
  public JenkinsfileTriggersBlock getTriggersBlock() {
    return findChildByClass(JenkinsfileTriggersBlock.class);
  }

}
