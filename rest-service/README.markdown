#### 1A:

`http://localhost:8080/greeting` => `{"name":"O hai, Mark!"}`

`http://localhost:8080/greeting?name=Adam` => `{"name":"O hai, Adam!"}`

#### 1B:

`http://localhost:8080/configured` => `{"name":"O hai, configured!"}`


#### 3D:

check eureka `http://localhost:8761/` eureka for the actual ip of a rest-service application

`http://d0tsp13.mshome.net:8080/publish` => every rest-service get a hello world message, see in the logs:
```
*** message from kafka through cloud bus reveiced: Hello World!
```