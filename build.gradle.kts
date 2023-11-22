plugins {
    id("java")
}

group = "net.bypiramid.commandmanager"
version = "git-1.1-SNAPSHOT"

val website: String by extra { "https://github.com/bypiramid/command-manager" }
val author: String by extra { "comicxz" }

tasks.withType<JavaCompile> {
    sourceCompatibility = "1.8"
    options.encoding = "UTF-8"
}

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://oss.sonatype.org/content/repositories/central")
    maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")
    compileOnly("com.github.azbh111:craftbukkit-1.8.8:R")
}

tasks.processResources {
    filesMatching("plugin.yml") {
        expand(project.properties)
    }
}