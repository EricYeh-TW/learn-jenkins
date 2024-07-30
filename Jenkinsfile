pipeline {
    agent {
        docker {
            image 'maven:3.9.8-eclipse-temurin-21-alpine'
            args '-u root'
        }
    }
    stages {
        stage('git clone') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '674d3d7d-d4b7-4979-8974-cf955341c0d2', url: 'https://github.com/EricYeh-TW/learn-jenkins.git']])
            }
        }
        stage('mvn build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('echo finish') {
            steps {
                echo 'test finish'
            }
        }
    }
}