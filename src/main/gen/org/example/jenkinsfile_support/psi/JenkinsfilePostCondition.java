// This is a generated file. Not intended for manual editing.
package org.example.jenkinsfile_support.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JenkinsfilePostCondition extends PsiElement {

  @NotNull
  JenkinsfilePostConditionType getPostConditionType();

  @NotNull
  List<JenkinsfileStep> getStepList();

}
