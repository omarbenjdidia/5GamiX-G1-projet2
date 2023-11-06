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
        stage('MVN SONARQUBE') {
            steps {
                 
                sh 'mvn sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=admin -Dsonar.password=Sallamiyounes'
            
            }
        }
        stage('Login Docker') {
        steps {
        script {
            sh 'echo Zokhalab123. | docker login -u sallamiyounes --password-stdin'
                }
            }
        }      
        
        stage('NEXUS') {
                    steps {
                        sh 'mvn clean deploy -DskipTests'
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