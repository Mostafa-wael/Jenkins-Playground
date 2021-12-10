# To Run the Docker Container
1. Create the package.json file.
2. Run `npm install` to generate `package-lock.json` file.
3. Create a server.js file that defines the web app using the Express.js framework.
4. Build the image: docker build . -t docker_web
5. Run the image: docker run -p 8080:8080 -d docker_web
6. Print the output: docker logs <container id>
7. Enter the Container: docker exec -it <container id> /bin/bash
8. Try testing from outside: curl -i localhost:8080

# To Run Jenkins Inside a New Container
1. Run: `docker run -p 8080:8080 -p 50000:50000 -d -v jenkins_home:/var/jenkins_home jenkins/jenkins:lts`
2. Get the password: `docker ps` -> `docker logs <ID>` -> get the password.
3. Go to localhost:8080.
4. Recommended packages.
5. Create a profile with username and password.
6. Start using jenkins

  
