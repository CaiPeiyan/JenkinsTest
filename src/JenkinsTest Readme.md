# `JenkinsTest` Readme

## 项目介绍

本项目是maven项目，主要内容是学生成绩的处理，主要源代码在`src`文件夹中，测试代码在`test`文件夹中。

## 测试

### 单元测试

执行单元测试需要打开`test\com\caipeiyan\demo\result_processTest.java`，运行测试即可

### 集成测试

执行集成测试需要打开`test\Mockito\resultMockitoTest.java`，运行测试即可。值得注意的是，执行集成测试的模块在`src\main\java\Mockito`中（其中桩模块对应的为空的抽象函数）。

### 持续集成测试

持续集成测试采用的是`Jenkins+maven+github`，代码仓库为`https://github.com/CaiPeiyan/JenkinsTest`。

### 提交缺陷

采用在`Github`的`issue`提交缺陷的方法。