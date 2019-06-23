FROM kenacheam/azure-ffmpeg-ubuntu:0.0.1

VOLUME /tmp

COPY target/ase-demo-0.0.1-SNAPSHOT.jar app.jar

ADD init.sh init.sh

ENTRYPOINT ["./init.sh"]