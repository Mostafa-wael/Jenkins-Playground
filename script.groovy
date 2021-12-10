def buildApp() {
    echo 'building the application...'
} 
def testApp() {
    echo 'testing the application...'
} 
def deployApp() {
    echo "deploying version ${params.VERSION}"
} 
return this