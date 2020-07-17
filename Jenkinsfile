#!groovy
@Library("shared-library") _

pipeline{
    agent any
    stages{
        stage('one'){
            steps{
                script{
                    echo "Hello"           
                   //slackSend channel: 'jenkins-test', color: '#439FE0', message: 'Hello'
                
                    notifyBuild(currentBuild.result,"jenkins-test")
                }
            }
        }
    }
}
