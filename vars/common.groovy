def call(String stageName){
    if ("${stageName}" == "Build")
    {
        sh "mvn clean package"
    }

    else if ("${stageName}" == "CodeAnalysis")
    {
        sh "mvn clean sonar:sonar"
    }

    else if ("${stageName}" == "Upload")
    {
        sh "mvn clean deploy"
    }
}
