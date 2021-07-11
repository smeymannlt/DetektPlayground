plugins {
    id("com.android.library")
    id("kotlin-android")
    id("io.gitlab.arturbosch.detekt").version("1.17.1")
}

android {
    compileSdkVersion (30)
    buildToolsVersion ="30.0.3"

    defaultConfig {
        minSdkVersion (26)
        targetSdkVersion (30)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

//    buildTypes {
//        getByName("release") {
//            minifyEnabled = false
//            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
//        }
//    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

//detekt {
//    toolVersion = Versions.detekt
//    input = files("src/main/java")
////    config = files("../detekt/detekt-config.yml")
//    autoCorrect = true
//    reports {
//        txt {
//            enabled = true
//            destination = file("detekt.txt")
//        }
//        html {
//            enabled = true
//            destination = file("detekt.html")
//        }
//    }
//}

dependencies {
    val detektVersion = Versions.detekt // 1.17.1
//    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:$detektVersion")
    compileOnly("io.gitlab.arturbosch.detekt:detekt-api:$detektVersion")
//    detekt("io.gitlab.arturbosch.detekt:detekt-cli:$detektVersion")

    implementation("org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}")
    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation("com.google.android.material:material:1.4.0")
    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}