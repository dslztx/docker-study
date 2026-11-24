ARG DOCKER_HUB_ARG=docker.io

FROM ${DOCKER_HUB_ARG}/openjdk21-base:2.0.0

# 不能基础镜像中已经有这里就不做，这个需要实时更新
RUN apt-get update

RUN apt-get --yes install redis-tools
RUN apt-get --yes install mariadb-client
RUN apt-get --yes install python-is-python3

ADD apache-zookeeper-3.7.0-bin.tar.gz /root/
ADD webfile /root/
ADD runweb.sh /root/

RUN chmod 0701 /root/runweb.sh
RUN chmod 0701 /root/webfile

WORKDIR /root

CMD ["/bin/bash", "-c", "/root/runweb.sh && tail -f /dev/null"]
