FROM tomcat:8.0.36-jre8
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/log4japp.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
