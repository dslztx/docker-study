#!/bin/bash

nohup /usr/bin/rsync --daemon --config=/rsync/rsyncd.conf --port=8730 > nohup.out 2>&1 &
