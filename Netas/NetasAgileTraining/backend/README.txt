This is for backend work items

DOCKER:
build docker image:
	docker build -t agiletraining-server .
docker image run on terminal:
	docker run -it -p 8080:8080 agiletraining-server
