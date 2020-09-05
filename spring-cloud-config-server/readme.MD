`http://localhost:8888/rest-service/dev/2A`

```json
{
	"name": "rest-service",
	"profiles": ["dev"],
	"label": "2A",
	"version": "18e14520005d3da65a2c2412c21b8328e35d1bb6",
	"state": null,
	"propertySources": [{
		"name": "https://github.com/adambalazs-lr/spring-boot-config-demo.git/rest-service-dev.yml",
		"source": {
			"foo": "dev"
		}
	}, {
		"name": "https://github.com/adambalazs-lr/spring-boot-config-demo.git/rest-service.yml",
		"source": {
			"hello": "World"
		}
	}]
}
```

`http://localhost:8888/rest-service/qa/2A`

```json
{
	"name": "rest-service",
	"profiles": ["qa"],
	"label": "2A",
	"version": "18e14520005d3da65a2c2412c21b8328e35d1bb6",
	"state": null,
	"propertySources": [{
		"name": "https://github.com/adambalazs-lr/spring-boot-config-demo.git/rest-service-qa.yml",
		"source": {
			"foo": "qa"
		}
	}, {
		"name": "https://github.com/adambalazs-lr/spring-boot-config-demo.git/rest-service.yml",
		"source": {
			"hello": "World"
		}
	}]
}
```


`http://localhost:8888/rest-service/prod/2A`

```json
{
	"name": "rest-service",
	"profiles": ["prod"],
	"label": "2A",
	"version": "18e14520005d3da65a2c2412c21b8328e35d1bb6",
	"state": null,
	"propertySources": [{
		"name": "https://github.com/adambalazs-lr/spring-boot-config-demo.git/rest-service-prod.yml",
		"source": {
			"foo": "prod"
		}
	}, {
		"name": "https://github.com/adambalazs-lr/spring-boot-config-demo.git/rest-service.yml",
		"source": {
			"hello": "World"
		}
	}]
}
```