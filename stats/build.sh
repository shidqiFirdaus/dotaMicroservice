#!/usr/sbin/bash
cd $(pwd)/stats
./gradlew clean build -x test
