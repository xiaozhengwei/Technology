# Nacos



## 创建目录

```shell
mkdir -p /home/nacos/init.d/ /home/nacos/logs;
touch /home/nacos/init.d/custom.properties;
```

## 修改配置文件

```
server.contextPath=/nacos
server.servlet.contextPath=/nacos
server.port=8848

spring.datasource.platform=mysql

db.num=1
db.url.0=jdbc:mysql://rm-2ze2z766loml0355klo.mysql.rds.aliyuncs.com:3306/nacos_config?characterEncoding=utf8&connectTimeout=1000&socketTimeout=3000&autoReconnect=true
db.user=superadmin
db.password=Zw199801190!


nacos.cmdb.dumpTaskInterval=3600
nacos.cmdb.eventTaskInterval=10
nacos.cmdb.labelTaskInterval=300
nacos.cmdb.loadDataAtStart=false

management.metrics.export.elastic.enabled=false

management.metrics.export.influx.enabled=false


server.tomcat.accesslog.enabled=true
server.tomcat.accesslog.pattern=%h %l %u %t "%r" %s %b %D %{User-Agent}i


nacos.security.ignore.urls=/,/**/*.css,/**/*.js,/**/*.html,/**/*.map,/**/*.svg,/**/*.png,/**/*.ico,/console-fe/public/**,/v1/auth/login,/v1/console/health/**,/v1/cs/**,/v1/ns/**,/v1/cmdb/**,/actuator/**,/v1/console/server/**
nacos.naming.distro.taskDispatchThreadCount=1
nacos.naming.distro.taskDispatchPeriod=200
nacos.naming.distro.batchSyncKeyCount=1000
nacos.naming.distro.initDataRatio=0.9
nacos.naming.distro.syncRetryDelay=5000
nacos.naming.data.warmup=true
nacos.naming.expireInstance=true
```

## 启动Nacos

```shell
docker run -d \
-e PREFER_HOST_MODE=180.76.100.50 \
-e MODE=standalone \
-e SPRING_DATASOURCE_PLATFORM=mysql \
-e MYSQL_SERVICE_HOST=rm-2ze2z766loml0355klo.mysql.rds.aliyuncs.com \
-e MYSQL_SERVICE_PORT=3306 \
-e MYSQL_SERVICE_USER=nacos \
-e MYSQL_SERVICE_PASSWORD=RFVTGBYHNUJM \
-e MYSQL_SERVICE_DB_NAME=nacos_config \
-e JVM_XMS=256m \
-e JVM_XMX=256m \
-v /home/nacos/logs:/home/nacos/logs \
-p 8848:8848 \
--name nacos \
--restart=always \
nacos/nacos-server;
```



```shell
docker run \
-e JVM_XMS=256m \
-e JVM_XMX=256m \
--env MODE=standalone \
--name nacos \
-d \
-p 8848:8848  \
-v /home/nacos/init.d/custom.properties:/home/nacos/init.d/custom.properties \
-v /home/nacos/logs:/home/nacos/logs \
nacos/nacos-server;
```

```shell
docker run \
-d \
--name nacos \
--restart=always  \
-p 8848:8848 \
-e MODE=standalone \
-e JVM_XMS=256m \
-e JVM_XMX=256m \
-e SPRING_DATASOURCE_PLATFORM=mysql \
-e MYSQL_SERVICE_HOST=rm-2ze2z766loml0355klo.mysql.rds.aliyuncs.com \
-e MYSQL_SERVICE_PORT=3306 \
-e MYSQL_SERVICE_DB_NAME=nacos_config \
-e MYSQL_SERVICE_USER=nacos \
-e MYSQL_SERVICE_PASSWORD=RFVTGBYHNUJM \
-e MYSQL_DATABASE_NUM=1 \
-v /home/nacos/init.d/custom.properties:/home/nacos/init.d/custom.properties \
-v /home/nacos/logs:/home/nacos/logs \
nacos/nacos-server;
```

