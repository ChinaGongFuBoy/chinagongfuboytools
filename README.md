## 这是GongFuBoy与小伙伴一起开始准备的一个开源项目

### 项目成员

1. GongFuBoy

    1. 邮箱：gongfuboychina@gmail.com
    2. GitHub：https://github.com/gongfuboy

2. yigangGitHubNew

    1. 邮箱：458898063@qq.com
    2. GitHub：https://github.com/yigangGitHubNew
    
### 项目结构

|主要项目   |概述|
|---|---|
|gongfuboy-uitls   |主要维护了一部分常见的工具类，bean工具之类的|
|springboot-mybatis|一个springboot集成mybatis的简单web工程demo|
|springboot-mybatis-mutil-datasource|springboot项目集成多数据源的使用|
|springboot-dubbo-client|springboot+dubbo入门初级|
|springboot-dubbo-server|springboot+dubbo入门初级|

### gongfuboy-uitls详解

1. gongfuboy-uitls包结构路径

    1. com.github.gongfuboy.uitls——根目录
    
        1. BeanUtils：POJO简单处理的工具简单处理工具
        2. ModelToMapUtils：model转为为相应的map工具
        3. RandemUtils：随机数工具
        4. Sha1Utils：sha1加密工具
        
    2. com.github.gongfuboy.uitls.annotation——存放整个工程注解类
    
        1. IgnoreField：在ModelToMapUtils的工具中，修饰Model的成员变量，被修饰的成员变量是不用转化成map

    3. com.github.gongfuboy.uitls.enums——存放整个工程枚举类
    
        1. TransformEnum：在BeanUtils作为bean的命名方式传递枚举
        
    4. com.github.gongfuboy.uitls.wechat——存放所有微信相关的工具类
    
        1. Constans：全文变量类
        2. openid路径：获取openid工具类