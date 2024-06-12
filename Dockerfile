FROM tomcat:latest

RUN rm -rf /usr/local/tomcat/webapps/*

COPY target/A18__Devoir2-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/A18__Devoir2-1.0-SNAPSHOT.war

EXPOSE 8888
CMD ["catalina.sh", "run"]
