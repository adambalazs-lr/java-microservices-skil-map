| DIR | WHAT? | WHERE? |
| ------------ | ------ | ------------------------------------------------------------------------------------------------------------------ |
| rest-service | client | http://localhost:8080/greeting<br/>http://localhost:8080/greeting?name=Adam<br/>http://localhost:8080/configured<br/>http://localhost:8080/foo |
| feign-service | client | http://localhost:8081/greeting |
| spring-cloud-config-server | cloud config server | http://localhost:8888/config-client/development/master |
| greeter | ribbon demo  | http://localhost:9090/invoke |
| eureka service | Eureka Service | http://localhost:8761/ |



