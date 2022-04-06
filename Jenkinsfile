pipeline {
  agent any
  stages {
    stage('Unit Test') { 
      environment {
        ANYPOINT_CREDENTIALS = credentials('anypoint.credentials') 
      }
      steps {
        sh 'export MAVEN_HOME=/usr/share/maven'
        sh 'export PATH=$PATH:$MAVEN_HOME/bin'
        sh 'mvn --version'
        sh 'mvn clean package deploy -Danypoint.username=swarnamohanty -Danypoint.password=Mohanty1@mule -Dmaven.properties=src/main/resources/mule.rtf.deploy.properties'
      }
    }
    stage('Deploy Standalone') { 
      steps {
        sh 'mvn deploy -P standalone'
      }
    }
   
    stage('Deploy Runtimefabric') { 
      
      steps {
        sh 'mvn clean package deploy -DmuleDeploy -Dmaven.properties=src/main/resources/mule.rtf.deploy.properties' 
      }
    }
  }
}
