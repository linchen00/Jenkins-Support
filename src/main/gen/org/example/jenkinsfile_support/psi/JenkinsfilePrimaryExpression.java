// This is a generated file. Not intended for manual editing.
package org.example.jenkinsfile_support.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JenkinsfilePrimaryExpression extends PsiElement {

  @Nullable
  JenkinsfileArrayLiteral getArrayLiteral();

  @Nullable
  JenkinsfileClosureExpression getClosureExpression();

  @Nullable
  JenkinsfileExpression getExpression();

  @Nullable
  JenkinsfileGstringExpression getGstringExpression();

  @Nullable
  JenkinsfileLiteral getLiteral();

  @Nullable
  JenkinsfileMapLiteral getMapLiteral();

  @Nullable
  PsiElement getIdentifier();

}
