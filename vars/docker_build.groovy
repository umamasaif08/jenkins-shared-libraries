def call(String ProjectName , String ImageTag , String DockerHubUser){
      bat """
        if exist data\\mysql\\db\\mysql.sock (
            del /f /q data\\mysql\\db\\mysql.sock
        )

        docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} .
    """
}
