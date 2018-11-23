# dockerweb

## to install and build the image
mvn clean install dockerweb:build

## run the image inside docker container  local
 docker run -p 8080:9080 -t hello-howtodoinjava/dockerweb  --name hello-docker-image
 
## push images to web/ aws
1.Log in on https://hub.docker.com/
2.Click on Create Repository
3.Choose a name  and create
4.docker login --username=<> // password will asked 
5.docker images // shows available local images
6.docker push ponnarasuice/ponnar-dockerweb-test
// this will be pushed image into the hub.docker.com
7.Now, this image to be deployed in ECS-fargate:
- Go to aws console -> ECS (elastic container service) it has docker installed in it. fargate is one flavour in which underlying ec2 or infra structure are maintained by aws. another flavour is that we need to maintain underlying ec2 stuffs.
- fargate configuration: 3 steps are there.
- 1.repository: if the image is private in hub.docker.com we can import the image to aws repository and use. we can push image from local as well using aws cli.
- 2.task & container: we need to define task and container configuration(image path).if we give only name:tag it dwn from docker hub site. else give aws repo path.
- 3.cluster & service: 1 thing configure loadbalancer in creating service so that internet facing url is obtained and test our application. and check the container port configuration which is opened to expose outside.


### some issues faced during setup
- project name dont have capital letter in it
- some proxy issue so dns server set to 8.8.8.8 in settings


