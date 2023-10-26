#!/bin/bash

docker build --build-arg DOCKER_HUB_ARG=$DOCKER_HUB -t $DOCKER_HUB/openjdk8-base:$1 .
