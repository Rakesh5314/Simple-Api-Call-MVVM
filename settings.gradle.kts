//pluginManagement {
//    repositories {
//        gradlePluginPortal()
//        google()
//        mavenCentral()
//    }
//    resolutionStrategy {
//        eachPlugin {
//            if (requested.id.id == "dagger.hilt.android.plugin") {
//                useModule("com.google.dagger:hilt-android-gradle-plugin:2.56.2")
//            }
//        }
//    }
//}
//
//dependencyResolutionManagement {
//    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
//    repositories {
//        google()
//        mavenCentral()
//    }
//}

//
//rootProject.name = "retrofit learning"
//include(":app")


//2nd attemp start
//pluginManagement {
//    repositories {
//        gradlePluginPortal()
//        google()
//        mavenCentral()
//    }
//    plugins {
//        id("com.google.devtools.ksp") version "1.9.23-1.0.19"
//        id("dagger.hilt.android.plugin") version "2.51"
//    }
//    resolutionStrategy {
//        eachPlugin {
//            when (requested.id.id) {
//                "dagger.hilt.android.plugin" -> useModule("com.google.dagger:hilt-android-gradle-plugin:2.51")
//                "com.google.devtools.ksp" -> useModule("com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:1.9.23-1.0.19")
//            }
//        }
//    }
//}
//
//dependencyResolutionManagement {
//    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
//    repositories {
//        google()
//        mavenCentral()
//    }
//}
//
//rootProject.name = "retrofit learning"
//include(":app")

//3rd attempt start
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    plugins {
        id("com.android.application") version "8.2.0"
        id("org.jetbrains.kotlin.android") version "1.9.23"
        id("com.google.devtools.ksp") version "1.9.23-1.0.19"
        id("dagger.hilt.android.plugin") version "2.51"
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "retrofit learning"
include(":app")