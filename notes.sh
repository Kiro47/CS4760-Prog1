#!/bin/sh

# Not actually running anything, just setting it as a bash script for syntax
exit 0

# Create Controller
./grailsw create-controller $CONTROLLER
| Created grails-app/controllers/${APP_NAME}/${CONTROLLER}.groovy
| Created src/test/groovy/${APP_NAME}/${CONTROLLER}Spec.groovy


# Unit tests
# Hits $PROJ/src/test/*
./grailsw test-app

