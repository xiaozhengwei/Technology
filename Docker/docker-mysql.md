## mysql

```shell
# 第一个 `mysql` 为容器的名字( 自行编辑 ), 第二个 `mysql` 为镜像/镜像ID( 自行编辑 )
docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=12345678 -d  `mysql`
docker exec -it mysql bash
ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY '12345678';
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '12345678';
FLUSH PRIVILEGES;
exit;
```