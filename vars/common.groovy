def call(string "stagename"){
	if ("${stagename}" == "build"){
	sh "mvn clean package"
	}
  else if ("${stagename}" == "codeanalysis"){
  sh "mvn sonar:sonar"
  }
  else if ("${stagename}" == "upload"){
  sh "mvn deploy"
  }
 
}
