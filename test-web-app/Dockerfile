ARG DOCKER_HUB_ARG=docker.io

FROM ${DOCKER_HUB_ARG}/openjdk21-base:1.0.0

COPY web-1.0.0-jar-with-dependencies.jar /
COPY run.sh /

RUN chmod 0701 /run.sh

WORKDIR /

CMD ["/bin/bash", "-c", "/run.sh && tail -f /dev/null"]
