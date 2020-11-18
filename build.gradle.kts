// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
        mavenLocal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.0.1")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
    }
}


allprojects {
    repositories {
        google()
        jcenter()
        mavenLocal()
    }
}

tasks.create<Delete>("clean") {
    delete = setOf (buildDir)
}


// SeaLights Gradle-plugin integration
apply(from = "/home/kamil/workspace/sealights/projects/SL.Android.Examples/sealights.gradle.kts")
