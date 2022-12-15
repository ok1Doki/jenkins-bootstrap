pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('spring-aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'git@github.com:ok1Doki/spring-aws.git'
                        credentials('Github-SSH')
                    }
                    branch 'dev'
                }
            }
        }
    }
}