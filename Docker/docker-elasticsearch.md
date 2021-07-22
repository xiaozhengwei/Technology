## elasticsearch
```shell
docker run \
--name elasticsearch \
-p 9200:9200 \
-p 9300:9300 \
-e "discovery.type=single-node" \
-e ES_JAVA_OPTS="-Xms128m -Xmx128m" \
-v \
/home/elasticsearch/config/elasticsearch.yml:/usr/share/elasticsearch/config/elasticsearch.yml \
-v \
/home/elasticsearch/data:/usr/share/elasticsearch/data \
-v \
/home/elasticsearch/plugins:/usr/share/elasticsearch/plugins \
-d elasticsearch:7.12.0 ;
```

```shell
docker run \
--name kibana \
-e ELASTICSEARCH_HOSTS=http://180.76.100.50:9200 \
-p 5601:5601 \
-d kibana:7.12.0;
```

```shell
# 可选项
-e "ES_JAVA_OPTS=-Xms512m -Xmx512m"

# 其中一个错误的解决方案
sudo sysctl -w vm.max_map_count=262144
```

