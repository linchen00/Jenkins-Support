package org.example.jenkinsfile_support.highlighting

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import org.example.jenkinsfile_support.JenkinsfileIcons
import javax.swing.Icon

/**
 * Color settings page for Jenkinsfile syntax highlighting configuration.
 */
class JenkinsfileColorSettingsPage : ColorSettingsPage {
    
    private val descriptors = arrayOf(
        AttributesDescriptor("Pipeline keyword", JenkinsfileColors.PIPELINE_KEYWORD),
        AttributesDescriptor("Agent type", JenkinsfileColors.AGENT_TYPE),
        AttributesDescriptor("Built-in step", JenkinsfileColors.BUILTIN_STEP),
        AttributesDescriptor("Post condition", JenkinsfileColors.POST_CONDITION),
        AttributesDescriptor("When condition", JenkinsfileColors.WHEN_CONDITION),
        AttributesDescriptor("Parameter type", JenkinsfileColors.PARAMETER_TYPE),
        AttributesDescriptor("Trigger type", JenkinsfileColors.TRIGGER_TYPE),
        AttributesDescriptor("Credential type", JenkinsfileColors.CREDENTIAL_TYPE),
        AttributesDescriptor("Groovy keyword", JenkinsfileColors.GROOVY_KEYWORD),
        AttributesDescriptor("String literal", JenkinsfileColors.STRING_LITERAL),
        AttributesDescriptor("GString interpolation", JenkinsfileColors.GSTRING),
        AttributesDescriptor("Number", JenkinsfileColors.NUMBER),
        AttributesDescriptor("Boolean literal", JenkinsfileColors.BOOLEAN_LITERAL),
        AttributesDescriptor("Null literal", JenkinsfileColors.NULL_LITERAL),
        AttributesDescriptor("Line comment", JenkinsfileColors.COMMENT),
        AttributesDescriptor("Block comment", JenkinsfileColors.BLOCK_COMMENT),
        AttributesDescriptor("Operator", JenkinsfileColors.OPERATOR),
        AttributesDescriptor("Separator", JenkinsfileColors.SEPARATOR),
        AttributesDescriptor("Braces", JenkinsfileColors.BRACES),
        AttributesDescriptor("Brackets", JenkinsfileColors.BRACKETS),
        AttributesDescriptor("Parentheses", JenkinsfileColors.PARENTHESES),
        AttributesDescriptor("Identifier", JenkinsfileColors.IDENTIFIER)
    )
    
    override fun getAttributeDescriptors(): Array<AttributesDescriptor> = descriptors
    
    override fun getColorDescriptors(): Array<ColorDescriptor> = emptyArray()
    
    override fun getDisplayName(): String = "Jenkinsfile"
    
    override fun getIcon(): Icon? = JenkinsfileIcons.FILE
    
    override fun getHighlighter(): SyntaxHighlighter = JenkinsfileSyntaxHighlighter()
    
