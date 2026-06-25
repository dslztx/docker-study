ARG DOCKER_HUB_ARG=docker.io

FROM ${DOCKER_HUB_ARG}/debian11.7-base:5.0.0

COPY eclipse-temurin-openjdk21 /usr/java/jdk21/

ENV JAVA_VERSION=21.0.11+10 JAVA_HOME=/usr/java/jdk21

ENV PATH=/usr/java/jdk21/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin

CMD ["/bin/bash"]
