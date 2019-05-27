## Connecting to an Amazon Aurora PostgreSQL DB Cluster

You can connect to a DB instance in your Amazon Aurora PostgreSQL DB cluster using the same tools that you use to connect to a PostgreSQL database.You can use the endpoint and port information from the primary instance in your Aurora PostgreSQL DB cluster in the connection string of any script, utility, or application that connects to a PostgreSQL DB instance.
## Connection Utilities for Aurora PostgreSQL

##### Command line:

You can connect to an Amazon Aurora PostgreSQL DB instance by using tools like psql, the PostgreSQL interactive terminal.

The general format for using psql to connect is shown following.

psql "host=hostName port=portNumber dbname=DBName user=userName"

##### GUI :

You can use the pgAdmin utility to connect to a PostgreSQL DB instance by using a UI interface.

##### Applications("Service") :
You can use the PostgreSQL JDBC driver to connect your applications to your PostgreSQL DB instance. 

To access the database, in Spring Boot application, database host,port,db name,username and password are set as variable in "application.yml".

```java
spring:
  datasource:
    url: jdbc:postgresql://${db-host}:${db-port}/${db-name}
    username: ${db-username}
    password: ${db-password}
```
Database host,username,password are stored in Aws Secrect Manager. Variables in "application.yml" will be exposed and set through the terraform script while deploying the application.
Update these terraform scripts accordingly.

```terraform
./terraform/30_services/secrets.tf
./terraform/30_services/task.tf
./terraform/30_services/main.tf
```
