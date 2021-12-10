pipeline{
agent any
parameters{
    choice(name: 'Version', choices:['1.0', '2.7'], description: '')
    booleanParam(name: 'Do Testing', defaultValue: true)
}
stages{
    stage('Build'){
        steps{
            echo "Building"
        }
    }
     stage('Test'){
        steps{
            echo "Testing"
        }
    }
     stage('Deploy'){
        steps{
            echo "Deploying"
        }
    }
}
}