FROM ubuntu:22.04

COPY sources.list /etc/apt

RUN apt-get update 

RUN apt-get --yes install vim
RUN apt-get --yes install redis-tools
RUN apt-get --yes install mariadb-client


CMD ["/bin/bash"]
