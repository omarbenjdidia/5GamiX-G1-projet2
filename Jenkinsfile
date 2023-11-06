pipeline {
    agent any
    
    
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Run Unit Tests mockito') {
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
        stage('DockerCompose Back/DB') {
            steps {

                     script {
                         sh 'docker-compose -f docker-compose.yml up -d'
                         sh 'docker-compose -f docker-compose.yml start'
                            }

                 }
            }
        stage('NEXUS') {
            steps {
                         sh 'mvn clean deploy -DskipTests'
                  }
                       }
        stage('MVN SONARQUBE') {
            steps {

                          sh 'mvn sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=admin -Dsonar.password=Sallamiyounes'

                   }
                               }
    }}