// This is a generated file. Not intended for manual editing.
package org.example.jenkinsfile_support.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JenkinsfileBuiltinStep extends PsiElement {

  @Nullable
  JenkinsfileBuildParams getBuildParams();

  @Nullable
  JenkinsfileGitParams getGitParams();

  @Nullable
  JenkinsfileScmExpression getScmExpression();

  @Nullable
  JenkinsfileShParams getShParams();

  @Nullable
  JenkinsfileStashParams getStashParams();

  @Nullable
  JenkinsfileStringExpression getStringExpression();

  @Nullable
  JenkinsfileTestParams getTestParams();

  @Nullable
  JenkinsfileTimeParams getTimeParams();

}
