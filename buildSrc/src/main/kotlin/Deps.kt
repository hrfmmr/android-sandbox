object Deps {
    object GradlePlugin {
        val android = "com.android.tools.build:gradle:3.1.2"
        val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
    }

    object AndroidX {
        val appcompat = "com.android.support:appcompat-v7:27.1.1"
        val constraint = "com.android.support.constraint:constraint-layout:1.1.3"
    }

    object Kotlin {
        val version = "1.2.30"
        val stdlibJdk = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
    }

    object Test {
        val junit = "junit:junit:4.12"
        val testRunner = "com.android.support.test:runner:1.0.2"
        val espressoCore = "com.android.support.test.espresso:espresso-core:3.0.2"
    }
}
