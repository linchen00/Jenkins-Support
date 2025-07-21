package org.example.jenkinsfile_support.highlighting

import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

/**
 * Factory for creating Jenkinsfile syntax highlighters.
 */
class JenkinsfileSyntaxHighlighterFactory : SyntaxHighlighterFactory() {
    
    override fun getSyntaxHighlighter(project: Project?, virtualFile: VirtualFile?): SyntaxHighlighter {
        return JenkinsfileSyntaxHighlighter()
    }
}