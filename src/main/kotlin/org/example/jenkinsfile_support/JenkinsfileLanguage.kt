package org.example.jenkinsfile_support

import com.intellij.lang.Language

object JenkinsfileLanguage : Language("Jenkinsfile", "text/x-jenkinsfile") {
    override fun getDisplayName(): String = "Jenkinsfile"
    
    override fun isCaseSensitive(): Boolean = true
}