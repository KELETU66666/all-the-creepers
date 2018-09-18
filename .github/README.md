<p align="center"><img src="https://i.imgur.com/0xeDA4S.png"/></p>

***

Redux of the original Elemental Creepers mod!

[![DownloadCount](http://cf.way2muchnoise.eu/full_287777_downloads.svg)](https://minecraft.curseforge.com/projects/elemental-creepers-redux)
[![SupportedVersions](http://cf.way2muchnoise.eu/versions/287777_latest.svg)](https://minecraft.curseforge.com/projects/elemental-creepers-redux)

---
**_Table of Contents_**

1. [Dependencies](https://github.com/T145/ElementalCreepers#dependencies)
2. [Workspace Setup](https://github.com/T145/ElementalCreepers#workspace-setup)
3. [Project License](https://github.com/T145/ElementalCreepers#license)
4. [Dev Support](https://github.com/T145/ElementalCreepers#support)
5. [Contributing](https://github.com/T145/ElementalCreepers/blob/master/.github/CONTRIBUTING.md)

---

## Dependencies

In order to get started with Minecraft mod development in this workspace, a few prerequisites are required:

1. [Git](https://git-scm.com/downloads) *([First-Time Git Setup](https://git-scm.com/book/en/v2/Getting-Started-First-Time-Git-Setup))*
2. [Java Development Kit 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) (JDK 8)
3. *(Optional)* [Gradle](http://gradle.org/gradle-download/)

> If you don't manually install Gradle, just append a `w` to `gradle` command prefixes.
> This will install the Gradle wrapper once, and any proceeding commands should be executed using it.

### Windows

#### Using [Scoop](https://github.com/lukesampson/scoop/blob/master/README.md)
```bash
scoop install git
scoop bucket add java
scoop install oraclejdk8
scoop install gradle
```

#### Using [Chocolatey](https://chocolatey.org/install)
```bash
choco install git
choco install jdk8
choco install gradle
```

### OSX

#### Using [Homebrew](https://brew.sh/)
```bash
# Installs Apple's Command Line Utilities automatically, which includes Git
brew cask install java
brew install gradle
```

---

## Workspace Setup

### Eclipse
```bash
gradle setupEclipseWorkspace
gradle eclipse
```

Next, you'll need to install the [EditorConfig plugin](https://github.com/ncjones/editorconfig-eclipse#readme).
Navigate to `Help > Eclipse Marketplace`, and search for `editorconfig`.
There should only be one result; install it and you're all set.

### IntelliJ IDEA

```bash
gradle setupDecompWorkspace
gradle idea
```
> Be sure IDEA recognizes the `src/api/java` directory!

Depending on your internet connection and the processing power of your machine, it may take a while to build.
For most people it takes about 10 minutes.

---

## License

Mod source code is licensed under the [Apache License v2.0](http://www.apache.org/licenses/LICENSE-2.0).
The actual workspace license is located in this project.
To use any mod assets, you may contatct [myself](https://github.com/T145) or the original creator for permission.

---

## Support

<div align="center">

**Patreon**: [patreon.com/user=152139](https://www.patreon.com/user?u=152139)
</div>

<div align="center">

**Paypal**: [paypal.me/T145](https://www.paypal.me/T145)
</div>

<div align="center">

**Bitcoin**: `1qrrPQqfbfXLRqzS6jb7A7Mgnzz85Mjxu`
</div>

<div align="center">

**Ethereum**: `0x9dbafc51abe8ce05cac6f8a39ebd4351706840b0`
</div>

<div align="center">

**Litecoin**: `LiV9SfDjFYLFRCzf9wTf7ap8BuRF39J7PB`
</div>
