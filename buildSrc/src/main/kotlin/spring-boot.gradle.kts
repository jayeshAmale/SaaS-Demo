import gradle.kotlin.dsl.accessors._1fecaaa69017c0b639000a1c9113da6f.kotlin
import org.gradle.kotlin.dsl.kotlin
import kotlin.collections.addAll

plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

kotlin {
    jvmToolchain(21)
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict", "-Xannotation-default-target=param-property")
    }
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}