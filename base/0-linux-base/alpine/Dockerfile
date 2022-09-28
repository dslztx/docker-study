FROM alpine:3.16.2

RUN apk add vim 
RUN apk add busybox-extras 
RUN apk add bash

RUN apk add mysql-client
RUN apk add redis
RUN apk add openjdk8

RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.aliyun.com/g' /etc/apk/repositories 

# 以下不使用cache会很慢
# RUN apk add tcpdump
# RUN apk add wireshark

CMD ["/bin/ash"]
