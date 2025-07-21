# Jenkinsfile 语法高亮实现 TODO

## 高优先级（核心功能）

### 1. 实现 SyntaxHighlighter
**文件**: `src/main/kotlin/org/example/jenkinsfile_support/highlighting/JenkinsfileSyntaxHighlighter.kt`

**需求**:
- 继承 `SyntaxHighlighterBase`
- 实现 `getHighlightingLexer()` 方法，返回 `JenkinsfileLexerAdapter()`
- 实现 `getTokenHighlights()` 方法，映射 token 类型到颜色属性
- 定义以下 token 的颜色映射：
  - Pipeline 关键字: `KW_PIPELINE`, `KW_STAGE`, `KW_STEPS`, `KW_AGENT`
  - Agent 类型: `KW_DOCKER`, `KW_KUBERNETES`, `KW_ANY`, `KW_NONE`
  - 内置步骤: `KW_SH`, `KW_ECHO`, `KW_GIT`, `KW_CHECKOUT`
  - 字符串: `STRING_LITERAL`, `SINGLE_QUOTED_STRING`, `GSTRING`
  - 数字: `NUMBER`
  - 注释: `LINE_COMMENT`, `BLOCK_COMMENT`
  - 操作符: `ASSIGN`, `PLUS`, `MINUS` 等
  - 分隔符: `LBRACE`, `RBRACE`, `LPAREN` 等
  - Post 条件: `KW_ALWAYS`, `KW_FAILURE`, `KW_SUCCESS`

### 2. 实现 SyntaxHighlighterFactory
**文件**: `src/main/kotlin/org/example/jenkinsfile_support/highlighting/JenkinsfileSyntaxHighlighterFactory.kt`

**需求**:
- 继承 `SyntaxHighlighterFactory`
- 实现 `getSyntaxHighlighter()` 方法
- 返回 `JenkinsfileSyntaxHighlighter()` 实例
- 处理可选的 Project 和 VirtualFile 参数

### 3. 定义颜色属性常量
**文件**: `src/main/kotlin/org/example/jenkinsfile_support/highlighting/JenkinsfileColors.kt`

**需求**:
- 使用 `TextAttributesKey.createTextAttributesKey()` 创建颜色键
- 定义以下颜色属性：
  ```kotlin
  PIPELINE_KEYWORD    // pipeline, stage, steps 等
  BUILTIN_STEP       // sh, echo, git 等内置步骤
  AGENT_TYPE         // docker, kubernetes, any 等
  POST_CONDITION     // always, failure, success 等
  STRING_LITERAL     // 字符串字面量
  GSTRING           // Groovy 字符串插值
  COMMENT           // 注释
  NUMBER            // 数字
  OPERATOR          // 操作符
  SEPARATOR         // 分隔符
  WHEN_CONDITION    // when 块条件
  ENVIRONMENT_VAR   // 环境变量
  ```
- 每个属性关联到合适的默认高亮器颜色

### 4. 实现 ParserDefinition
**文件**: `src/main/kotlin/org/example/jenkinsfile_support/JenkinsfileParserDefinition.kt`

**需求**:
- 继承 `ParserDefinition`
- 实现以下方法：
  - `createLexer()`: 返回 `JenkinsfileLexerAdapter()`
  - `createParser()`: 返回 `JenkinsfileParser()`
  - `getFileNodeType()`: 返回文件节点类型
  - `getStringLiteralElements()`: 返回字符串 token 集合
  - `getCommentTokens()`: 返回注释 token 集合
  - `createElement()`: 创建 PSI 元素
  - `createFile()`: 创建 PSI 文件
- 定义 TokenSet 常量：
  ```kotlin
  STRING_LITERALS = TokenSet.create(STRING_LITERAL, SINGLE_QUOTED_STRING, GSTRING)
  COMMENTS = TokenSet.create(LINE_COMMENT, BLOCK_COMMENT)
  ```

### 5. 创建 PSI 文件类
**文件**: `src/main/kotlin/org/example/jenkinsfile_support/psi/JenkinsfileFile.kt`

**需求**:
- 继承 `PsiFileBase`
- 实现构造函数，接收 `FileViewProvider`
- 实现 `getFileType()` 方法，返回 `JenkinsfileFileType.INSTANCE`
- 重写 `toString()` 方法

### 6. 更新插件配置
**文件**: `src/main/resources/META-INF/plugin.xml`

