## tomcat

```shell
docker pull tomcat 

# 第一个 `tomcat` 为容器的名字( 自行编辑 ), 第二个 `tomcat` 为镜像/镜像ID( 自行编辑 )
docker run -d -p 8080:8080 --name tomcat `tomcat`
```