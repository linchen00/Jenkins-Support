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

public class JenkinsfileControlStatementImpl extends ASTWrapperPsiElement implements JenkinsfileControlStatement {

  public JenkinsfileControlStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsfileVisitor visitor) {
    visitor.visitControlStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JenkinsfileVisitor) accept((JenkinsfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JenkinsfileBreakStatement getBreakStatement() {
    return findChildByClass(JenkinsfileBreakStatement.class);
  }

  @Override
  @Nullable
  public JenkinsfileContinueStatement getContinueStatement() {
    return findChildByClass(JenkinsfileContinueStatement.class);
  }

  @Override
  @Nullable
  public JenkinsfileForStatement getForStatement() {
    return findChildByClass(JenkinsfileForStatement.class);
  }

  @Override
  @Nullable
  public JenkinsfileIfStatement getIfStatement() {
    return findChildByClass(JenkinsfileIfStatement.class);
  }

  @Override
  @Nullable
  public JenkinsfileSwitchStatement getSwitchStatement() {
    return findChildByClass(JenkinsfileSwitchStatement.class);
  }

  @Override
  @Nullable
  public JenkinsfileWhileStatement getWhileStatement() {
    return findChildByClass(JenkinsfileWhileStatement.class);
  }

}
