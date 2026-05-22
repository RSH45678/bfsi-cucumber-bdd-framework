pipeline {
    agent any

    tools {
        maven 'MyMaven'
        jdk 'MyJDK'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                url: 'https://github.com/RSH45678/bfsi-cucumber-bdd-framework.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            echo 'Execution Completed'
        }

        success {
            echo 'Build Passed'
        }

        failure {
            echo 'Build Failed'
        }
    }
}
