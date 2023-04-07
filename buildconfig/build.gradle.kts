import com.codingfeline.buildkonfig.compiler.FieldSpec.Type.STRING

plugins {
    kotlin("multiplatform")
    id("common-library")
    id("com.codingfeline.buildkonfig")
}

kotlin {
    jvmToolchain {
        jvmToolchain {
            (this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of(11))
        }
    }

    jvm()
}

buildkonfig {
    packageName = "vet.inpulse"
    exposeObjectWithName = "BuildKonfig"

    defaultConfigs {
        buildConfigField(STRING, "VERSION", "2")
    }
}
