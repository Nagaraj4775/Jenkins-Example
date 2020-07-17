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

def notifyBuild(String buildStatus = 'STARTED', channelAddr) {
  // build status of null means successful
  buildStatus = buildStatus ?: 'SUCCESS'

  // Default values
  def colorName = 'RED'
  def colorCode = '#FF0000'
  def subject = "${buildStatus}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'"
  def summary = "${subject} (${env.BUILD_URL})"
  def details = """<p>${buildStatus}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'.replaceAll("%2F", "/"):</p>
    <p>Check console output at &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>"""

  // Override default values based on build status
  if (buildStatus == 'STARTED') {
    color = 'YELLOW'
    colorCode = '#FFFF00'
  } else if (buildStatus == 'SUCCESS') {
    color = 'GREEN'
    colorCode = '#00FF00'
  } else {
    color = 'RED'
    colorCode = '#FF0000'
  }

  // Send notifications
  slackSend (channel: channelAddr, color: colorCode, message: summary)
}
