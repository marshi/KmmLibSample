import java.net.URI

plugins {
    id("com.android.application")
    kotlin("android")
}

repositories {
    maven {
        name = "GitHubPackages"
        url = URI.create("https://maven.pkg.github.com/marshi/kmmsample")
        credentials {
            username = "marshi"
            password = "PERSONAL_ACCESS_TOKEN"
        }
    }
    mavenCentral()
}

dependencies {
//    implementation(project(":shared"))
    implementation("dev.marshi.kmmsample:shared:0.0.1-SNAPSHOT")
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.2")
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "dev.marshi.kmmlibsample.androidApp"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}
