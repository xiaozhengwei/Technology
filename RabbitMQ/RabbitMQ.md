## RabbitMQ的核心概念

- **Message :消息**

  - 消息头

    - router-key ( 路由键 )

    - priority ( 相对于其他消息的优先权 )

    - delivery-mode ( 指出该消息可能需要持久性存储 )
    - ... 

  - 消息体 :不透明的

- **Publisher:发送者**



- **Exchange:交换器**

  四种类型 ( 默认是 :direct )

  - direct-直连-路由键和对列名完全匹配
  - fanout-广播
  - topic -可模式匹配
  - headers-与direct基本类似,但很复杂,使用较少

- **Queue:消息队列**

  

- **Binding:绑定**

  

- **Connection:网络连接**

  

- **Channel:信道**



- **Consumer:消费者**



- **Virtual Host:虚拟主机**



- **Broker:消息队列服务器实体**

  消息代理