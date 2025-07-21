package org.example.jenkinsfile_support.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.example.jenkinsfile_support.JenkinsfileFileType
import org.example.jenkinsfile_support.JenkinsfileLanguage

/**
 * PSI file representation for Jenkinsfile.
 */
class JenkinsfileFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, JenkinsfileLanguage) {
    
    override fun getFileType(): FileType {
        return JenkinsfileFileType
    }
    
    override fun toString(): String {
        return "Jenkinsfile File"
    }
}