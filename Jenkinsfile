pipeline {

    agent any
    stages {
        stage('Compile Stage') {
            steps {
                withMaven() {
                    sh 'mvn clean install'
                }
            }
        }
        stage('Test Stage') {
            steps {
                withMaven() {
                    sh 'mvn test'
                }
            }
        }

        stage('Cucumber Stage') {
            steps {
                cucumber buildStatus: "UNSTABLE",
                        fileIncludePattern: "**/cucumber.json",
                        jsonReportDirectory: "target"
            }

        }

    }
}