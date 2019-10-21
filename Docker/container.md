## tomcat

```shell
docker pull tomcat 

# 第一个 `tomcat` 为容器的名字( 自行编辑 ), 第二个 `tomcat` 为镜像/镜像ID( 自行编辑 )
docker run -d -p 8888:8080 --name tomcat `tomcat`
```



## mysql

```shell
# 第一个 `mysql` 为容器的名字( 自行编辑 ), 第二个 `mysql` 为镜像/镜像ID( 自行编辑 )
docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=12345678 -d  `mysql`
docker exec -it mysql bash
ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY '12345678';
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '12345678';
FLUSH PRIVILEGES;
exit;
```



## RabbitMQ

```shell
# 第一个 `rabbitmq` 为容器的名字( 自行编辑 ), 第二个 `rabbitmq` 为镜像/镜像ID( 自行编辑 )
docker pull rabbitmq:management 
docker run -p 5672:5672 -p 15672:15672 --name rabbitmq  `rabbitmq`
```



## ElasticSearch

```shell
docker pull elasticsearch:6.8.3

# 第一个 `elasticsearch` 为容器的名字( 自行编辑 ), 第二个 `elasticsearch` 为镜像/镜像ID( 自行编辑 )
docker run -d -p 9200:9200 -p 9300:9300 --name elasticsearch  `elasticsearch`

# 可选项
# -e "ES_JAVA_OPTS=-Xms512m -Xmx512m"

# 其中一个错误的解决方案
# sudo sysctl -w vm.max_map_count=262144
```