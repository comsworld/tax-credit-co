FROM maven:3.5.4-jdk-8-alpine

ENV HOME /src
RUN mkdir -p $HOME
WORKDIR /src

COPY . $HOME/

CMD tail -f /dev/null