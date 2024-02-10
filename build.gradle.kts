// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
}
ext {
    var activityVersion = "1.4.0"
    var appCompatVersion = "1.4.0"
    var constraintLayoutVersion = "2.1.2"
    var coreTestingVersion = "2.1.0"
    var coroutines = "1.5.2"
    var lifecycleVersion = "2.4.0"
    var materialVersion = "1.4.0"
    var roomVersion = "2.3.0"
    // testing
    var junitVersion = "4.13.2"
    var espressoVersion = "3.4.0"
    var androidxJunitVersion = "1.1.3"
}