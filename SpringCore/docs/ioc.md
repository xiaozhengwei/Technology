# 职责
- 依赖处理
  - 依赖查找
  - 依赖注入
- 生命周期管理
  - 容器
  - 托管的资源（Java Beans 或其他资源）
- 配置
  - 容器
  - 外部化配置
  - 托管的资源（Java Beans 或其他资源）

# 实现

- Java Se
  - Java Beans
  - Java ServiceLoader SPI
  - JNDI
- Java EE 
  - EJB
  - Servlet
- 开源
  - Apache Avalon
  - PicoContainer
  - Google Guice
  - Spring Framework


## 传统IOC实现
 - 依赖查找
 - 生命周期管理
 - 配置元信息
 - 事件
 - 自定义
 - 资源管理
 - 持久化
 
## 依赖查找和依赖注入的区别
依赖查找是主动或手动的依赖查找方式,通常需要依赖容器或者标准API实现,
依赖注入则是手动或自动依赖绑定的方式,无需依赖特定的容器和API
 
## Spring作为IOC容器有什么优势
典型的IOC管理,依赖查找和依赖注入
AOP抽象
事务抽象
事务机制
SPI扩展
强大的第三方整合
易测试性
更好的面向对象

## 依赖查找
按照Bean名称查找
- 实时查找
- 延迟查找
按照Bean类型查找
- 单个Bean对象
- 集合Bean对象
根据Bean名称+类型查找
根据Java注解查找
- 单个Bean对象
- 集合Bean对象

## 依赖注入
按照Bean名称查找
- 实时查找
- 延迟查找
按照Bean类型查找
- 单个Bean对象
- 集合Bean对象
根据Bean名称+类型查找
根据Java注解查找
- 单个Bean对象
- 集合Bean对象