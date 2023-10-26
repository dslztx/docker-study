ARG DOCKER_HUB_ARG

FROM ${DOCKER_HUB_ARG}/openjdk8-base:4.0.0

# 基础镜像中已经完成apt-get update

RUN apt-get --yes install redis-tools
RUN apt-get --yes install mariadb-client

ADD apache-zookeeper-3.7.0-bin.tar.gz /root/

WORKDIR /root

CMD ["/bin/bash", "-c", "tail -f /dev/null"]
