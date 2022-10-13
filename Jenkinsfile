pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for Sit enviroment..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing in SIT enviroment..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying in SIT to move to UAT....'
            }
        }
    }
}
