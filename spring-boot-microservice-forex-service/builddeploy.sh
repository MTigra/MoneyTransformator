mvn clean package -DskipTests -Pcloud

az spring-cloud app deploy \
  -n forex-service  \
  --jar-path target/forex-service-0.0.1-SNAPSHOT.jar
