# Android Scaffold Project

Android 脚手架项目，使用 `Kotlin ` 编写项目代码，使用 `Kotlin Script` 编写构建脚本。



## 项目依赖

- AndroidX
- Android KTX
- Lifecycles
  - Lifecycle
  - LiveData
  - ViewModel
- Room
- Work
- Hilt
- Timber



## 项目框架

### Timber

[Timber](https://github.com/JakeWharton/timber) 是一个日志打印框架。

#### 使用

1. `TimberInitializer` 是 Timber 的初始化器，可以在 `onInit()` 方法中配置初始化代码。
2. 在 AndroidManifest.xml 配置 `TimberInitializer` 的初始化顺序(`initOrder`)，数值越大越早初始化。
3. 复制`.idea/liveTemplates/AndroidTimberLogKotlin.xml`到`~/.AndroidStudiox.x/config/templates`下
4. 重启 AndroidStudio 打开`Settings-Editor-Live Templates`启用AndroidTemberLogKotlin，关闭AndroidLogKotlin