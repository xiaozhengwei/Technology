```
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

```shell
server {
        listen       80;
        server_name  blog.utunan.com;
        rewrite ^(.*)$ https://$host$1 permanent;    
}

server {
    listen 443 ssl;
    server_name blog.utunan.com;
    root html;
    index index.html index.htm;
    ssl_certificate cert/6333498_blog.utunan.com.pem; 
    ssl_certificate_key cert/6333498_blog.utunan.com.key;
    ssl_session_timeout 5m;
    ssl_ciphers ECDHE-RSA-AES128-GCM-SHA256:ECDHE:ECDH:AES:HIGH:!NULL:!aNULL:!MD5:!ADH:!RC4;
    ssl_protocols TLSv1 TLSv1.1 TLSv1.2; 
    ssl_prefer_server_ciphers on;
    location / {
	proxy_pass http://ip:port;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_set_header X-Forwarded-Proto $scheme;
        proxy_set_header X-Forwarded-Port $server_port;
    }
}

```

