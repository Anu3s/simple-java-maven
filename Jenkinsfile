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
        stage("Mvn Build"){
            steps{
             sh 'mvn clean package'   
            }
        }
    }    
}
