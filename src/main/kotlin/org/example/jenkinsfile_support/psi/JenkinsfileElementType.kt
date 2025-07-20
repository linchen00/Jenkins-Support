package org.example.jenkinsfile_support.psi

import com.intellij.psi.tree.IElementType
import org.example.jenkinsfile_support.JenkinsfileLanguage

class JenkinsfileElementType(debugName: String) : IElementType(debugName, JenkinsfileLanguage)