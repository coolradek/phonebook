FROM openjdk:11
ADD target/phonebook-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD java -jar phonebook-0.0.1-SNAPSHOT.jar --envname=prod
