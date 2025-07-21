package org.example.jenkinsfile_support.editor

import com.intellij.lang.Commenter

/**
 * Commenter for Jenkinsfile language.
 * Provides support for line and block comments.
 */
class JenkinsfileCommenter : Commenter {
    
    override fun getLineCommentPrefix(): String = "//"
    
    override fun getBlockCommentPrefix(): String = "/*"
    
    override fun getBlockCommentSuffix(): String = "*/"
    
    override fun getCommentedBlockCommentPrefix(): String? = null
    
    override fun getCommentedBlockCommentSuffix(): String? = null
}