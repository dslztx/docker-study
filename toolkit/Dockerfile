ARG DOCKER_HUB_ARG=docker.io

FROM ${DOCKER_HUB_ARG}/openjdk21-base:1.0.0

# 不能基础镜像中已经有这里就不做，这个需要实时更新
RUN apt-get update

RUN apt-get --yes install redis-tools
RUN apt-get --yes install mariadb-client
RUN apt-get --yes install clickhouse-client

ADD apache-zookeeper-3.7.0-bin.tar.gz /root/

WORKDIR /root

CMD ["/bin/bash", "-c", "tail -f /dev/null"]
