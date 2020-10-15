FROM registry.access.redhat.com/ubi8/ubi:latest

RUN yum install maven java-11-openjdk-devel git  -y

ENV JAVA_HOME=/etc/alternatives/java_sdk_11
EXPOSE 8888

RUN mkdir -p /usr/local/app
COPY demo-0.0.1-SNAPSHOT.jar /usr/local/app/
CMD ["java","-jar","/usr/local/app/demo-0.0.1-SNAPSHOT.jar"]

