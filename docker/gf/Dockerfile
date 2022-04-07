FROM ubuntu:18.04


COPY      ./gf-3.11-ubuntu-18.04.deb /gf-3.11-ubuntu-18.04.deb 

WORKDIR   /
RUN       apt-get install ./gf-3.11-ubuntu-18.04.deb

CMD tail -f /dev/null
