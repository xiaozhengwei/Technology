

# mysql索引 [原理俺不懂]

## 表结构

sql语句：

```sql
CREATE TABLE `mysql_index` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `a` varchar(10) DEFAULT NULL,
  `b` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `a` (`a`),
  KEY `b` (`b`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
```



![image-20210915164520548](.\images\mysqlindex001.png)


## 数据

![image-20210915164846734](.\images\mysqlindex003.png)

## 进行测试

### 分别在a,b字段上建立索引

![image-20210915164706757](.\images\mysqlindex002.png)


进行查询,sql如下：

```sql
EXPLAIN select *
from mysql_index
where a=2 and b=5
```



![image-20210915190928743](.\images\mysqlindex004.png)

可以看出没有走索引



### 仅建立ab联合索引

![image-20210915192437240](.\images\mysqlindex005.png)

再次执行SQL

```SQL
EXPLAIN select *
from mysql_index
where a=2 and b=5
```

执行结果如下,走了ab索引:

![image-20210915192604980](.\images\mysqlindex006.png)



### 仅建立ba联合索引

![image-20210915192437240](.\images\mysqlindex007.png)

再次执行SQL

```SQL
EXPLAIN select *
from mysql_index
where a=2 and b=5
```

执行结果如下,走了ba索引:

![image-20210915192437240](.\images\mysqlindex008.png)

### 建立a,b,ab索引

![image-20210915193614979](.\images\mysqlindex009.png)

执行结果如下,走了ab索引:

![image-20210915193614979](.\images\mysqlindex010.png)

