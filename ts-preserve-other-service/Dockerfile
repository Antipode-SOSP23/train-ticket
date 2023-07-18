FROM eclipse-temurin:8-jre

RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

ADD ./target/ts-preserve-other-service-1.0.jar /app/
ENV JAVA_OPTS=""
CMD java $JAVA_OPTS -jar /app/ts-preserve-other-service-1.0.jar

EXPOSE 14569