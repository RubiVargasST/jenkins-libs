def call(Map params){
	pipeline{
		environment {
            docker_image = ''
        }
        
        agent any
        
        stages {
            stage('Github stage') {
                steps {
                    script{
                        echo ${params.main}
                    }
                    // git(
                    //     url: 'https://github.com/sparktechsllc/DISC.git',
                    //     credentialsId: 'jonathan-github-token',
                    //     branch: params.GitBranch
                    // )
                }
            }
        }
    }    
}