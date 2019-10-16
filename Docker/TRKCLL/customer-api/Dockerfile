FROM alpine:3.10.2

RUN apk update && apk add openjdk8-jre-base

WORKDIR /app

COPY ./target/customer-api.jar .

CMD ["java","-jar","customer-api.jar"]

EXPOSE 80