plugins {
    kotlin("jvm")
    id("io.gitlab.arturbosch.detekt").version("1.17.1")
}

dependencies {
    val detektVersion = Versions.detekt // 1.17.1

    compileOnly("io.gitlab.arturbosch.detekt:detekt-api:$detektVersion")

    implementation("org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}")
}
