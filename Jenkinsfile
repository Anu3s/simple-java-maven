pipeline{
    agent any
    tools {
        maven 'Maven1'
    }
    stages{
        stage("Git Checkout"){
            steps{    
            git credentialsId: 'GitHubAcc', url: 'https://github.com/avik12/simple-java-maven.git'
            }
        }
        stage("Build"){
            steps{
             sh 'mvm clean package'   
            }
        }
    }    
}
