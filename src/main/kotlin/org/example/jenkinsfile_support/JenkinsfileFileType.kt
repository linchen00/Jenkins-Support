package org.example.jenkinsfile_support

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object JenkinsfileFileType : LanguageFileType(JenkinsfileLanguage) {
    override fun getName(): String = "Jenkinsfile"
    
    override fun getDescription(): String = "Jenkins Pipeline Configuration File"
    
    override fun getDefaultExtension(): String = "jenkinsfile"
    
    override fun getIcon(): Icon? = JenkinsfileIcons.FILE
}