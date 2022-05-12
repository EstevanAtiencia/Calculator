pipeline {
  agent any
  stages {
    stage('Clean') {
      steps {
         chmod +x ./gradlew
         sh './gradlew clean'
      }
    }
  }
}
