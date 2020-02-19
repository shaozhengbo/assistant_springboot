#!/bin/sh

docker image rm assistant_springboot/assistant

mvn package docker:build

docker run -d -p 8080:8080 --name assistant_springboot -t assistant_springboot/assistant