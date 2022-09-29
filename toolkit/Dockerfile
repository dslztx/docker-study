FROM openjdk8-base:1.0.0

# 基础镜像中就是使用了替换源
# COPY sources.list /etc/apt

RUN apt-get --yes install redis-tools
RUN apt-get --yes install mariadb-client

ADD apache-zookeeper-3.7.0-bin.tar.gz /root/

WORKDIR /root

CMD ["/bin/bash", "-c", "tail -f /dev/null"]
