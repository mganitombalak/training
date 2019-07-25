FROM alpine as build-phase
WORKDIR /angular-project
COPY . .
RUN apk update && \
    apk add nodejs && \
    apk add npm && \
    npm install && \
    npm install -g @angular/cli && \
    ng build --aot

FROM httpd
WORKDIR /usr/local/apache2/htdocs/ 
COPY --from=build-phase /angular-project/dist/qnb-ui .