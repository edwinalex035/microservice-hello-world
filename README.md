Docker Installation:
The easiest way to install docker is using the bash script: https://docs.docker.com/install/linux/docker-ce/ubuntu/#install-using-the-convenience-script

Docker-Compose Installation:
https://docs.docker.com/compose/install/

Service Registry:
https://www.baeldung.com/spring-cloud-netflix-eureka

used IDE: Intellij IDEA. Please install the following plugins: Lombok, .env Files Support, Docker, FindBugs IDEA, google-java-format, Lombok).

In order to run the project, you must be in the root folder and execute the following command: mvn clean install. This will generate the docker images for each module.
After generate the images, you can do the deploy in docker using docker-compose. In this case, you can run docker-compose up.
