ARG DOCKER_HUB_ARG

FROM ${DOCKER_HUB_ARG}/debian11.7-base:3.0.0

COPY jdk8u345-b01 /usr/java/jdk8/

ENV JAVA_VERSION=1.8.0_345 JAVA_HOME=/usr/java/jdk8

ENV PATH=/usr/java/jdk8/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin

CMD ["/bin/bash"]
