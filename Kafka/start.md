## 启动zookeeper

```
nohup bin/zookeeper-server-start.sh config/zookeeper.properties > zookeeper.out &
nohup bin/zookeeper-server-start.sh config/zookeeper1.properties > zookeeper1.out &
nohup bin/zookeeper-server-start.sh config/zookeeper2.properties > zookeeper2.out &
nohup bin/zookeeper-server-start.sh config/zookeeper3.properties > zookeeper3.out &
```



## 启动Broker

```
nohup bin/kafka-server-start.sh config/server.properties > kafka.out &
```



## 创建主题【topic-create】

```
# replication-factor  复制因子 必须小于等于broker个数
# partitions 分区个数
bin/kafka-topics.sh --create --topic topic-create --bootstrap-server kafka.utunan.com:9092 --replication-factor 1 --partitions 3 

bin/kafka-topics.sh --create --topic topic-create --bootstrap-server kafka.utunan.com:9092 --replica-assignment

```



## 查看分区副本细节【topic-create】

```
bin/kafka-topics.sh  --bootstrap-server kafka.utunan.com:9092 --describe --topic topic-create
```



## 查看主题列表

```
bin/kafka-topics.sh --list --bootstrap-server kafka.utunan.com:9092
```



## 订阅主题【topic-demo】

```
bin/kafka-console-consumer.sh --bootstrap-server kafka.utunan.com:9092 --topic topic-demo
```



## 发送消息到主题topic-demo

```
bin/kafka-console-producer.sh --broker-list  kafka.utunan.com:9092  --topic topic-demo
```



## 删除主题【topic-demo】

```
bin/kafka-topics.sh --bootstrap-server kafka.utunan.com:9092 --delete --topic topic-demo
```



