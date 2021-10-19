## 启动zookeeper

```
nohup bin/zookeeper-server-start.sh config/zookeeper.properties > zookeeper.out &
```



## 启动Broker

```
nohup bin/kafka-server-start.sh config/server.properties > kafka.out &
```



## 创建主题

```
# replication-factor  复制因子 必须小于等于broker个数
# partitions 分区个数
bin/kafka-topics.sh --create --topic topic2-demo --replication-factor 1 --partitions 2 --bootstrap-server kafka.utunan.com:9092
```



## 查看主题列表

```
bin/kafka-topics.sh --list --bootstrap-server kafka.utunan.com:9092
```



## 订阅主题topic-demo

```
bin/kafka-console-consumer.sh --bootstrap-server kafka.utunan.com:9092 --topic topic-demo
```



## 发送消息到主题topic-demo

```
bin/kafka-console-producer.sh --broker-list  kafka.utunan.com:9092  --topic topic-demo
```

