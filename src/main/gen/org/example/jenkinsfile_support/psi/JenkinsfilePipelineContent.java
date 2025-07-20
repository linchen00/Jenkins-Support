// This is a generated file. Not intended for manual editing.
package org.example.jenkinsfile_support.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JenkinsfilePipelineContent extends PsiElement {

  @Nullable
  JenkinsfileAgentBlock getAgentBlock();

  @Nullable
  JenkinsfileEnvironmentBlock getEnvironmentBlock();

  @Nullable
  JenkinsfileLibraryBlock getLibraryBlock();

  @Nullable
  JenkinsfileOptionsBlock getOptionsBlock();

  @Nullable
  JenkinsfileParametersBlock getParametersBlock();

  @Nullable
  JenkinsfilePostBlock getPostBlock();

  @Nullable
  JenkinsfileStagesBlock getStagesBlock();

  @Nullable
  JenkinsfileToolsBlock getToolsBlock();

  @Nullable
  JenkinsfileTriggersBlock getTriggersBlock();

}
