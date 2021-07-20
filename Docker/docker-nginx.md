# 安装Nginx

## 创建本地磁盘挂载的目录

```shell
mkdir -p /home/nginx /home/nginx/logs /home/nginx/html /home/nginx/conf/conf.d;
touch /home/nginx/conf/nginx.conf;
# 目前我按照下方的Nginx通用配置进行配置的.
vi /home/nginx/conf/nginx.conf; 
```

## 创建容器

```shell
docker run -p 80:80 -p 443:443 --name nginx --restart=always -v /home/nginx/conf/cert:/etc/nginx/cert -v /home/nginx/conf/nginx.conf:/etc/nginx/nginx.conf -v /home/nginx/conf/conf.d:/etc/nginx/conf.d -v /home/nginx/html:/usr/share/nginx/html -v /home/nginx/logs:/var/log/nginx -d nginx;
```



# Nginx 通用配置

```shell
worker_processes  1;

events {
    worker_connections  1024;
}

http {

    include       mime.types;

    default_type  application/octet-stream;

    sendfile        on;

    keepalive_timeout  65;

    server {

        listen       80;

        server_name  localhost;

        location / {
            root   /usr/share/nginx/html;
            index  index.html index.htm;
        }

        error_page   500 502 503 504  /50x.html;

        location = /50x.html {
            root   html;
        }

    }

   include conf.d/*.conf;

}

```

