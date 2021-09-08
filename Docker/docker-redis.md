# Redis

## 安装前准备

```shell
mkdir -p /home/redis/data /home/redis/conf
touch /home/redis/conf/redis.conf
```

## Redis.conf配置

下载地址 : http://download.redis.io/redis-stable/redis.conf

### 配置修改[允许外网访问]

```shell
bind 127.0.0.1 		#注释掉这部分，这是限制redis只能本地访问
protected-mode no 	#默认yes，开启保护模式，限制为本地访问
```

## 启动Redis 

```shell
# [密码为:12345678]
docker run --restart always -p 6379:6379 -v /home/redis/data:/data:rw -v /home/redis/conf/redis.conf:/etc/redis/redis.conf:ro --privileged=true --name redis -d redis redis-server /etc/redis/redis.conf --requirepass RFVTGBYHNUJM 
```

