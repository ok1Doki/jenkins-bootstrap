pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('spring-app-build') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ok1Doki/spring-with-jenkins-pipelines.git'
                        credentials('Github-Access-Token')
                    }
                    branch 'dev'
                    scriptPath 'Jenkinsfile-app-build'
                }
            }
        }
    }
}
pipelineJob('spring-dockerhub-push') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ok1Doki/spring-with-jenkins-pipelines.git'
                        credentials('Github-Access-Token')
                    }
                    branch 'dev'
                    scriptPath 'Jenkinsfile-dockerhub-push'
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
                        url 'https://github.com/ok1Doki/spring-with-jenkins-pipelines.git'
                        credentials('Github-Access-Token')
                    }
                    branch 'dev'
                    scriptPath('Jenkinsfile-aws-deploy')
                }
            }
        }
    }
}