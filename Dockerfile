FROM java:openjdk-8-jre-alpine
WORKDIR /home
COPY target/*.jar /home
ENV  TZ Asia/Shanghai
ENTRYPOINT java -jar *.jar 