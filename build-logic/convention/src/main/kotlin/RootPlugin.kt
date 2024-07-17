import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies



class RootPlugin: Plugin<Project> {
    override fun apply(target: Project) { //it can be applied to any gradle project
        with (target){
            pluginManager.apply{
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
                apply("dagger.hilt.android.plugin")

                apply("com.google.dagger.hilt.android")

                apply("com.google.devtools.ksp")
                apply("kotlinx-serialization")
                apply("org.jetbrains.kotlin.kapt")
                apply("com.google.gms.google-services")
                apply("com.google.firebase.crashlytics")

                apply("kotlin-kapt")

            }

            dependencies {

            }

        }

    }
}