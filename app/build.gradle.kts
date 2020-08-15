plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {

    defaultConfig {
        applicationId = "net.novate.scaffold"

        minSdkVersion(SDK_VERSION_MIN)
        targetSdkVersion(SDK_VERSION_TARGET)
        compileSdkVersion(SDK_VERSION_COMPILE)

        buildToolsVersion(BUILD_TOOLS_VERSION)

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles("proguard-android.txt", "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {
    // Kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")

    // Androidx
    implementation("androidx.appcompat:appcompat:$androidxAppcompatVersion")
    implementation("androidx.constraintlayout:constraintlayout:$androidxConstraintlayoutVersion")

    // Androidx Ktx
    implementation("androidx.core:core-ktx:$androidxCoreKtxVersion")
    implementation("androidx.fragment:fragment-ktx:$androidxFragmentKtxVersion")
    implementation("androidx.collection:collection-ktx:$androidxCollectionKtxVersion")

    // Lifecycle
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$androidxLifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$androidxLifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$androidxLifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:$androidxLifecycleVersion")
    // annotation processor
    implementation("androidx.lifecycle:lifecycle-common-java8:$androidxLifecycleVersion")
    // optional - helpers for implementing LifecycleOwner in a Service
    implementation("androidx.lifecycle:lifecycle-service:$androidxLifecycleVersion")
    // optional - ProcessLifecycleOwner provides a lifecycle for the whole application process
    implementation("androidx.lifecycle:lifecycle-process:$androidxLifecycleVersion")
    // optional - ReactiveStreams support for LiveData
    implementation("androidx.lifecycle:lifecycle-reactivestreams-ktx:$androidxLifecycleVersion")


    // Test
    testImplementation("junit:junit:$junitVersion")

    // AndroidTest
    androidTestImplementation("androidx.test.ext:junit:$androidxJunitVersion")
    androidTestImplementation("androidx.test.espresso:espresso-core:$androidxEspressoVersion")
}