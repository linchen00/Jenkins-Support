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

public class JenkinsfileFunctionDeclarationImpl extends ASTWrapperPsiElement implements JenkinsfileFunctionDeclaration {

  public JenkinsfileFunctionDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsfileVisitor visitor) {
    visitor.visitFunctionDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JenkinsfileVisitor) accept((JenkinsfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JenkinsfileBlockStatement getBlockStatement() {
    return findNotNullChildByClass(JenkinsfileBlockStatement.class);
  }

  @Override
  @Nullable
  public JenkinsfileParameterList getParameterList() {
    return findChildByClass(JenkinsfileParameterList.class);
  }

  @Override
  @Nullable
  public JenkinsfileType getType() {
    return findChildByClass(JenkinsfileType.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
