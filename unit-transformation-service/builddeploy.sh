mvn clean package -DskipTests -Pcloud
az spring-cloud app deploy \
  -n unit-service  \
  --jar-path target/unit-service-0.0.1-SNAPSHOT.jar
