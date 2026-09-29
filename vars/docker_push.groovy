def call(String credId, String imageName , String projectName , String dockerHubUser){
  withCredentials([usernamePassword(
                    credentialsId:"${credId}",
                    passwordVariable: "dockerHubPass",
                    usernameVariable: "dockerHubUser"
                )]){
                
                sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"            
                }  
                sh "docker push ${dockerHubUser}/${projectName}:${imageName}"
}
