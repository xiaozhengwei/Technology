## 简易安装

### 更新软件源

```shell
sudo apt-get update
```

### 下载Redis

```shell
sudo apt-get install redis-server 
```

### 修改配置文件

```shell
vi /etc/redis/redis.conf
```

#### 修改访问地址

```shell
将 band 127.0.0.1 ::1 注释掉
# band 127.0.0.1 ::1
```

#### 修改后台启动

```shell
将 daemonize no 变为(新版本redis一般默认就是yes不用更改):
daemonize yes
```

#### 关闭后台保护

```shell
将 protected-mode yes 变为
protected-mode no
```

#### 设置密码

```shell
将 # requirepass foobared 注释接触
requirepass '你的密码'
例如 :
requirepass '12345678'
```

### 启动redis

```shell
redis-server  /etc/redis/redis.conf
```



## 使用安装包安装



<span style=“color=‘red’">你好</span>

