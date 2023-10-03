#!/usr/bin/bash
./master/build.sh
./stats/build.sh
docker compose up -d
