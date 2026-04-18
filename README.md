# Bondhu-one

**Bondhu-one** is a cross-platform Instagram client built with Kotlin Multiplatform and Compose Multiplatform. It delivers a unified, native-quality experience across Android, iOS, and the web from a single shared codebase — maintaining full platform fidelity on every target.

🌐 **Live Web App:** [https://nidoham28.github.io/Bondhu-one/](https://nidoham28.github.io/Bondhu-one/)

---

## Overview

Bondhu-one brings the core Instagram experience to all major platforms without compromise. By sharing business logic, UI components, and navigation across targets, the project eliminates duplication while allowing platform-specific behaviour where it matters — notifications, media handling, and deep linking — to remain native.

The application connects to the Instagram API to provide real-time feed browsing, story viewing, profile exploration, and media interaction, all within a consistent and responsive interface.

---

## Platform Support

| Platform | Status | Distribution |
|----------|--------|--------------|
| 🤖 Android | ✅ Production | APK / Google Play |
| 🍎 iOS | ✅ Production | App Store |
| 🌐 Web (WASM) | ✅ Live | [GitHub Pages](https://nidoham28.github.io/Bondhu-one/) |
| 🌐 Web (JS) | ✅ Production | Self-hosted / CDN |

---

## Tech Stack

**Core Framework**
Kotlin Multiplatform with Compose Multiplatform provides the shared UI and business logic layer. All four platform targets — Android, iOS, WebAssembly, and JavaScript — are compiled from the same source tree.

**UI & State Management**
The interface is built entirely in Compose Multiplatform. State is managed with a structured ViewModel layer using Kotlin Coroutines and StateFlow, ensuring consistent behaviour across all platforms.

**Networking & Data**
Ktor handles all HTTP communication with the Instagram API. Kotlinx.serialization manages JSON parsing, and Kotlinx.coroutines coordinates asynchronous data flows throughout the application.

**Build & CI/CD**
The project uses Gradle with a version catalogue (`libs.versions.toml`) for dependency management. The CI/CD pipeline runs on GitHub Actions and covers lint validation, unit testing, and automated builds for all four targets on every push. Successful builds to `main` are deployed automatically to GitHub Pages.

---

## Getting Started

### Prerequisites

- Android Studio Hedgehog or later (with KMP plugin installed)
- JDK 21 (Temurin distribution recommended)
- Xcode 16 or later (required for iOS builds on macOS)
- Node.js 22 LTS (required for Web/WASM builds) 

### Clone the Repository

```bash
git clone https://github.com/nidoham28/Bondhu-one.git
cd Bondhu-one
```

### Run on Android

```bash
./gradlew :composeApp:installDebug
```

### Run on iOS Simulator

```bash
# Step 1 — compile the Kotlin/Native framework
./gradlew :composeApp:linkDebugFrameworkIosSimulatorArm64

# Step 2 — open the Xcode project and run from there
open iosApp/iosApp.xcodeproj
```

### Run on Web (WASM)

```bash
./gradlew :composeApp:wasmJsBrowserDevelopmentRun
```

The development server will start at `http://localhost:8080` by default.

---

## Project Structure

```
Bondhu-one/
├── composeApp/               # Shared KMP module (all platforms)
│   ├── commonMain/           # Shared business logic, UI, ViewModels
│   ├── androidMain/          # Android-specific implementations
│   ├── iosMain/              # iOS-specific implementations
│   └── wasmJsMain/           # Web/WASM-specific implementations
├── iosApp/                   # Xcode project wrapper
├── gradle/
│   └── libs.versions.toml    # Centralised version catalogue
└── .github/
    └── workflows/
        └── kmp-ci.yml        # CI/CD pipeline
```

---

## CI/CD Pipeline

The GitHub Actions pipeline runs on every push and pull request and is structured as follows.

The `validate` job runs first and performs Gradle wrapper integrity checks alongside Android lint analysis. All platform builds are gated behind this job — if validation fails, no runner time is spent on platform compilation.

The `android`, `ios`, and `web` jobs execute in parallel once validation passes. Each produces versioned build artifacts identified by commit SHA and run number. The `web` job additionally deploys the WASM distribution to GitHub Pages automatically on every successful merge to `main`.

A `ci-summary` job aggregates all results and serves as the single required check for branch protection rules.

---

## Web Deployment

The production web build is deployed automatically to GitHub Pages at:

**[https://nidoham28.github.io/Bondhu-one/](https://nidoham28.github.io/Bondhu-one/)**

Deployments are triggered exclusively on pushes to the `main` branch. Each deployment publishes the WebAssembly production build and replaces the previous release atomically.

---

## Contributing

Contributions are welcome. Please open an issue to discuss the proposed change before submitting a pull request. All pull requests must pass the full CI pipeline — including lint, unit tests, and builds for all platform targets — before they are eligible for review.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

<div align="center">

Built with ❤️ using [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html) and [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/)

</div>