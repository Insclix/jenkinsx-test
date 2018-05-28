Build project:
mvn clean install dockerfile:build

Deploy project
mvn dockerfile:push -Ddockerfile.username=******* -Ddockerfile.password=*******

Build & Deploy 
mvn clean install dockerfile:push -Ddockerfile.username=******* -Ddockerfile.password=*******