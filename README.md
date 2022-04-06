# 100m-customer-app-new
#This applicaiton is RTF native applciaiton. Can be deployed to RTF without modification.
#use "mvn clean package -Dmule.key=mulesoft" to deploy this applicaiton to RTF.


Step 1: Uploading to Exchange Run
**************************
mvn clean package deploy -Dmaven.properties=src/main/resources/mule.rtf.deploy.properties

Step 2: Deploying to RTF after Step 1 is success
**********************************************
mvn clean package deploy -DmuleDeploy -Dmaven.properties=src/main/resources/mule.rtf.deploy.properties
