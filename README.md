# sdk-ylmf-open

115网盘开放平台 OpenAPI 软件开发工具包。

## 技术栈

- Java 21
- Maven（groupId: `com.github.acnxo` / artifactId: `sdk-ylmf-open`）
- JUnit 6（junit-jupiter）
- 基础工具库：[autil-core](https://github.com/ACANX/AUtil)（`com.acanx.util:autil-core:1.3.0`）

## Maven 依赖

```xml
<dependency>
    <groupId>com.github.acnxo</groupId>
    <artifactId>sdk-ylmf-open</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

## 使用

```java
// 根包：com.github.acnxo.ylmf.open
import com.github.acnxo.ylmf.open.YlmfOpenSdk;

System.out.println(YlmfOpenSdk.VERSION);
```

## 文档

- 项目文档：[Docs/README.md](Docs/README.md)
- 115网盘开放平台 OpenAPI 文档：https://www.yuque.com/115yun/open
