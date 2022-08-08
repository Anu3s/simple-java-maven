job('seed_joblocal') {
    description("lets try groovy for first time")
    scm {
         git("git@github.com:Anu3s/simple-java-maven.git", master)
    } 
    triggers {
          scm('* * * * *')
    }
    steps {
        maven('clean package','simple-java-maven/pom.xml')
    }
    publishers {
        archieveArtifacts '**/*.jar'
    }
}
