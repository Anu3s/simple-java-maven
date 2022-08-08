job("scriptjob") {
   description("lets solve this")
   scm {
       git("git@github.com:Anu3s/simple-java-maven", master)
   }
   triggers {
       scm('* * * * *')
   }
   steps {
       maven('clean package', 'simple-java-maven/pom.xml')

   }
   publishers {
       archieveArtifacts '**/*.jar'

   }
