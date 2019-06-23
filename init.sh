#!/bin/bash

echo "==== ASE Demo APP====="
echo "Starting ssh server"

service ssh start

java -Djava.security.egd=file:/dev/./urandom -jar /app.jar