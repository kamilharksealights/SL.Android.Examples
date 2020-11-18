buildscript {
    repositories {
        google()
        jcenter()
        mavenLocal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.0.1")
        classpath("com.android.tools.build:gradle-api:4.0.1")
        "classpath"(group = "io.sealights.on-premise.agents.plugin", name = "sealights-gradle-plugin", version = "3.0.0")
    }
}

allprojects {
    val included: List<String> = listOf()
    val excluded: List<String> = listOf()

    if (!included.isEmpty()) {
        println("[SeaLights Integration] Including only projects: ${included}")
    }

    if (!excluded.isEmpty()) {
        println("[SeaLights Integration] Excluding projects: ${excluded}")
    }

    if (!excluded.contains(name) &&
            (included.isEmpty() || included.contains(name))) {
        println("[SeaLights Integration] SeaLights applied to project: '${name}'")

        apply {
            plugin(io.sealights.onpremise.agents.plugin.SealightsPlugin::class.java)
        }

        configure<io.sealights.onpremise.agents.plugin.SealightsPluginExtension> {

token="eyJhbGciOiJSUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL0RFVi1rYW1pbC5hdXRoLnNlYWxpZ2h0cy5pby8iLCJqd3RpZCI6IkRFVi1rYW1pbCxpLTA4OWJlODEyMzdjMjQwMDdiLEFQSUdXLWE4ODlhYTYzLTExZDUtNGM4MS05ZjA4LTQ2NzU2YWYyOWNiNywxNjA1Njg2NTcxNzM5Iiwic3ViamVjdCI6IlNlYUxpZ2h0c0BhZ2VudCIsImF1ZGllbmNlIjpbImFnZW50cyJdLCJ4LXNsLXJvbGUiOiJhZ2VudCIsIngtc2wtc2VydmVyIjoiaHR0cHM6Ly9kZXYta2FtaWwtZ3cuZGV2LnNlYWxpZ2h0cy5jby9hcGkiLCJzbF9pbXBlcl9zdWJqZWN0IjoiIiwiaWF0IjoxNjA1Njg2NTcxfQ.Bt9Et0diPlr293y3a98r8lW56OcPWr-LqHFVOpVgZmabHLzcwTSAdz7weilZFSxIF9bx4HhhnFy5FS1Bk0_cEew9hktzwDEANMyIG3nSnxjR0Ds8BOCJ-B0tS-ZgDJohzQAFQtLZU8cLRi6vANBaQ1hD6ts215B6SyWk4GckvSa6hL7eZsF16Ypc-2HOOQP0gZNqXpDOszhmN3TXJzOO32JhtysqBGHywiVPyr1QPaMBMcf44XWl7fsKnmF9D-BxacyaLs1UW6ay74Io5N_CA1bV0mXnv3po4dOIL-Z5jJRiFAghvD0m36ObCKFIduAiO6zyWCF57-wPp3M4zjES1Zjy5ov-g0ML-YHIBPCPrL-8t0ky3MAUSUZi_21jKb78jViDd9TBT1YL4wLmtN8Hftdi4e0QEsisHkDUt9BIQ8FloKhne8FFQz_qq_0pqu1s7etmx5XV_t-7QOyaEE9acg83oWqJYFYVAxUoyuVwa6Fju-Tac55JHEQ5ga4pDHjckqNjBQO7O_TlF4ehA9a5ujYu-9ce5gY772PdFUC9e9VpyCq9npHhVdS5zylcPgAUc6-luyu69VhN5J2LSWK6mtVny6IyJk8ze2ehNV25Z4nN53lypDc1PN9F05WEH7HUbJ7tmsqVqrORoW4HIrz4NRYLKZ7wSRD9OuN1iXT4WTk"
appName="SL.Android.Examples"
filesIncluded="*.class"
filesExcluded="*test-classes*"
packagesIncluded="*com.example.*"
packagesExcluded=""
isRecursive=true
isIncludeResources=true
isRunTestOnly=false
isLogEnabled=true
isLogPluginMinimal=false
isLogToConsole=true
logLevel="debug"
logFolder="/tmp"
isCreateBuildSessionId=true
build="SL_Timestamp"
branch="master"

        }
    }
}
