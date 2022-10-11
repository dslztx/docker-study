FROM debian:9

COPY sources.list /etc/apt

# the following env configs solve warning: debconf: delaying package configuration, since apt-utils is not installed
ENV DEBIAN_FRONTEND noninteractive
ENV DEBCONF_NOWARNINGS="yes"

RUN apt-get update

RUN apt-get --yes install vim

RUN apt-get --yes install procps
RUN apt-get --yes install telnet
RUN apt-get --yes install net-tools

RUN apt-get --yes install locales
RUN echo "en_US.UTF-8 UTF-8" >> /etc/locale.gen && locale-gen en_US.UTF-8

ENV LANG=en_US.UTF-8
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

CMD ["/bin/bash"]
