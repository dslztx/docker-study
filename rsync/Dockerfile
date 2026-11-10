ARG DOCKER_HUB_ARG=docker.io

FROM ${DOCKER_HUB_ARG}/debian13.7-base:1.0.0

COPY logrotate_rsync /etc/logrotate.d/
COPY rsyncd.conf /rsync/
COPY rsyncd.secrets /rsync/
COPY run.sh /rsync/

RUN chmod 0644 /etc/logrotate.d/logrotate_rsync
RUN chmod 0600 /rsync/rsyncd.secrets
RUN chmod 0701 /rsync/run.sh

# RUN mkdir /rsync/data

WORKDIR /rsync

CMD ["/bin/bash", "-c", "/rsync/run.sh && tail -f /dev/null"]
