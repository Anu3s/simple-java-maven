job('seed_joblocal') {
    description("lets try groovy for first time on $DATE")
    scm {
         git("https://github.com/Anu3s/simple-java-maven.git,master)
    } 
    triggers {
          scm('* * * * *')
    }
    steps {
        maven('clean package' ,'https://github.com/Anu3s/simple-java-maven/blob/master/pom.xml')
    }
    publishers {
        archieveArtifacts '**/*.jar'
    }
}
