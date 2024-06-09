pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                sh(script: 'echo build')
            }
        }
         stage('Test-eslint') { 
            steps {
                sh(script: 'echo eslint')
            }
        }
        stage('Unit-Tests') { 
            steps {
                sh(script: 'echo unit test')
            }
        }
        stage('Deploy') { 
            steps {
                sh(script: 'echo deploy')
                sh(script: 'df -h')
            }
        }
    }
}