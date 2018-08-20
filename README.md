# spring-cloud-sleuth-zipkin
## zipkin 
### Run Docker
docker run -d -p 9411:9411 --name zipkin openzipkin/zipkin

### Run Zipkin for zip-kin spring boot(Zipkin-Server).
Run local by spring boot -> mvn spring-boot:run and up on port:9411.


## deposit
It's a rest-api for deposit service allow user deposit by using accountNo+amount.
Run local by spring boot -> mvn spring-boot:run and up on port:8080.

## user-account
It's a rest-api for account management allow deposit call for checking account.
Run local by spring boot -> mvn spring-boot:run and up on port:8084.
