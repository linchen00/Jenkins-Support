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

public class JenkinsfileMatrixContentImpl extends ASTWrapperPsiElement implements JenkinsfileMatrixContent {

  public JenkinsfileMatrixContentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsfileVisitor visitor) {
    visitor.visitMatrixContent(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JenkinsfileVisitor) accept((JenkinsfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JenkinsfileAxesBlock getAxesBlock() {
    return findChildByClass(JenkinsfileAxesBlock.class);
  }

  @Override
  @Nullable
  public JenkinsfileExcludesBlock getExcludesBlock() {
    return findChildByClass(JenkinsfileExcludesBlock.class);
  }

  @Override
  @Nullable
  public JenkinsfileStagesBlock getStagesBlock() {
    return findChildByClass(JenkinsfileStagesBlock.class);
  }

}
