FROM mcr.microsoft.com/dotnet/core/sdk:2.2 AS build-stage
WORKDIR /project
COPY . ./

WORKDIR /project/qnb.api
RUN dotnet publish -c Release -o /project/out

FROM mcr.microsoft.com/dotnet/core/aspnet:2.2.6-alpine3.9
WORKDIR /app
COPY --from=build-stage /project/out .
ENTRYPOINT [ "dotnet","qnb.api.dll" ]
