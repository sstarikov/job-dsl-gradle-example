freeStyleJob('gc-amazon-lady') {
    logRotator(-1, 10)
    jdk('Java 8')
    scm {
        github('jenkinsci/job-dsl-plugin', 'master')
    }
    triggers {
        githubPush()
    }
    wrappers {
        nodejs('NodeJS 0.10.26')
    }
    steps {
        shell('which node && node -v')
    }
    publishers {
        archiveArtifacts('job-dsl-plugin/build/libs/job-dsl.hpi')
    }
}
