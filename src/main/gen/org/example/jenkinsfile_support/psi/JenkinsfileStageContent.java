// This is a generated file. Not intended for manual editing.
package org.example.jenkinsfile_support.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JenkinsfileStageContent extends PsiElement {

  @Nullable
  JenkinsfileAgentBlock getAgentBlock();

  @Nullable
  JenkinsfileEnvironmentBlock getEnvironmentBlock();

  @Nullable
  JenkinsfileInputBlock getInputBlock();

  @Nullable
  JenkinsfileMatrixBlock getMatrixBlock();

  @Nullable
  JenkinsfileParallelBlock getParallelBlock();

  @Nullable
  JenkinsfilePostBlock getPostBlock();

  @Nullable
  JenkinsfileStepsBlock getStepsBlock();

  @Nullable
  JenkinsfileToolsBlock getToolsBlock();

  @Nullable
  JenkinsfileWhenBlock getWhenBlock();

}
