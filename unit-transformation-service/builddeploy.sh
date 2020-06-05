mvn clean package -DskipTests -Pcloud

az spring-cloud app deploy \
  -n unit-transformation-service  \
  --jar-path target/unit-transformation-service-0.0.1-SNAPSHOT.jar
