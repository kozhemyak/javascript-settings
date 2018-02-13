package JavaScriptProject.patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with uuid = 'f328c924-570c-4f34-999f-ac9be2a0c268' (id = 'JavaScriptProject_DeployToStagging')
accordingly and delete the patch script.
*/
changeBuildType("f328c924-570c-4f34-999f-ac9be2a0c268") {
    expectSteps {
    }
    steps {
        insert(0) {
            script {
                scriptContent = """
                    rmdir /S /Q c:\inetpub\wwwroot
                    xcopy /S /I /Y app c:\inetpub\wwwroot\
                """.trimIndent()
            }
        }
    }

    dependencies {
        remove("JavaScriptProject_IE") {
            snapshot {
            }
        }

    }
}