# campus-todo

软件工程综合实践用的一个 Java 命令行待办小项目，这学期小组拿来练 GitHub Flow 团队协作。

## 项目说明

CampusTodo 是控制台版的校园任务管理器，现在主要支持新增任务和列出任务。这次迭代打算加上优先级筛选、完成任务、自动化测试和说明文档，不搞图形界面和数据库，重点是把协作流程跑规范、能追踪。

## 环境

Java 17、Maven、JUnit 5。

## 怎么跑

```bash
mvn -B verify   # 跑全部测试
```

测试报告在 `target/surefire-reports/` 目录下。

当前版本：支持新增任务和列出任务。

## 分工

M（仓库管理员）管仓库、发 Issue、控制合并和发布，负责 v0.1.0 和最后的 v1.0.0；开发者 A 做 #1 优先级筛选；开发者 B 做 #2 完成任务；质量负责人 Q 做 #3 测试、CI 和文档。

## 约定

1. main 上只放能跑通测试的版本，平时开发别直接往 main 推
2. 分支叫 `feature/<issue号>-<主题>`，比如 `feature/1-priority-filter`
3. 提交信息写 `<type>: <动词开头的说明>`，type 用 feat/test/docs/fix/ci/chore
4. 一个分支只做一个 Issue，PR 里写 `Closes #编号` 关联
5. 合并前测试得过、评审意见处理完、至少一个人 Approve
6. `.idea/`、`target/`、密码和令牌这些一律不提交

## 版本

v0.1.0 是初始版本，能新增和列出任务；v1.0.0 是实验结束版，还没发布。
