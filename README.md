# pokemon-api
pokemon api

# running
mvn clean install

#  change directory
cd docker
#  build the image
docker build -t pokemon-api .
#  list the image
docker images
#  login into your registry (Docker Hub)
docker login
#  tag the image
docker tag pokemon-api <repository name>/pokemon-api
# push the image
docker push <repository name>/pokemon-api
