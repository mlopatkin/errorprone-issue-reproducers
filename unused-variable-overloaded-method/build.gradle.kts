import net.ltgt.gradle.errorprone.errorprone

plugins {
    application

    id("net.ltgt.errorprone") version "3.1.0"
}

repositories {
    mavenCentral()
}
dependencies {
    errorprone("com.google.errorprone:error_prone_core:2.29.1")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "org.example.App"
}

tasks.withType<JavaCompile>().configureEach {
    options.compilerArgs.add("-Werror")
}
