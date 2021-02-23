FROM tomcat:8-jdk11

RUN curl -OL https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz && \
    tar xzvf apache-maven-3.6.3-bin.tar.gz && \
    mv apache-maven-3.6.3 /opt/ && \
    rm -f apache-maven-3.6.3-bin.tar.gz

RUN cp -r /usr/local/tomcat/webapps.dist/manager /usr/local/tomcat/webapps/manager

ENV MAVEN_HOME=/opt/apache-maven-3.6.3
ENV PATH=$PATH:$MAVEN_HOME/bin

ENV JPDA_ADDRESS=8000

CMD ["catalina.sh", "jpda", "run"]
