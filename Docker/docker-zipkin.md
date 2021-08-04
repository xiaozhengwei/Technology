# ZipKin

```shell
docker pull openzipkin/zipkin

# 第一个 `tomcat` 为容器的名字( 自行编辑 ), 第二个 `tomcat` 为镜像/镜像ID( 自行编辑 )
docker run -d --restart always -p 9411:9411 --name zipkin openzipkin/zipkin;
```

