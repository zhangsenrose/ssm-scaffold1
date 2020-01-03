# ssm-scaffold1
整体架构就是普通的三层 dao service controller
src/mian/resources 目录下包含SSM框架需要的配置文件，
spring目录：
        包括applicationContext.xml,spring-mvc.xml,spring-datesource.xml配置文件，
        以后可以拓展spring-task.xml,cache.xml等配置
mybatis目录：
        该目录包含mybatis的配置文件 mybatis-config.xml 
        mapper文件夹下存放的是mapper.xml文件，便于管理

webapp文件夹存在说明是一个web项目
    WEB-INF目录：
        jsp文件夹，存放jsp文件
        static 存放静态资源文件，js, css, images, 等...