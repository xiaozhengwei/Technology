# CRUD与批量操作

## **CRUD**

### **Create**

支持自动生成文档 Id 和指定文档 Id 两种方式

#### **Create (自动生成ID)**

```shell
POST users/_doc
{
	"user":"Mike",
	"post_date":"2021-05-11T22:34:21",
  	"message":"try out Elasticsearch"
}
```

#### **Create (指定ID)**

```shell

# PUT users/_doc/1
# 重复创建会报错
PUT users/_doc/1?op_type=create
{
	"user":"Jack",
	"post_date":"2021-05-11T22:34:21",
	"message":"try out Elasticsearch"
}
```

### **GET**

根据 id 获取一个文档

```shell
GET users/_doc/1
```

```shell
# 返回结果
{
  "_index" : "users",
  "_type" : "_doc",
  "_id" : "1",
  "_version" : 1,
  "_seq_no" : 0,
  "_primary_term" : 1,
  "found" : true,
  "_source" : {
    "user" : "Jack",
    "post_date" : "2019-05-15T14:12:12",
    "message" : "trying out Elasticsearch"
  }
}
```

### **Index**

索引在 Elasticsearch 中的意思类似于创建

Index 和 Create 不同的地方：如果文档不存在，就创建新的文档。否则删除现有文档，再创建新的文档，版本信息 +1。

```
PUT users/_doc/1
{
  "user":"Mike"
}
```

### **Update**

Update 方法不会删除原来的文档，而是更新数据

```shell
POST users/_update/1/
{
	"doc":{
		"post_date":"2021-05-11T22:34:21",
  		"message":"try out Elasticsearch"
	}
}
```

### **Delete**

```shell
DELETE users/_doc/1
```

## **批量操作**

### Bulk API

支持再一次API调用中,对不同的索引进行操作

- Index
- Create
- Update
- Delete

可以在URI中指定Index,也可以在请求的Payload中进行

操作中单条操作失败,并不影响其他操作

返回结果包括了每一条操作的执行结果



```shell
POST _bulk
{ "index" : { "_index" : "test","_id" : "1" } }
{ "field1" : "value1" }
{ "delete" : { "_index" : "test", "_id" : "2" } }
{ "create" : { "_index" : "test", "_id" : "3" } }
{ "field1" : "value3" }
{ "update" : {"_id" : "1","_index" : "test"} }
{ "doc" : {"field2" : "value2"} }
```

### **批量读取**

批量操作,可以减少网络连接所产生的开销,提高性能

```
GET _mget
{
	"docs":[
		{
			"_index":"user",
			"_id":1
		},
		{
			"_index":"comment",
			"_id":1
		}
	]
}
```

## **批量查询**

```
POST users/_msearch
{}
{"query":{"match_all":{}},"from":0,"size":10}
{}
{"query":{"match_all":{}}}
{"index":"twitter2"}
{"query":{"match_all":{}}}
```



## 常见的错误返回

| 问题         | 原因                 |
| ------------ | -------------------- |
| 无法连接     | 网络故障或者集群挂了 |
| 连接无法关闭 | 网络故障或者节点出错 |
| 429          | 集群过于繁忙         |
| 4xx          | 请求体格式有误       |
| 500          | 集群内部错误         |

