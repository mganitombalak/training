FROM alpine:3.9
WORKDIR /myapi
COPY ./mystupidapi/* ./
RUN apk update && \
    apk add nodejs && \
    apk add npm && \
    npm install
CMD [ "node", "app.js" ]
EXPOSE 5000