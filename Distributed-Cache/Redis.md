

工作模式

- 多个client连接Server
- 发送命令给Server
- Server返回结果给Client

 



20000个client连接一个Server，同时Client也会不定时的发哦送请求给Server，Server收到后及时回复结果



- 每一个Client使用一个线程处理

- 线程池管理
- Reactor模式