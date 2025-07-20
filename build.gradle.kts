import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "2.1.0"
    id("org.jetbrains.intellij.platform") version "2.5.0"
    id("org.jetbrains.grammarkit") version "2022.3.2.2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html
dependencies {
    intellijPlatform {
        create("IC", "2025.1")
        testFramework(org.jetbrains.intellij.platform.gradle.TestFrameworkType.Platform)

        // Add necessary plugin dependencies for compilation here, example:
        // bundledPlugin("com.intellij.java")
    }
}

sourceSets["main"].java.srcDir("src/main/gen")

intellijPlatform {
    pluginConfiguration {
        ideaVersion {
            sinceBuild = "251"
        }

        changeNotes = """
      Initial version
    """.trimIndent()
    }
}

// Configure Grammar-Kit
tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "21"
        targetCompatibility = "21"
    }
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        compilerOptions.jvmTarget.set(JvmTarget.JVM_21)
    }
    
    // Generate parser from BNF
    generateParser {
        sourceFile.set(file("src/main/bnf/Jenkinsfile.bnf"))
        targetRootOutputDir.set(file("src/main/gen"))
        pathToParser.set("org/example/jenkinsfile_support/parser/JenkinsfileParser.java")
        pathToPsiRoot.set("org/example/jenkinsfile_support/psi")
    }

    // Generate lexer from Flex
    generateLexer {
        sourceFile.set(file("src/main/flex/JenkinsfileLexer.flex"))
        targetOutputDir.set(file("src/main/gen/org/example/jenkinsfile_support/lexer"))
    }

    compileJava {
        dependsOn("generateLexer")
    }
    
    // Make compileKotlin depend on generateParser and generateLexer
    compileKotlin {
        dependsOn("generateParser", "generateLexer")
    }
}