package org.example.jenkinsfile_support.lexer

import com.intellij.lexer.FlexAdapter
import java.io.Reader

class JenkinsfileLexerAdapter : FlexAdapter(JenkinsfileLexer(null as Reader?))