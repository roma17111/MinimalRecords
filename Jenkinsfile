pipeline {
    agent AWS
  environment {

    registry = ""
    dockerContainerName = 'minimalrecords'
    dockerImageName = 'minimalrecords'
  }
  stages {
    stage('Build') {
       steps {
         sh "mvn clean install"
       }
    }
  stage('docker-compose start') {
      steps {
       sh 'docker compose up -d --build --force-recreate'
      }
    }
  }
}