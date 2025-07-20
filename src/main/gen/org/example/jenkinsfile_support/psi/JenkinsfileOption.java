// This is a generated file. Not intended for manual editing.
package org.example.jenkinsfile_support.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JenkinsfileOption extends PsiElement {

  @Nullable
  JenkinsfileBooleanExpression getBooleanExpression();

  @Nullable
  JenkinsfileBuildDiscarderParams getBuildDiscarderParams();

  @Nullable
  JenkinsfileNumberExpression getNumberExpression();

  @Nullable
  JenkinsfileTimeoutParams getTimeoutParams();

  @NotNull
  PsiElement getIdentifier();

}
