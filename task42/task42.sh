#!/bin/bash
javac -sourcepath src src/Task42.java  -d out/

java -cp out/ Task42