**需求**:
- 在 `<extensions>` 中添加：
  ```xml
  <!-- 语法高亮器工厂 -->
  <lang.syntaxHighlighterFactory 
      language="Jenkinsfile"
      implementationClass="org.example.jenkinsfile_support.highlighting.JenkinsfileSyntaxHighlighterFactory"/>
  
  <!-- 解析器定义 -->
  <lang.parserDefinition 
      language="Jenkinsfile"
      implementationClass="org.example.jenkinsfile_support.JenkinsfileParserDefinition"/>
  ```

## 中优先级（用户体验）

### 7. 实现颜色设置页面
**文件**: `src/main/kotlin/org/example/jenkinsfile_support/highlighting/JenkinsfileColorSettingsPage.kt`

**需求**:
- 实现 `ColorSettingsPage` 接口
- 实现以下方法：
  - `getAttributeDescriptors()`: 返回可配置的颜色属性描述
  - `getColorDescriptors()`: 返回空数组（通常用于背景色）
  - `getDisplayName()`: 返回 "Jenkinsfile"
  - `getIcon()`: 返回 `JenkinsfileIcons.FILE`
  - `getHighlighter()`: 返回 `JenkinsfileSyntaxHighlighter()`
  - `getDemoText()`: 返回示例 Jenkinsfile 代码
- 创建 `AttributesDescriptor` 数组，包含所有颜色属性的显示名称
- 编写完整的示例 Jenkinsfile 代码，展示所有语法元素

### 8. 注册颜色设置页面
**文件**: `src/main/resources/META-INF/plugin.xml`

**需求**:
- 在 `<extensions>` 中添加：
  ```xml
  <colorSettingsPage 
      implementation="org.example.jenkinsfile_support.highlighting.JenkinsfileColorSettingsPage"/>
  ```

### 9. 实现代码折叠
**文件**: `src/main/kotlin/org/example/jenkinsfile_support/editor/JenkinsfileFoldingBuilder.kt`

**需求**:
- 继承 `FoldingBuilderEx`
- 实现 `buildFoldRegions()` 方法：
  - Pipeline 块折叠 `pipeline { ... }`
  - Stage 块折叠 `stage('name') { ... }`
  - Steps 块折叠 `steps { ... }`
  - Post 块折叠 `post { ... }`
  - Agent 块折叠 `agent { ... }`
  - Script 块折叠 `script { ... }`
  - 多行注释折叠 `/* ... */`
- 实现 `getPlaceholderText()` 方法，返回折叠占位符文本
- 实现 `isCollapsedByDefault()` 方法，设置默认折叠行为
- 在 plugin.xml 中注册：
  ```xml
  <lang.foldingBuilder 
      language="Jenkinsfile"
      implementationClass="org.example.jenkinsfile_support.editor.JenkinsfileFoldingBuilder"/>
  ```

### 10. 实现括号匹配
**文件**: `src/main/kotlin/org/example/jenkinsfile_support/editor/JenkinsfileBraceMatcher.kt`

**需求**:
- 实现 `PairedBraceMatcher` 接口
- 实现 `getPairs()` 方法，返回 `BracePair` 数组：
  - `{ }` 大括号配对
  - `( )` 小括号配对
  - `[ ]` 方括号配对
- 实现 `isPairedBracesAllowedBeforeType()` 方法
- 实现 `getCodeConstructStart()` 方法
- 在 plugin.xml 中注册：
  ```xml
  <lang.braceMatcher 
      language="Jenkinsfile"
      implementationClass="org.example.jenkinsfile_support.editor.JenkinsfileBraceMatcher"/>
  ```

### 11. 实现注释处理器
**文件**: `src/main/kotlin/org/example/jenkinsfile_support/editor/JenkinsfileCommenter.kt`

**需求**:
- 实现 `Commenter` 接口
- 实现以下方法：
  - `getLineCommentPrefix()`: 返回 "//"
  - `getBlockCommentPrefix()`: 返回 "/*"
  - `getBlockCommentSuffix()`: 返回 "*/"
  - `getCommentedBlockCommentPrefix()`: 返回 null
  - `getCommentedBlockCommentSuffix()`: 返回 null
- 在 plugin.xml 中注册：
  ```xml
  <lang.commenter 
      language="Jenkinsfile"
      implementationClass="org.example.jenkinsfile_support.editor.JenkinsfileCommenter"/>
  ```

