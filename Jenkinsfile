pipeline {
    agent any
    
    
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Run Unit Tests') {
            steps {
                 
                    script {
                        sh 'mvn clean install' 
                    }
                
            }
        }
        stage('Login Docker') {
        steps {
        script {
            sh 'echo Zokhalab123. | docker login -u sallamiyounes --password-stdin'
                }
            }
        }      
        
        

        stage('Build & Push Docker Image ') {
            steps {
                
                    script {
                        sh 'docker build -t sallamiyounes/back .'
                        sh 'docker push sallamiyounes/back'
                    }
                }
            }
    }}