# dockerweb

## to install and build the image
mvn clean install dockerweb:build

## run the image inside docker container 
 docker run -p 8080:9080 -t hello-howtodoinjava/dockerweb  --name hello-docker-image
 
### some issues faced during setup
- project name dont have capital letter in it
- some proxy issue so dns server set to 8.8.8.8 in settings

