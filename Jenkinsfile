

pipeline{
    agent any
    environment {
        def var1 = "variable1"
    }
    stages{
        stage('Clone'){
            steps{
                script{
                    git credentialsId: 'github', url: 'https://github.com/Nagaraj4775/Jenkins-Example.git'
                }
            }
        }
        stage('Second'){
            steps{
                script{
                    customProperties = readYaml file: "jenkins-properties.yml"
                    echo "Hello"
                    echo "${var1}"
                    echo "${customProperties.autoDeploy}"
                     
                }
            }
        }
         stage('Three'){
            steps{
                script{
                    echo "${customProperties.sonarAnalysis}"
                     
                }
            }
        }
    }
}
