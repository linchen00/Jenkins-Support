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

public class JenkinsfileStatementImpl extends ASTWrapperPsiElement implements JenkinsfileStatement {

  public JenkinsfileStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JenkinsfileVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JenkinsfileVisitor) accept((JenkinsfileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JenkinsfileControlStatement getControlStatement() {
    return findChildByClass(JenkinsfileControlStatement.class);
  }

  @Override
  @Nullable
  public JenkinsfileDeclaration getDeclaration() {
    return findChildByClass(JenkinsfileDeclaration.class);
  }

  @Override
  @Nullable
  public JenkinsfileExpressionStatement getExpressionStatement() {
    return findChildByClass(JenkinsfileExpressionStatement.class);
  }

  @Override
  @Nullable
  public JenkinsfileImportStatement getImportStatement() {
    return findChildByClass(JenkinsfileImportStatement.class);
  }

  @Override
  @Nullable
  public JenkinsfilePackageStatement getPackageStatement() {
    return findChildByClass(JenkinsfilePackageStatement.class);
  }

  @Override
  @Nullable
  public JenkinsfileReturnStatement getReturnStatement() {
    return findChildByClass(JenkinsfileReturnStatement.class);
  }

  @Override
  @Nullable
  public JenkinsfileThrowStatement getThrowStatement() {
    return findChildByClass(JenkinsfileThrowStatement.class);
  }

  @Override
  @Nullable
  public JenkinsfileTryStatement getTryStatement() {
    return findChildByClass(JenkinsfileTryStatement.class);
  }

}
