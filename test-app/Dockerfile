ARG DOCKER_HUB_ARG

FROM ${DOCKER_HUB_ARG}/openjdk8-base:4.0.0

COPY Main.class /

WORKDIR /

#CMD ["java","Main"]

CMD ["/bin/bash", "-c", "tail -f /dev/null"]
