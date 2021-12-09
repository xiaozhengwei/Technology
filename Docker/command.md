## 基本操作

- 检索 : docker  search 		关键字
- 拉取 : docker  pull                  镜像名
- 列表 : docker  images            查看所有本地镜像
- 删除 : docker  rmi  `image_id`  删除本地镜像



## 容器操作

```shell
# 根据镜像启动容器
docker run --name  mySoftWare -d  softwareName:tag --restart=always
    mySoftWare为自定义名字
	-d : 后台运行
	-p : 将主机的端口映射到主机的
    softwareName : 启动的镜像名字
    tag : 标签 比如说版本
    --restart=always : docker服务器重启,容器也跟着一起重启
```



```shell
# 查看正在运行的容器
docker ps  [-a : 所有的]
```



```shell
# 启动已经终止的容器
docker start `containerid`
```



```shell
# 停止一个容器
docker stop `containerid`
```



```shell
# 删除一个容器
docker rm `containerid`
```



```shell
# 随着docke服务的重启,自动重启(对于已经运行的容器)
docker update --restart=always 
```



```shell
# 查询容器日志
docker logs `containerid`
```



```shell
# 进入docker容器
docker exec -it f4fa2bfbbfcf bash
```

