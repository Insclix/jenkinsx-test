# Notes
Before attempting to deploy to Docker Hub, ensure you have the appropriate <server> tag set up in the format described here: https://github.com/spotify/docker-maven-plugin#using-encrypted-passwords-for-authentication

# Commands
### To build the docker image:
mvn clean package docker:build

### To deploy the docker image to Docker Hub:
mvn docker:build -DpushImage

### To build and deploy the docker image to Docker Hub:
mvn clean package docker:build -DpushImage