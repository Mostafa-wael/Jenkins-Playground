# Jenkins-Playground
A playground to illustrate the use of Jenkins in CI/CD

# To Create & Run the Docker Container
1. Create the `package.json` file.
2. Run `npm install` to generate `package-lock.json` file.
3. Create a `server.js` file that defines the web app using the Express.js framework.
4. Build the image: `docker build . -t docker_web`
5. Run the image: `docker run -p 8080:8080 -d docker_web`
6. Get the container ID using the `docker ps` command.
7. Print the output: `docker logs <container id>`
8. Enter the Container: `docker exec -it <container id> /bin/bash`
9. Try testing from outside: `curl -i localhost:8080`

# To Run Jenkins Inside a New Container
1. Run: `docker run -p 8080:8080 -p 50000:50000 -d -v jenkins_home:/var/jenkins_home jenkins/jenkins:lts`
2. Get the password: `docker ps` -> `ddocker logs <container id>` -> get the password.
3. Go to `localhost:8080`.
4. Choose recommended packages.
5. Create a profile with a username and password.
6. Start using jenkins!

# Connect To a Private Repository Using SSH
1. Go to ssh directory: `cd ~/.ssh`
2. Generate a key: `ssh-keygen -o -t rsa`
3. When you type `ls` you should find: id_rsa and id_rsa.pub.
4. Show and copy the contents of the public key: `cat id_rsa.pub`
5. Go to the repo on github.
6. Open settings -> Deploy Keys.
7. Add the key and give it a name.
8. Open Jenkins -> Manage Jenkins -> Manage Credentials.
9. Click global -> Add Credentials.
10. Fill: Kind = SSH, ID = any name, Description = any, Username = doesn't matter.
11. Private Key -> Enter Key -> Add the whole name (Even the start and the end comments).
12. Start a new pipeline.
13. Source = (from Github repo -> Code -> SSH).
14. Build the Repo!
  
# To Use Docker in Jenkins:
1. Install the following plugins:
   - [Docker pipeline][1] 
   - [Docker][2] 
2. Use `agent { dockerfile true }` in the Jenkinsfile.

  [1]: https://plugins.jenkins.io/docker-workflow/
  [2]: https://plugins.jenkins.io/docker-plugin/
