# Nginx

```
docker run \
-p 80:80 \
--name nginx \
--restart=always \
-v /home/nginx/conf/cert:/etc/nginx/cert \
-v /home/nginx/conf/nginx.conf:/etc/nginx/nginx.conf \
-v /home/nginx/conf/conf.d:/etc/nginx/conf.d \
-v /home/nginx/html:/usr/share/nginx/html \
-v /home/nginx/logs:/var/log/nginx \
-d \
nginx
```

