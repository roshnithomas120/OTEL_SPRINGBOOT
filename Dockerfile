FROM eclipse-temurin:17-jre

ADD build/libs/sample.jar /sample.jar
ADD build/agent/opentelemetry-javaagent.jar /opentelemetry-javaagent.jar

ENTRYPOINT java -javaagent:/opentelemetry-javaagent.jar \
                -jar /sample.jar