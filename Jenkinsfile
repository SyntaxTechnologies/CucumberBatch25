pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/SyntaxTechnologies/CucumberBatch25.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

    }

     post {
            always {

                junit '**/target/surefire-reports/*.xml'

                publishHTML(target: [
                    reportDir: 'target',
                    reportFiles: 'cucumber.html',
                    reportName: 'Automation Report',
                    keepAll: true,
                    alwaysLinkToLastBuild: true,
                    allowMissing: false
                ])
            }
        }
    }