FROM openjdk8-base:3.0.0

COPY web-1.0.0-jar-with-dependencies.jar /
COPY run.sh /

RUN chmod 0701 /run.sh

WORKDIR /

CMD ["/bin/bash", "-c", "/run.sh && tail -f /dev/null"]
