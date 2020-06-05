mvn clean package -DskipTests -Pcloud
az spring-cloud app deploy \
  -n currency-service  \
  --jar-path target/currency-service-0.0.1-SNAPSHOT.jar
