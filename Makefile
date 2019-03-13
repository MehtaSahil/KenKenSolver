JC = javac
# JFLAGS =

default:
	$(JC) src/*.java

clean:
	rm src/*.class
