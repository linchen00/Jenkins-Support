// This is a generated file. Not intended for manual editing.
package org.example.jenkinsfile_support.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JenkinsfileAgentContent extends PsiElement {

  @Nullable
  JenkinsfileDockerSpec getDockerSpec();

  @Nullable
  JenkinsfileDockerfileSpec getDockerfileSpec();

  @Nullable
  JenkinsfileKubernetesSpec getKubernetesSpec();

  @Nullable
  JenkinsfileStringExpression getStringExpression();

}
