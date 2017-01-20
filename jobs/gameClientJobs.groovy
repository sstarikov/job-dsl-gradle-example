freeStyleJob('gc-amazon-lady') {
    logRotator(-1, 10)
    jdk('Java 8')
    scm {
        github('jenkinsci/job-dsl-plugin', 'master')
    }
    triggers {
        githubPush()
    }
    concurrentBuild()
    wrappers {
        nodejs('NodeJS node7')
    }
    steps {
        shell '''
            #!/bin/bash
            which node
            node -v
        '''.stripIndent().trim()
    }
}
