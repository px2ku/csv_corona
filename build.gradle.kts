import org.gradle.internal.os.OperatingSystem

plugins {
    java
    application
    id("org.openjfx.javafxplugin") version "0.0.10"
    id("org.beryx.runtime") version "1.12.5"
}

val jvmOptions = listOf("-Dprism.order=sw")
val currentOs: OperatingSystem = OperatingSystem.current()
val console = false

group = "boran"
version = "1.0.0"
// version = File("src/main/resources/com/abysl/harryplotter/version.txt").readText()

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation ("org.apache.commons:commons-lang3:3.12.0")
}

application {
    applicationName = "CSV Corona"
    mainClass.set("boran.Main")
    applicationDefaultJvmArgs = jvmOptions
}

javafx {
    version = "16"
    modules = listOf("javafx.base", "javafx.controls", "javafx.fxml", "javafx.web")
}

runtime {
    options.set(listOf("--strip-debug", "--compress", "2", "--no-header-files", "--no-man-pages"))
    launcher {
        noConsole = !console
    }

    jpackage {
        appVersion = project.version.toString()
        imageName = project.application.applicationName
        installerName = "csv-corona-setup"
        if (currentOs.isWindows) {
            installerType = "exe"
            installerOptions = installerOptions + listOf("--win-per-user-install", "--win-dir-chooser", "--win-menu")
            if (console) {
                imageOptions = imageOptions + listOf("--win-console")
            }
        } else if (currentOs.isLinux) {
            installerType = "deb"
            installerOptions = installerOptions + listOf( "--linux-shortcut", )
        } else if (currentOs.isMacOsX) {
            installerType = "pkg"
        }
    }
}
