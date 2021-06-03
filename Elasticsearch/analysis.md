# 分词

## Analysis与Analyzer

Analysis 文本分析是把全文本转换一系列单词(term/token)的过程,也叫分词

Analysis是通过Analyzer来实现的

- 可使用Elasticsearch内置的分析器
- 按需定制分析器

除了在数据写入时转换词条,匹配Query语句时候也需要用相同的分析器对查询语句进行分析





## 使用_analyze API

### Standard Analyzer

```shell
GET _analyze
{
  "analyzer": "standard",
  "text": "The 2 QUICK Brown-Foxes jumped over the lazy dog's bone."
}
```

## Simple Analyzer

```
GET _analyze
{
  "analyzer": "simple",
  "text": "The 2 QUICK Brown-Foxes jumped over the lazy dog's bone."
}
```

## Whitespace Analyzer

```shell
GET _analyze
{
  "analyzer": "whitespace",
  "text": "The 2 QUICK Brown-Foxes jumped over the lazy dog's bone."
}
```

## Stop Analyzer

```
GET _analyze
{
  "analyzer": "stop",
  "text": "The 2 QUICK Brown-Foxes jumped over the lazy dog's bone."
}
```

