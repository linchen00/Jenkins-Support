// This is a generated file. Not intended for manual editing.
package org.example.jenkinsfile_support.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JenkinsfileStageBlock extends PsiElement {

  @NotNull
  List<JenkinsfileStageContent> getStageContentList();

  @NotNull
  JenkinsfileStringExpression getStringExpression();

}
