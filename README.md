本项目借鉴了[mall](https://github.com/macrozheng/mall)开源项目的后端系统业务内容，[mall-admin-web](https://github.com/macrozheng/mall-admin-web)开源项目前端业务内容
将mall系统改造为采用spring
cloud全家桶进行微服务化部署的项目，搭建方式借鉴了[paascloud](https://github.com/paascloud/paascloud-master)

# spring cloud 版本mall

--mall-cloud <br/>----mall-disconfig : 配置中心
（访问地址：127.0.0.1:9001;127.0.0.1:9002） <br/>----mall-eurake ：
服务注册发现中心 <br/>----mall-common <br/>--------mall-common-core
:mall项目通用配置项（swagger2配置内容,） <br/>----mall-provide ：
mall系统业务项目 <br/> --------mall-provider-user-api ：
mall系统业务后端服务API项目，其中包含基于feign的RPC远程调用配置、熔断机制配置;基于swagger2的API文档自动生成配置
<br/> --------mall-provider-user ： mall-service-api 实现
(访问地址：127.0.0.1:8010/api/XXXXX;127.0.0.1:8011/api/XXXXX) <br/>
<br/>--------mall-web ： mall系统业务前端项目






# 参考资料

>## spring cloud
>>#### [1] *eurake相关知识* <br/>
&emsp;&emsp;[史上最简单的 SpringCloud 教程 | 第一篇： 服务的注册与发现Eureka(Finchley版本)](https://blog.csdn.net/forezp/article/details/81040925)
:利用 idea构建基本的Eureka中心的服务端、客户端<br/>

>>#### [2] *Feign相关知识* 
<br/>&emsp;&emsp;
[Spring Cloud 之 Feign 调用实例及异常分析](https://www.jianshu.com/p/2745cc19a6da)
<br/>&emsp;&emsp;&emsp;
[史上最简单的SpringCloud教程 | 第三篇: 服务消费者（Feign）(Finchley版本)](https://blog.csdn.net/forezp/article/details/81040965)
<br/>&emsp;&emsp;
[深入理解Feign之源码解析](https://blog.csdn.net/forezp/article/details/73480304)
\:分析Feign源码的运行流程

>>#### [3] *Hystrix相关知识* <br/>
&emsp;
&emsp;[史上最简单的SpringCloud教程 | 第四篇:断路器（Hystrix）(Finchley版本)](https://blog.csdn.net/forezp/article/details/81040990):讲解采用ribbon,feign等组件集成hystrix的方式





>## spring boot
>>#### [1] *spring boot 中配置logback方法*
&emsp; &emsp;
[Spring Boot 日志配置(超详细)](https://blog.csdn.net/inke88/article/details/75007649)
\: 介绍spring boot配置日志方式 <br/>

>>#### [2] *spring boot 中@configurationProperties使用方法*
 &emsp;&emsp;[@ConfigurationProperties 注解使用方法+源码分析](https://blog.csdn.net/u011649691/article/details/79491674)<br/>
 &emsp;&emsp;[Spring Boot中使用 @ConfigurationProperties 注解](https://www.cnblogs.com/suneryong/p/7221131.html)

&emsp;&emsp;[Spring Boot中使用Swagger2构建强大的RESTful API文档](https://www.cnblogs.com/xiaohanghang/p/6018654.html)
<br/>
&emsp;&emsp;[SpringBoot资源文件的存放位置设置](https://blog.csdn.net/justry_deng/article/details/81406752)
\:主要介绍spring boot 加载静态资源文件时的加载顺序，以及自定义静态文件路径的方式
<br/>
&emsp;&emsp;[Spring中Configuration的理解](https://blog.csdn.net/koflance/article/details/59304090)
\:讲解@configuration注解的使用方式 <br/>



