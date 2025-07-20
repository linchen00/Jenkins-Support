// This is a generated file. Not intended for manual editing.
package org.example.jenkinsfile_support.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JenkinsfileWhenCondition extends PsiElement {

  @NotNull
  List<JenkinsfileGroovyCode> getGroovyCodeList();

  @Nullable
  JenkinsfileStringExpression getStringExpression();

  @Nullable
  JenkinsfileWhenChangeRequestParams getWhenChangeRequestParams();

  @NotNull
  List<JenkinsfileWhenCondition> getWhenConditionList();

  @Nullable
  JenkinsfileWhenEnvironmentParams getWhenEnvironmentParams();

  @Nullable
  JenkinsfileWhenEqualsParams getWhenEqualsParams();

}
