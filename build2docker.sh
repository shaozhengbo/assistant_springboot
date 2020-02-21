#!/bin/sh

docker stop assistant_springboot

docker rm assistant_springboot

docker image rm assistant_springboot/assistant

mvn package docker:build

docker run -d -p 443:443 -p 8080:8080 --name assistant_springboot -t assistant_springboot/assistant