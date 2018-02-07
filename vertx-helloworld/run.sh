#!/bin/sh

mvn clean package
java -cp target/hello-1.0.0-SNAPSHOT-fat.jar com.github.jxfengzi.hello.MainTest
