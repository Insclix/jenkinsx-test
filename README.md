# Notes
Before attempting to deploy to Docker Hub, ensure you have the appropriate <server> tag with the <id>docker.io</id> set up in settings.xml.  The format is described here: https://github.com/spotify/docker-maven-plugin#using-encrypted-passwords-for-authentication

# Commands
### To build the docker image:
mvn clean package

### To build and deploy the docker image to Docker Hub:
mvn clean deploy