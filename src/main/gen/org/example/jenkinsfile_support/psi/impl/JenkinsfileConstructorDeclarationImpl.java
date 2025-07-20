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

public class JenkinsfileConstructorDeclarationImpl extends ASTWrapperPsiElement implements JenkinsfileConstructorDeclaration {

  public JenkinsfileConstructorDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsfileVisitor visitor) {
    visitor.visitConstructorDeclaration(this);
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
  @NotNull
  public List<JenkinsfileModifier> getModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JenkinsfileModifier.class);
  }

  @Override
  @Nullable
  public JenkinsfileParameterList getParameterList() {
    return findChildByClass(JenkinsfileParameterList.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