## 低优先级（高级功能）

### 12. 实现语义高亮
**文件**: `src/main/kotlin/org/example/jenkinsfile_support/highlighting/JenkinsfileSemanticHighlighter.kt`

**需求**:
- 继承 `SyntaxHighlighterBase` 或实现自定义高亮逻辑
- 实现上下文感知的高亮：
  - 区分内置步骤 vs 自定义步骤
  - 识别环境变量引用 `${env.VAR}`
  - 识别参数引用 `${params.PARAM}`
  - Agent 块内的配置参数特殊高亮
  - When 条件表达式的语法高亮
- 实现方法调用链分析
- 添加作用域感知（pipeline/stage/steps 级别）

### 13. 实现错误标注器
**文件**: `src/main/kotlin/org/example/jenkinsfile_support/annotator/JenkinsfileAnnotator.kt`

**需求**:
- 继承 `Annotator`
- 实现 `annotate()` 方法
- 添加语法错误检测：
  - 缺失必需的 pipeline 块
  - 缺失 agent 声明
  - 缺失 stages 块
  - 无效的 agent 类型
  - 重复的块定义
  - 无效的 when 条件语法
- 提供错误修复建议（QuickFix）
- 在 plugin.xml 中注册：
  ```xml
  <annotator 
      language="Jenkinsfile"
      implementationClass="org.example.jenkinsfile_support.annotator.JenkinsfileAnnotator"/>
  ```

### 14. 实现结构视图
**文件**: `src/main/kotlin/org/example/jenkinsfile_support/structure/JenkinsfileStructureViewFactory.kt`

**需求**:
- 实现 `PsiStructureViewFactory`
- 创建 `JenkinsfileStructureViewModel`
- 显示 Pipeline 结构：
  - Pipeline 根节点
  - Agent 配置
  - Stages 列表
  - Post 条件
  - Environment 变量
  - Parameters 定义
- 支持导航到对应代码位置
- 在 plugin.xml 中注册：
  ```xml
  <lang.psiStructureViewFactory 
      language="Jenkinsfile"
      implementationClass="org.example.jenkinsfile_support.structure.JenkinsfileStructureViewFactory"/>
  ```

### 15. 实现代码补全
**文件**: `src/main/kotlin/org/example/jenkinsfile_support/completion/JenkinsfileCompletionContributor.kt`

**需求**:
- 继承 `CompletionContributor`
- 实现关键字补全：
  - Pipeline 结构关键字
  - 内置步骤名称
  - Agent 类型
  - Post 条件
  - When 条件
- 实现上下文感知补全：
  - 在 agent 块内补全 agent 相关选项
  - 在 steps 块内补全步骤
  - 在 post 块内补全条件类型
- 添加参数提示和文档

### 16. 实现实时模板
**文件**: `src/main/resources/liveTemplates/Jenkinsfile.xml`

**需求**:
- 创建 Live Templates 配置文件
- 定义常用的代码模板：
  - 完整的 pipeline 结构
  - stage 定义
  - docker agent 配置
  - git checkout 步骤
  - 并行执行块
  - post 条件块
- 包含变量占位符和默认值
- 在 plugin.xml 中注册：
  ```xml
  <defaultLiveTemplatesProvider 
      implementation="org.example.jenkinsfile_support.templates.JenkinsfileLiveTemplatesProvider"/>
  ```

## 测试和文档

### 17. 编写单元测试
**文件**: `src/test/kotlin/org/example/jenkinsfile_support/`

**需求**:
- 测试词法分析器正确性
- 测试语法解析器功能
- 测试语法高亮映射
- 测试 PSI 结构生成
- 创建测试用的 Jenkinsfile 示例

### 18. 更新文档
**文件**: `README.md`, `CLAUDE.md`

**需求**:
- 更新项目描述，说明语法高亮功能
- 添加功能特性列表
- 添加安装和使用说明
- 添加开发指南
- 添加语法高亮自定义说明

## 实现顺序建议

1. **第一阶段**: 完成高优先级任务 1-6，实现基本语法高亮
2. **第二阶段**: 完成中优先级任务 7-11，提升用户体验
3. **第三阶段**: 根据需求选择性实现低优先级功能

每个任务完成后应进行测试，确保功能正常工作且与 IntelliJ IDEA 的主题系统兼容。