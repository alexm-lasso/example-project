.PHONY = build

build:
	javac MyProg.java Car.java

jar:
	jar cfe myprog.jar MyProg MyProg.class Car.class

run:
	java -jar myprog.jar

clean:
	rm *.class
	rm *.jar
