#!/bin/bash

export JAVA_HOME='/usr/lib/jvm/java-8-openjdk-amd64/jre'
echo "JAVA_HOME = \'${JAVA_HOME}\'"

export PATH="${JAVA_HOME}/bin:$PATH"
