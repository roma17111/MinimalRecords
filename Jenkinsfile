pipeline {
    agent any
  environment {

    registry = ""
    dockerContainerName = 'minimalrecords'
    dockerImageName = 'minimalrecords'
  }
  stages {

    stage('Build') {
        agent {
            label "master"
        }
       steps {
         sh "mvn clean install"
       }
    }
  stage('docker-compose start') {
            agent {
              label "AWS"
          }
      steps {
       sh 'docker compose up -d --build --force-recreate'
      }
    }
  }
}