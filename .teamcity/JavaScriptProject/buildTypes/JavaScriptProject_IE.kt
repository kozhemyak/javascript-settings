package JavaScriptProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScriptProject_IE : BuildType({
    template(JavaScriptProject.buildTypes.JavaScriptProject_Template)
    uuid = "4e548859-2dea-4811-8f04-0addae46c0a4"
    id = "JavaScriptProject_IE"
    name = "02. Internet Explorer"

    params {
        param("Browser", "IE")
    }

    dependencies {
        dependency(JavaScriptProject.buildTypes.JavaScriptProject_FastTests) {
            snapshot {
            }
        }
    }
})
