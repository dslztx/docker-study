ARG DOCKER_HUB_ARG=docker.io

FROM ${DOCKER_HUB_ARG}/openjdk21-base:1.0.0

COPY Main.class /

WORKDIR /

#CMD ["java","Main"]

CMD ["/bin/bash", "-c", "tail -f /dev/null"]
