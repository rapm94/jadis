# Makefile.maven contains the shared tasks for building Java applications. This file is
# included into the Makefile files which contain some Java sources which should be build

.PHONY: java_compile
java_compile:
	echo "Building JAR file ..."
	mvn $(MVN_ARGS) compile

.PHONY: java_verify
java_verify:
	echo "Building JAR file ..."
	mvn $(MVN_ARGS) verify

.PHONY: java_package
java_package:
	echo "Packaging project ..."
	mvn $(MVN_ARGS) package

java_install_root:
	echo "Installing root pom ..."
	mvn $(MVN_ARGS) install -f ../../pom.xml -N

.PHONY: java_install
java_install: java_install_root
	echo "Installing JAR files ..."
	mvn $(MVN_ARGS) install

.PHONY: java_clean
java_clean:
	echo "Cleaning Maven build ..."
	mvn clean

.PHONY: spotbugs
spotbugs:
	mvn $(MVN_ARGS) spotbugs:check