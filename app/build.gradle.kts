plugins {
    kotlin("jvm")
    id("common-library")
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    implementation(kotlin("test"))
    implementation(project(":buildconfig"))
}