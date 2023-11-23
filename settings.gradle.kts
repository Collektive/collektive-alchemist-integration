plugins {
    id("com.gradle.enterprise") version "3.15.1"
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "1.1.15"
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishOnFailure()
    }
}

gitHooks {
    preCommit {
        tasks("detektAll")
    }
    commitMsg { conventionalCommits() }
    createHooks()
}

rootProject.name = "alchemist-incarnation-collektive"
