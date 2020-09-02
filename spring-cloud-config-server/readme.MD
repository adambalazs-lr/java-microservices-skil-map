`http://localhost:8888/config-client/dev/2A`

```json
{
	"name": "config-client",
	"profiles": ["dev"],
	"label": "master",
	"version": "fa5dfadd8e849c898f87b59e04d6f32e8f740fc2",
	"state": null,
	"propertySources": [{
		"name": "https://github.com/adambalazs-lr/spring-boot-config-demo.git/application-dev.yml",
		"source": {
			"foo": "dev"
		}
	}, {
		"name": "https://github.com/adambalazs-lr/spring-boot-config-demo.git/application.yml",
		"source": {
			"hello": "World"
		}
	}]
}
```

`http://localhost:8888/config-client/qa/2A`

```json
{
	"name": "config-client",
	"profiles": ["qa"],
	"label": "master",
	"version": "fa5dfadd8e849c898f87b59e04d6f32e8f740fc2",
	"state": null,
	"propertySources": [{
		"name": "https://github.com/adambalazs-lr/spring-boot-config-demo.git/application-qa.yml",
		"source": {
			"foo": "qa"
		}
	}, {
		"name": "https://github.com/adambalazs-lr/spring-boot-config-demo.git/application.yml",
		"source": {
			"hello": "World"
		}
	}]
}
```


`http://localhost:8888/config-client/prod/2A`

```json
{
	"name": "config-client",
	"profiles": ["prod"],
	"label": "master",
	"version": "fa5dfadd8e849c898f87b59e04d6f32e8f740fc2",
	"state": null,
	"propertySources": [{
		"name": "https://github.com/adambalazs-lr/spring-boot-config-demo.git/application-prod.yml",
		"source": {
			"foo": "prod"
		}
	}, {
		"name": "https://github.com/adambalazs-lr/spring-boot-config-demo.git/application.yml",
		"source": {
			"hello": "World"
		}
	}]
}
```