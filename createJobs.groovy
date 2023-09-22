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
                        url 'https://github.com/ok1Doki/spring-aws.git'
                        credentials('Github-Access-Token')
                    }
                    branch 'dev'
                }
            }
        }
    }
}
pipelineJob('spring-aws-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ok1Doki/spring-aws.git'
                        credentials('Github-Access-Token')
                    }
                    branch 'dev'
                    scriptPath 'Jenkinsfile-docker'
                }
            }
        }
    }
}
pipelineJob('spring-aws-deploy') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ok1Doki/spring-aws.git'
                        credentials('Github-Access-Token')
                    }
                    branch 'dev'
                    scriptPath('Jenkinsfile-aws')
                }
            }
        }
    }
}