def call(Map params){
	pipeline{
		environment {
            docker_image = ''
        }
        
        agent any
        
        stages {
            stage('Github stage') {
                steps {
                   
                }
            }
            
            stage('Build Stage') {
                steps {
                  echo ${params.main}
                    }
                }
            }
            
            stage('Push Stage') {
                steps {
                   
                    }
                }
            }
        }
		
		
		post{
			success {
				script {
				}
			}
		}
	}
}