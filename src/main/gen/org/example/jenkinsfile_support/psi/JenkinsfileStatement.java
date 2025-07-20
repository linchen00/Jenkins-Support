// This is a generated file. Not intended for manual editing.
package org.example.jenkinsfile_support.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JenkinsfileStatement extends PsiElement {

  @Nullable
  JenkinsfileControlStatement getControlStatement();

  @Nullable
  JenkinsfileDeclaration getDeclaration();

  @Nullable
  JenkinsfileExpressionStatement getExpressionStatement();

  @Nullable
  JenkinsfileImportStatement getImportStatement();

  @Nullable
  JenkinsfilePackageStatement getPackageStatement();

  @Nullable
  JenkinsfileReturnStatement getReturnStatement();

  @Nullable
  JenkinsfileThrowStatement getThrowStatement();

  @Nullable
  JenkinsfileTryStatement getTryStatement();

}
