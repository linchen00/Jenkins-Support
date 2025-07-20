// This is a generated file. Not intended for manual editing.
package org.example.jenkinsfile_support.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JenkinsfileConstructorDeclaration extends PsiElement {

  @NotNull
  JenkinsfileBlockStatement getBlockStatement();

  @NotNull
  List<JenkinsfileModifier> getModifierList();

  @Nullable
  JenkinsfileParameterList getParameterList();

  @NotNull
  PsiElement getIdentifier();

}
