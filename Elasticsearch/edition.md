# elasticsearch版本

## 0.4 : 2010年2月第一次发布


## 1.0 : 2014年1月


## 2.0 : 2015年10月

## 5.0 : 2016年10月

- Lucene 6.x 性能提升,默认打分机制从TF-IDF 改为BM25

- 支持Ingest节点/Painless Scripting /Completion suggested 支持 / 原生的Java Rest 客户端
- Type标记成deprecated,支持了Keyword的类型
- 性能优化
  - 内部引擎移除了避免同意文档并发更新的竞争锁,带来15%-20%的性能提升
  - Instant aggregation,支持分片上聚合的缓存
  - 新增了Profile API

## 6.0 : 2017年10月

- Lucene 7.x
- 新功能
  - 跨集群复制(CCR)
  - 索引生命周期管理
  - SQL的支持
- 更友好的升级及数据迁移
  - 在主要本本之间的迁移更为简化,体验升级
  - 全新的基于操作的数据复制框架,可加快恢复数据
- 性能优化
  - 有效存储稀疏字段的新方法,降低了存储成本
  - 在索引时进行排序,可加快排序的查询性能


## 7.0 : 2010年4月

- Lucene 8.0
- 重大改进 - 正式废除单个索引下多Type的支持
- 7.1开始,Security功能`免费试用
- ECK - Elasticsearch Operator on Kubernetes
- 新功能
  - New Cluster coordination
  - Feature-Complete High Level Rest Client
  - Script Score Query
- 性能优化
  - 默认的Primary Shard 数从5改为1,避免Over Sharding
  - 性能优化,更快的Top K