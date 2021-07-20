## Redis

```shell
docker run -p 6379:6379 -v /home/redis/data:/data:rw -v /home/redis/conf/redis.conf:/etc/redis/redis.conf:ro --privileged=true --name redis -d redis redis-server /etc/redis/redis.conf  --requirepass RFVTGBYHNUJM
```