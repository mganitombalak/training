FROM mcr.microsoft.com/dotnet/core/sdk:2.2 AS build-stage
WORKDIR /isnet
COPY . ./
WORKDIR /isnet/isnet.api
RUN dotnet publish -c Release -o /isnet/out
#=============================================================
FROM mcr.microsoft.com/dotnet/core/aspnet:2.2.6-alpine3.9
WORKDIR /isnetcore-api
COPY --from=build-stage /isnet/out . 
ENTRYPOINT [ "dotnet","isnet.api.dll" ]
EXPOSE 80