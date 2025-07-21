# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 项目概述

这是一个为 Jenkins Pipeline 文件（Jenkinsfile）提供语言支持的 IntelliJ IDEA 插件。该插件实现了完整的语言定义，包括词法分析、语法解析和 IDE 集成功能。

## 架构

### 代码生成流水线
项目使用语法驱动的方法来生成解析器和词法分析器代码：

1. **语法定义** (`src/main/bnf/Jenkinsfile.bnf`)：使用 BNF 表示法定义完整的 Jenkinsfile 语法，包括声明式和脚本式流水线语法
2. **词法分析** (`src/main/flex/JenkinsfileLexer.flex`)：JFlex 词法分析器规范，用于生成标记器
3. **生成的代码** (`src/main/gen/`)：包含从 BNF 语法自动生成的解析器和 PSI 类

构建过程会自动生成：
- `JenkinsfileParser.java` 和相关的 PSI（程序结构接口）类
- 从 Flex 规范生成的 `JenkinsfileLexer.java`

### 语言实现
- **语言定义** (`JenkinsfileLanguage.kt`)：为 IntelliJ 定义语言实例
- **文件类型** (`JenkinsfileFileType.kt`)：将语言与 `.jenkinsfile` 文件和 `Jenkinsfile` 模式关联
- **词法分析器适配器** (`JenkinsfileLexerAdapter.kt`)：将生成的词法分析器与 IntelliJ 的词法分析器接口连接

## 常用开发命令

### 构建和生成代码
```bash
./gradlew build
```

### 生成解析器和词法分析器（编译前）
```bash
./gradlew generateParser generateLexer
```

### 运行测试
```bash
./gradlew test
```

### 在 IDE 中运行插件
```bash
./gradlew runIde
```

### 清理生成的代码
```bash
./gradlew clean
```

## 关键依赖

- **Grammar-Kit 插件**：从 BNF 语法生成解析器和 PSI 类
- **IntelliJ 平台**：提供 IDE 框架和 API
- **JFlex**：从 `.flex` 规范生成词法分析器

## 语法修改工作流程

修改 Jenkinsfile 语法时：

1. 编辑 `src/main/bnf/Jenkinsfile.bnf` 进行语法规则修改
2. 编辑 `src/main/flex/JenkinsfileLexer.flex` 进行标记化修改
3. 运行 `./gradlew generateParser generateLexer` 重新生成代码
4. 生成的类将放置在 `src/main/gen/` 中

## 插件配置

插件在 `src/main/resources/META-INF/plugin.xml` 中配置并注册：
- `.jenkinsfile` 文件和 `Jenkinsfile` 模式的文件类型关联
- 语言实现

## 项目结构说明

- 所有生成的代码都在 `src/main/gen/` 中，不应手动编辑
- 主要源代码在 `src/main/kotlin/` 中，遵循 Kotlin 约定
- 测试文件在 `src/test/kotlin/` 下组织
- 项目支持声明式和脚本式 Jenkins 流水线语法