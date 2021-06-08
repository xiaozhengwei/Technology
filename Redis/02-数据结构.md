### Redis的数据结构



#### String

```shell
redis里的String指的并不是字符串，它其实表示的是一种最简单的数据结构，即一个key只能对应一个value。这里的key和value都是byte数组，只不过key一般是由一个字符串转换成的byte数组，value则根据实际需要而定。
```

#### List

```shell
List这种数据结构，其实表示一个key可以对应多个value，且value之间是有先后顺序的，value值可以重复。
```

#### Hash

```shell
Set这种数据结构，表示一个key可以对应多个value，且value之间是没有先后顺序的，value值也不可以重复。
```

#### Set

```shell
Hash这种数据结构，表示一个key可以对应多个key-value对，此时这些key-value对之间的先后顺序一般意义不大，这是一个按照名称语义来访问的数据结构，而非位置语义。
```

#### Sorted Set

```shell
Sorted Set这种数据结构，表示一个key可以对应多个value，value之间是有大小排序的，value值不可以重复。每个value都和一个浮点数相关联，该浮点数叫score。元素排序规则是：先按score排序，再按value排序。
```

