plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 32
    defaultConfig {
        applicationId = "it.to.marvelkmm.android"
        minSdk = 23
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.5.0")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0")
    implementation("androidx.core:core-ktx:1.7.0")
}