    override fun getDemoText(): String = """
        // Declarative Pipeline example with all syntax elements
        pipeline {
            // Agent configuration
            agent {
                docker {
                    image 'maven:3.8.1-adoptopenjdk-11'
                    args '-v /root/.m2:/root/.m2'
                }
            }
            
            // Environment variables
            environment {
                MAVEN_OPTS = '-Xmx3072m'
                DISABLE_AUTH = 'true'
                VERSION = "${'$'}{BUILD_NUMBER}"
            }
            
            // Build parameters
            parameters {
                string(name: 'BRANCH', defaultValue: 'main', description: 'Branch to build')
                choice(name: 'ENVIRONMENT', choices: ['dev', 'staging', 'prod'], description: 'Target environment')
                booleanParam(name: 'SKIP_TESTS', defaultValue: false, description: 'Skip test execution')
            }
            
            // Build triggers
            triggers {
                cron('H 2 * * 1-5')
                pollSCM('H/15 * * * *')
            }
            
            // Build options
            options {
                buildDiscarder(logRotator(numToKeepStr: '10'))
                timeout(time: 60, unit: 'MINUTES')
                skipDefaultCheckout(true)
            }
            
            // Build stages
            stages {
                stage('Checkout') {
                    steps {
                        // SCM checkout
                        checkout scm
                        
                        // Shell commands
                        sh '''
                            echo "Building version: ${'$'}VERSION"
                            git log --oneline -10
                        '''
                    }
                }
                
                stage('Build & Test') {
                    when {
                        not { params.SKIP_TESTS }
                        anyOf {
                            branch 'main'
                            branch 'develop'
                        }
                    }
                    
                    parallel {
                        stage('Unit Tests') {
                            steps {
                                sh 'mvn clean test'
                                publishTestResults testResultsPattern: 'target/surefire-reports/*.xml'
                            }
                        }
                        
                        stage('Integration Tests') {
                            steps {
                                sh 'mvn integration-test'
                            }
                        }
                    }
                }
                
                stage('Package') {
                    steps {
                        sh 'mvn package -DskipTests'
                        archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
                        
                        // Stash for later stages
                        stash includes: 'target/*.jar', name: 'app-artifacts'
                    }
                }
                
                stage('Deploy') {
                    when {
                        expression { params.ENVIRONMENT != 'prod' || env.BRANCH_NAME == 'main' }
                    }
                    
                    steps {
                        script {
                            // Groovy script block
                            def deployTarget = params.ENVIRONMENT
                            def artifacts = unstash 'app-artifacts'
                            
                            echo "Deploying to: ${'$'}{deployTarget}"
                            
                            // Conditional logic
                            if (deployTarget == 'prod') {
                                input message: 'Deploy to production?', ok: 'Deploy'
                            }
                            
                            // Deployment with credentials
                            withCredentials([
                                usernamePassword(credentialsId: 'deploy-creds', 
                                               usernameVariable: 'DEPLOY_USER', 
                                               passwordVariable: 'DEPLOY_PASS'),
                                sshUserPrivateKey(credentialsId: 'ssh-key', 
                                                keyFileVariable: 'SSH_KEY')
                            ]) {
                                sh '''
                                    echo "Deploying as user: ${'$'}DEPLOY_USER"
                                    scp -i ${'$'}SSH_KEY target/*.jar deploy@server:/opt/app/
                                '''
                            }
                        }
                    }
                }
            }
            
            // Post-build actions
            post {
                always {
                    echo 'Pipeline finished'
                    deleteDir()
                }
                
                success {
                    echo 'Build succeeded!'
                    // Notification logic here
                }
                
                failure {
                    echo 'Build failed!'
                    // Send alert
                }
                
                unstable {
                    echo 'Build is unstable'
                }
                
                changed {
                    echo 'Build status changed'
                }
                
                cleanup {
                    echo 'Cleaning up...'
                }
            }
        }
        
        /* Multi-line comment example
           This demonstrates block comments
           in Jenkinsfile syntax */
        
        // Scripted Pipeline example (alternative syntax)
        node {
            try {
                stage('Scripted Build') {
                    // Direct Groovy code
                    def workspace = pwd()
                    def buildNumber = env.BUILD_NUMBER
                    
                    echo "Working in: ${'$'}{workspace}"
                    echo "Build number: ${'$'}{buildNumber}"
                    
                    // Array and map literals
                    def environments = ['dev', 'staging', 'prod']
                    def config = [
                        timeout: 30,
                        retries: 3,
                        parallel: true
                    ]
                    
                    // Loop example
                    for (env in environments) {
                        echo "Environment: ${'$'}{env}"
                    }
                    
                    // Conditional with complex expression
                    if (config.parallel && buildNumber.toInteger() > 100) {
                        parallel([
                            'task1': { echo 'Task 1' },
                            'task2': { echo 'Task 2' }
                        ])
                    }
                }
            } catch (Exception e) {
                currentBuild.result = 'FAILURE'
                throw e
            } finally {
                // Cleanup code
                echo 'Scripted pipeline cleanup'
            }
        }
    """.trimIndent()
    
    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? = null
}