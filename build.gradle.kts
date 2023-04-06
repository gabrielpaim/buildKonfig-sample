import com.codingfeline.buildkonfig.compiler.FieldSpec.Type.STRING

plugins {
    kotlin("multiplatform") version "1.8.10"
    id("com.codingfeline.buildkonfig") version "0.13.3"
}

group = "vet.inpulse"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        jvmToolchain(11)
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }

    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting
    }
}

buildkonfig {
    packageName = "$group.core"

    defaultConfigs {
        buildConfigField(STRING, "VERSION", "2")
    }

}
