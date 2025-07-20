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

public class JenkinsfileTryStatementImpl extends ASTWrapperPsiElement implements JenkinsfileTryStatement {

  public JenkinsfileTryStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsfileVisitor visitor) {
    visitor.visitTryStatement(this);
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
  public List<JenkinsfileCatchClause> getCatchClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JenkinsfileCatchClause.class);
  }

  @Override
  @Nullable
  public JenkinsfileFinallyClause getFinallyClause() {
    return findChildByClass(JenkinsfileFinallyClause.class);
  }

}
