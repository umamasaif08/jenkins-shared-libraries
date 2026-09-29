def call(String credId, String imageTag, String projectName , String dockerHubUser){
  withCredentials([usernamePassword(
                    credentialsId:"${credId}",
                    passwordVariable: "dockerHubPass",
                    usernameVariable: "dockerHubUser"
                )]){
                
                bat "docker login -u ${dockerHubUser} -p ${dockerHubPass}"            
                }  
                bat "docker push ${dockerHubUser}/${projectName}:${imageTag}"
}
