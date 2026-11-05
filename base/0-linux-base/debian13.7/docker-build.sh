#!/bin/bash

docker build --no-cache -t $DOCKER_HUB/debian13.7-base:$1 .
