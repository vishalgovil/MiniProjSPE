pipeline {
    
    environment{
        imageName=""
    }
    agent any

    stages {
        stage('Git pull') {
            steps {
                git branch: 'main', credentialsId: 'ansible', url: 'https://github.com/vishalgovil/MiniProjSPE.git'
            }
        }
        
        
        stage('Maven Build') {
            steps {
                script{
                    sh 'mvn clean install'
                }
            }
        }
        stage('Docker Build') {
            steps {
                script{
                    imageName = docker.build "vishalgovil/calculatordevops:latest"
                }
            }
        }
        
        stage('Push Docker Image') {
            steps {
                script{
                    docker.withRegistry('','docker-jenkins')
                    {
                        imageName.push()
                    }
                }
            }
            }
            
        stage('Ansible Pull Docker Image') {
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'deploy-docker/inventory', playbook: 'deploy-docker/calc-deploy.yml', sudoUser: null
                }
            }    
            
        
    }
}
