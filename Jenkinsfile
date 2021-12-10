def gv
pipeline{
agent any
parameters{
    choice(name: 'Version', choices:['1.0', '2.7'], description: '')
    booleanParam(name: 'Do Testing', defaultValue: true)
}
stages{
    stage('Init'){
        steps{
            script
            {
                gv = load "script.groovy"
            }
        }
    }
    stage('Build'){
        steps{
            script
            {
                gv.buildApp
            }
        }
    }
     stage('Test'){
        steps{
            script
            {
                gv.buildApp
            }
        }
    }
     stage('Deploy'){
        steps{
            script
            {
                gv.buildApp
            }
        }
    }
}
}