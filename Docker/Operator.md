## 基本操作

- 检索 : docker  search 		关键字
- 拉取 : docker  pull                  镜像名
- 列表 : docker  images            查看所有本地镜像
- 删除 : docker  rmi  image-id  删除本地镜像



## 容器操作

```shell
# 根据镜像启动容器
docker run --name  mySoftWare -d  softwareName : tag
    mySoftWare为自定义名字
	-d : 后台运行
	-p : 将主机的端口映射到主机的
    softwareName : 启动的镜像名字
    tag : 标签 比如说版本

# tomcat
docker run -d -p 8888:8080 tomcat
# 启动多个 tomcat (端口号) 
docker run -d -p 8889:8080 tocmat

#mysql
docker run -p 3306:3306 --name mysql01 -e MYSQL_ROOT_PASSWORD=1998zh2003 -d  mysql
docker exec -it mysql01 bash
ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY '1998zh2003';
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '1998zh2003';
SELECT plugin FROM mysql.user WHERE User = 'root';

```



```shell
# 查看正在运行的容器
docker ps  [-a : 所有的]
```



```shell
# 停止docker镜像
docker stop containerid
```



```shell
# 删除一个容器
docker rm containerid
```



```shell
# 查询容器日志
docker run -name container-name-id images-name eg:docker run -name myredis -d redis
```



```shell
# 进入docker容器
docker exec -it imageName bash
```

