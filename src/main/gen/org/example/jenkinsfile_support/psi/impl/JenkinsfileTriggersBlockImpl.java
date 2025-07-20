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

public class JenkinsfileTriggersBlockImpl extends ASTWrapperPsiElement implements JenkinsfileTriggersBlock {

  public JenkinsfileTriggersBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsfileVisitor visitor) {
    visitor.visitTriggersBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JenkinsfileVisitor) accept((JenkinsfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JenkinsfileTriggerDefinition> getTriggerDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JenkinsfileTriggerDefinition.class);
  }

}
