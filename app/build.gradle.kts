plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.fazendafeliz"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.fazendafeliz"
        minSdk = 23
        targetSdk = 35
        versionCode = 15
        versionName = "2.8"
    }

    signingConfigs {
        getByName("debug") {
            storeFile = file("fazenda-debug.keystore")
            storePassword = "android"
            keyAlias = "androiddebugkey"
            keyPassword = "android"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}
