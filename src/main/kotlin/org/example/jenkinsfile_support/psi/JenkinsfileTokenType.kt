package org.example.jenkinsfile_support.psi

import com.intellij.psi.tree.IElementType
import org.example.jenkinsfile_support.JenkinsfileLanguage

class JenkinsfileTokenType(debugName: String) : IElementType(debugName, JenkinsfileLanguage) {
    override fun toString(): String = "JenkinsfileTokenType." + super.toString()
}