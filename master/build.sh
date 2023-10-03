#!/usr/sbin/bash
cd $(pwd)/master
./gradlew clean build -x test
