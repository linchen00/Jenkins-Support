// This is a generated file. Not intended for manual editing.
package org.example.jenkinsfile_support.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JenkinsfileAssignmentExpression extends PsiElement {

  @NotNull
  JenkinsfileAssignmentOperator getAssignmentOperator();

  @NotNull
  JenkinsfileExpression getExpression();

  @NotNull
  PsiElement getIdentifier();

}
