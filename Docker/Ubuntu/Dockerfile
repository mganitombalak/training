FROM ubuntu:latest
ARG DENEME="HELLLO IS IT ME YOU LOOKING FOR"
COPY readme.txt /opt
RUN apt-get update && apt-get install -y git
CMD ["echo",DENEME]