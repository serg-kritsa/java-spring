
## configure env variables in powershell
[PowerShell docs](https://docs.microsoft.com/en-us/powershell/module/microsoft.powershell.core/about/about_environment_variables?view=powershell-7.2)

Get-ChildItem Env:
$Env:JAVA_HOME = "C:\Program Files\Java\jdk-15.0.1"
$Env:JAVA_HOME

## run app using maven wrapper
./mvnw spring-boot:run

## open H2 console
* spring5webapp-adding-thymeleaf-v2\src\main\resources\application.properties
* spring.h2.console.enabled=true
* ./mvnw spring-boot:run
* http://localhost:8080/h2-console/
* 'JDBC URL'='jdbc:h2:mem:testdb' > +'Connect'

## get demo app
* git clone https://github.com/spring-petclinic/spring-framework-petclinic.git
* cd spring-framework-petclinic
## run demo app from cmd (w/ in-memory db)
* ./mvnw jetty:run-war
* http://localhost:8080/
### run demo app via docker (w/ in-memory db)
* docker run -p 8080:8080 springcommunity/spring-framework-petclinic

## run demo app (w/ myssql db)
* ./mvnw jetty:run-war -P MySQL
* docker run -e MYSQL_USER=petclinic -e MYSQL_PASSWORD=petclinic -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=petclinic -p 3306:3306 mysql:5.7.8
## get demo app (w/ psql db)
* ./mvnw jetty:run-war -P PostgreSQL
* docker run --name postgres-petclinic -e POSTGRES_PASSWORD=petclinic -e POSTGRES_DB=petclinic -p 5432:5432 -d postgres:9.6.0


## use env variable via IDE
guru.username=superuser         will be         GURU_USERNAME=superuserFromEnvVar

## use program argument via IDE (PRIORITY OVER ENV)
guru.password=superuser         will be         --guru.password=superpwdFromCmdLineArg


