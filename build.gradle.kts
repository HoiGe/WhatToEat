plugins {
    val kotlinVersion = "1.7.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.13.0"
}

group = "com.hoige"
version = "0.1.4"

repositories {
    maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
}
