0. 项目中用到的技术
    
    - Maven
    - Dubbo
    - Spring
    - Java
    - IDE(Eclipse)

1. 项目基本描述：

    dubbo-demo是使用dubbo框架搭建的hello world的程序，在这个项目中一共分为三个项目：

    服务-provider
    dubbo-user-api: 这个项目是用作服务中接口的定义;
    dubbo-user-impl: 这个项目是用作api中接口的实现;
    
    消费者-consumer
    dubbo-user-consumer: 这个项目是服务的消费者

2. 项目如何启动

    第一步：下载开源软件[zookeeper](http://zookeeper.apache.org/)
    
    第二步：解压zookeeper，一般来讲，对于开源项目，解压完后一定要**观察一下开源项目的目录结构**
    
    第三步：找到**conf**目录，将原来zoo_sample.cfg文件copy一份，将文件名改为**zoo.cfg**
    
    第四步：将改好文件名的**zoo.cfg**文件中的**dataDir**属性对应的值修改一下换到目录`../data`就好了
    
    第五步：启动zookeeper
    
    - zookeeper的常用命令
        - `zkServer.cmd`:启动zookeeper的命令
        - `zkCli.cmd`：zookeeper客户端
      
    第六步：启动项目`dubbo-user-impl`
    
    - 启动方式
        - 直接通过**IDE**运行
        - 使用**Maven**将项目打成jar文件，当然通过Java自带的`jar`命令也可以完成，然后使用`java -jar *.jar`命令来完成启动
        
    第七步：启动consumer
    
    - 启动方式：同第六步
    
3. 接下来要做的事情

    - 将共同的部分提到父项目中，然后让子项目从父项目中继承，顺便复习一下Maven(**完成**)
    - 为provider项目添加数据库连接操作，通过开源框架`dubbo`实现对表`t_user`的CRUD操作，并测试（**完成**）
    - 为consumer项目添加页面，实现CRUD操作
    - session共享问题如何解决
    - 数据库相关问题
    
4. Dubbo框架的几种启动方式
    - 第一， 将`Dubbo`做成WEB工程，在`web.xml`文件中，启动spring
    - 第二， 自建main方法来运行，这种方式适合本地调试(**本例中使用**)
    - 第三， 使用dubbo框架提供的main方法来运行(**推荐使用**)
    
5. [网站架构发展](https://mp.weixin.qq.com/s/-P9czn_8Ssx30M_S8A71Ug)

6. 经常阅读自己写过的代码，**refactoring**

7. 你假笨分享
    
    - [SOFA框架](https://github.com/alipay/sofa-boot)
    - 类加载死锁， finalreference堆积，对外内存（不要-Xmx控制的内存），YGC(不断拉长)
    - `jstack -m`,一般不推荐使用，但是在特殊的情况下可以使用。
    - 数据结构，读Java源码(openJDK)
    - `jmap -histo`
    - `finalize`方法什么时候被调用
    
        - GC发生并找出Finalizer对象
        - 判断Finalizer对象引用的对象是否没有别的引用了
        - 将引用已死对象的Finalizer对象丢到一个Finilizer的ReferenceQueue里面
        - 在GC结束之后，FinalizerThread线程被唤醒并从ReferenceQueue里取出来间接调用finalize方法
    
    - `FinalReference`对象及引用对象什么时候被回收
    
        - 执行完finalize方法后会剥离Finalizer对象和被引用对象的关系
        - 执行完了finilize方法的Finilizer对象及被引用的对象会在下个GC周期里被回收
        - 如果finalize方法因为队列过长，不得不等待之前的对象执行完才执行，因为肯能存在跨多个GC周期

  8. [微服务](https://martinfowler.com/articles/microservices.html)
        - [微服务技术栈](https://mp.weixin.qq.com/s?__biz=MzI4NDY5Mjc1Mg==&mid=2247486219&idx=1&sn=79cf09cdd3cb40be4f3c80ba0bfd0ece&chksm=ebf6d374dc815a6274961f349f22afe4525572b7d3d599a44dabc63bfa06453c619da225185c&scene=27#wechat_redirect)
        - [放弃 Dubbo，选择 Spring Cloud 微服务架构实践与经验总结](http://mp.weixin.qq.com/s?__biz=MjM5NzM0MjcyMQ==&mid=2650075866&idx=1&sn=e0a92ea2255ceb11be2f2516385ec99b&chksm=bedb29b489aca0a2e8a673d5f1c3be5adb3800972bd5a0632b372efcd5e93bd8f1192ba8366b&mpshare=1&scene=2&srcid=1116eyjFJIU9llK1u3GYwYH0&from=timeline#rd)
