pluginManagement {
    val kotlinVersion: String by extra
    plugins {
        id("org.jetbrains.kotlin.jvm").version(kotlinVersion)
    }
}

rootProject.name = "demo"
