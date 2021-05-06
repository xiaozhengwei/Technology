## RabbitMQ

```shell
# 第一个 `rabbitmq` 为容器的名字( 自行编辑 ), 第二个 `rabbitmq` 为镜像/镜像ID( 自行编辑 )
docker pull rabbitmq:management 
docker run -p 5672:5672 -p 15672:15672 --name rabbitmq  `rabbitmq`
```