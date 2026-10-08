# IDEA 配置清单与必背快捷键

## 一、分工原则

| 场景 | 用哪个 | 原因 |
|---|---|---|
| Java 一切（基础、集合、并发、Spring Boot、项目） | **IDEA** | Java 工程能力是 IDEA 的核心，VS Code 差距明显 |
| Python（RAG / Agent，大三下开始） | VS Code | Python 体验 VS Code 更好，IDEA 的 Python 支持是付费插件 |
| 学习日志 Markdown | VS Code | 轻量，随手记 |
| 学校 C / C++ 作业、计组实验 | VS Code | 与主线隔离，互不干扰 |
| 看单个文件、改配置 | VS Code | 秒开 |

> **铁律：同一个项目不要在两个 IDE 之间来回打开**，会产生 `.idea` / `.vscode` 配置冲突。
> Java 项目只在 IDEA 里开。

---

## 二、首次启动必做的 5 项设置

1. **编码全部设为 UTF-8**（不做的话中文必乱码）
   `Settings → Editor → File Encodings`
   → Global / Project / Default encoding for properties files **三处全部选 UTF-8**
   → 勾选 `Transparent native-to-ascii conversion`

2. **绑定 JDK 21**
   `File → Project Structure → Project SDK` → 选 `D:\JAVA-JDK21`

3. **确认 Maven 用的是本机的 3.9.9**
   `Settings → Build Tools → Maven`
   → Maven home path 指向你的 Maven 目录
   → 建议把 `User settings file` 指向 `~/.m2/settings.xml`
   → **建议配阿里云镜像**，否则下载依赖会非常慢（见下）

4. **开启自动导包**
   `Settings → Editor → General → Auto Import`
   → 勾选 `Add unambiguous imports on the fly` 和 `Optimize imports on the fly`

5. **解决输入法抢快捷键**（中文 Windows 必踩）
   IDEA 的代码补全是 `Ctrl + Space`，但中文输入法的「中英文切换」也是它，会被抢走。
   → 去系统输入法设置里把「中/英文切换」改成 `Ctrl + Shift + Space` 或其他键

---

## 三、Maven 阿里云镜像（不做会慢到怀疑人生）

在 `C:\Users\john\.m2\settings.xml` 的 `<mirrors>` 里加：

```xml
<mirror>
    <id>aliyun</id>
    <name>Aliyun Maven</name>
    <url>https://maven.aliyun.com/repository/public</url>
    <mirrorOf>central</mirrorOf>
</mirror>
```

---

## 四、必背快捷键（Windows）

### 每天都会用的
| 功能 | 快捷键 |
|---|---|
| 万能搜索（搜任何东西） | 双击 `Shift` |
| 搜索类 | `Ctrl + N` |
| 搜索文件 | `Ctrl + Shift + N` |
| 查看源码 / 跳到定义 | `Ctrl + 左键` 或 `Ctrl + B` |
| 生成代码（getter/setter/构造器/toString） | `Alt + Insert` |
| 重命名（安全重构，全项目替换） | `Shift + F6` |
| 抽取变量 / 抽取方法 | `Ctrl + Alt + V` / `Ctrl + Alt + M` |
| 格式化代码 | `Ctrl + Alt + L` |
| 行注释 / 块注释 | `Ctrl + /` / `Ctrl + Shift + /` |
| 查看一个类的结构 | `Alt + 7` |

### 调试（Week 3 看集合源码、Week 5 学并发时必用）
| 功能 | 快捷键 |
|---|---|
| 运行 | `Shift + F10` |
| 调试运行 | `Shift + F9` |
| 单步跳过（不进方法） | `F8` |
| 单步进入（进方法内部） | `F7` |
| 跳出当前方法 | `Shift + F8` |
| 继续运行到下一个断点 | `F9` |
| 查看光标处变量的值（调试中） | `Alt + F8` 或鼠标悬停 |

> 学会调试器比学会写代码更重要。**阶段 A 学集合源码时，你必须靠单步调试去看 HashMap 的 put 到底怎么走的。**

---

## 五、Community 版 vs Ultimate 版

| 能力 | Community（你现在这个） | Ultimate |
|---|---|---|
| Java 编辑、重构、调试、源码导航 | ✅ 与 Ultimate 完全一致 | ✅ |
| Maven 支持 | ✅ | ✅ |
| **Spring / Spring Boot 支持** | ❌ 没有 | ✅ 自动装配提示、Bean 导航、Spring 面板 |
| **Database 工具**（连 MySQL 写 SQL） | ❌ 没有 | ✅ |
| **HTTP Client**（可替代 Postman） | ❌ 没有 | ✅ |
| JPA / MyBatis 插件 | ❌ | ✅ |

**建议：立刻用学校邮箱（.edu.cn）申请 JetBrains 免费教育许可，拿到 Ultimate。**
10 分钟搞定，阶段 D（12-14 学 Spring Boot）开始就离不开它。

如果申请不下来也**不影响走完全程**，用替代方案：
- Spring 提示缺失 → 靠配置文件和报错信息排查，反而更练基本功
- Database 工具 → 用 MySQL Workbench 或 Navicat
- HTTP Client → 用 Postman / ApiPost（计划里本来就让你装）

---

## 六、常见坑

1. **新建项目后找不到 JDK** → `Project Structure → Project SDK` 手动指定 `D:\JAVA-JDK21`
2. **Maven 依赖一直转圈** → 没配阿里云镜像（见第三节）
3. **代码补全不出来** → 输入法抢了 `Ctrl + Space`（见第二节第 5 条）
4. **中文乱码** → 三处编码没全设成 UTF-8（见第二节第 1 条）
5. **`java: 错误: 不支持发行版本 21`** → 项目语言级别没跟上：`Project Structure → Project language level` 选 21
