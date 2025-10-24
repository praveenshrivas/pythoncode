pipeline {
    agency any {
        environment {
            AWS_DEFAULT_REGION = 'ap-south-1'
            AWS_ACCESS_KEY = '234567890wertyui'
            AWS_SECRET_ACCESS_KEY = 'SDFGHJK23456789DFGHJ'
        }
        
        stages {
            stage('Checkout your Code'){
                steps {
                    echo "Cloning the github repo"
                    checkout scm
                }
            }
            stage('Initiation the Terraform'){
                steps{
                    echo "initialize Terraform"
                    sh 'terraform init'
                }
            }
            stage('Plan Terraform'){
                steps{
                    echo "Planning"
                    sh 'terraform plan'
                }
            
            }
            stage('Apply Terraform'){
                echo "Applying Terraform Changes"
                sh 'terraform apply -auto-approve tfplan'
            }
        }
        post {
            always{
                echo "Terraform created the infra"
            }
        }
    }
}
