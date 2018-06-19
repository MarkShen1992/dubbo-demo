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
