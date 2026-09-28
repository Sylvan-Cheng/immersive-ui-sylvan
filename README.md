# Immersive UI: Sylvan Edition

适用于 Minecraft 26.1.2 的非官方 Fabric 移植版。它为库存、快捷栏、熔炉、附魔和进度提示等界面加入更细腻的动画与粒子效果，让物品交互更有反馈。

本项目基于 [Shatterbyte 的 Immersive UI](https://github.com/Octo-Studios/immersive-ui) 0.3.6，并得到原作者授权进行移植和公开发布。本仓库不代表上游官方发行版。

## 安装

- Minecraft **26.1.2**、Java **25**、Fabric Loader **0.19.5** 或更新的兼容版本。
- Fabric API **0.155.3+26.1.2**。
- [ShatterLib 0.7.0+26.1.2](https://modrinth.com/mod/shatterbyte-lib)，这是 Immersive UI 的必需依赖。
- 从[本仓库的 Releases](https://github.com/Sylvan-Cheng/immersive-ui-sylvan/releases)下载普通 `.jar`，放入客户端的 `mods` 目录。这个模组只在客户端运行，不需要安装到服务端。

模组 ID 为 `immersiveui_sylvan`，显示名称为 **Immersive UI: Sylvan Edition (Unofficial)**。升级时请移除同一移植版的旧 JAR，避免加载两份界面 Mixin。

## 功能

- 快捷栏选择框平滑移动。
- 鼠标快速移动物品时，手中物品会产生轻微摆动。
- 鼠标悬停时放大物品；容器中与手上物品相同的物品会有浮动提示。
- 稀有物品、附魔台和熔炉提供粒子效果。
- 可选的界面震动、诅咒附魔文字效果和进度提示物品动画。
- 可关闭原版槽位高亮，并分别调整动画速度、缩放和幅度。

## 配置

首次启动后，ShatterLib 会在 `config` 目录生成 Immersive UI 的 JSON5 配置文件。配置项包括快捷栏动画、物品缩放、匹配物品浮动、稀有粒子、界面震动、附魔粒子和进度提示动画。修改后重新进入世界即可确认效果；具体文件名以 ShatterLib 当前版本生成的文件为准。

ShatterLib 是上游作者维护的公共库，负责 JSON5 配置、缓动动画和界面粒子等基础能力。它需要单独放入 `mods` 目录，不能只安装 Immersive UI。

## 构建

项目使用 Java 25 和 Gradle Wrapper。在仓库根目录运行：

```powershell
./gradlew.bat build
```

构建产物位于 `build/libs/`，安装时使用不带 `sources` 的 JAR。依赖通过官方 Modrinth Maven 坐标解析；网络受限时可使用本机 HTTP 代理 `127.0.0.1:7897`，不要把代理地址写入提交的构建文件。

## 归属与反馈

Immersive UI 的原始代码、名称和功能归属于 Shatterbyte / Octo Studios；ShatterLib 也由其维护。本移植版只改变了 Minecraft 26.1.2 的构建适配、渲染 API 兼容和 Fabric 元数据。请保留上游归属信息，并将上游功能问题提交到[原仓库](https://github.com/Octo-Studios/immersive-ui/issues)；26.1.2 移植问题可提交到[本仓库的 Issues](https://github.com/Sylvan-Cheng/immersive-ui-sylvan/issues)。

上游项目页面标注为 **All Rights Reserved**。本移植版的公开发布基于原作者授权，不将上游代码重新声明为 LGPL、MIT 或其他开源许可证。
