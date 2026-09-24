# campus-todo（校园待办）

软件工程综合实践 · 基于 GitHub Flow 的团队协同开发实验项目。

## 项目简介

CampusTodo 是一个控制台版校园任务管理器（Java）。本次迭代计划增加优先级筛选、任务完成功能、自动化测试与使用说明。最终版本无需图形界面或数据库，重点是团队协作过程的规范性与可追踪性。

## 技术栈

- Java 17
- Maven
- JUnit 5

## 运行与测试

```bash
# 运行全部测试
mvn -B verify

# 测试报告位于 target/surefire-reports/
```

## 当前版本

当前版本：支持新增任务和列出任务。

## 团队角色

| 角色 | GitHub 用户名 | 职责 |
|---|---|---|
| 仓库管理员（M） | 230593641 | 建仓库、邀请成员、建立 Issue、控制合并与发布 |
| 开发者 A | （待填） | #1 任务优先级与筛选 |
| 开发者 B | （待填） | #2 任务完成与重复完成校验 |
| 质量负责人 Q | （待填） | #3 测试、工作流与说明 |

## 协作规范

- `main` 只保存可运行、测试通过的版本；日常开发不直接提交到 `main`
- 分支命名：`feature/<issue 号>-<简短主题>`，例如 `feature/1-priority-filter`
- 提交信息：`<type>: <动词开头的说明>`，type 可用 `feat`、`test`、`docs`、`fix`、`ci`、`chore`
- 每个功能分支只解决一个 Issue；PR 描述必须使用 `Closes #编号` 建立关联
- 合并前必须通过自动化测试、解决全部评审意见，并取得至少 1 人 Approve
- 禁止提交 `.idea/`、`target/`、密码、Personal Access Token 或其他凭据

## 版本历史

- v0.1.0：CampusTodo starter baseline（新增任务 + 列出任务）
- v1.0.0：实验完成版（待发布）
