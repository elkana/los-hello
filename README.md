# LOS Hello 1010

A Simple service for test hello world

Part of Loan Originated System

References :
- https://github.com/elkana/los-gateway.git
- git2

# Test
https://ppusso.devoutsys.com:7777/los-hello/time

# Run
```sh
mvn spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=dev"
```

# Jenkins setup
Execute shell:
```sh
docker network create los-network || true
docker rmi los-hello-svc || true
docker build . -t los-hello-svc
docker rm -f los-hello-svc || true
docker run -dp 1010:8080 --name=los-hello-svc --network=los-network los-hello-svc
docker image prune -f || true
```
