Build project:
./mvnw clean install dockerfile:build

Deploy project
./mvnw dockerfile:push -Ddockerfile.username=******* -Ddockerfile.password=*******