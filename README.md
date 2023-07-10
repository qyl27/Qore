# Qore
A minecraft bukkit plugins dev helper library.

## License
For non-commercial use: **MIT license**.
For commercial use: Please contact qyl27 for license.

## Building
```shell
.\gradlew build
```

### Debugging
1. Install maven and set `MAVEN_HOME` env var.
2. Run `gradlew buildTools`

3. Run command below:
Use spigot: 
```
gradlew devServer -Ppmake.server=../buildTools/spigot-1.20.1.jar -Ppmake.port=25575 -Ppmake.dir=run/server
```
Or use paper:
```
gradlew devServer -Ppmake.version=1.20.1 -Ppmake.port=25575 -Ppmake.dir=run/server
```