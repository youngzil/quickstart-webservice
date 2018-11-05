http://cxf.apache.org/


开发服务器端的步骤，总共分为三步： 
（1）开发一个Web Service业务接口。 
该接口要用@WebService修饰 
（2）开发一个Web Service实现类 
实现类也需要用@WebService修改 
（3）使用EndPoint类的静态方法来发布WebService


使用CXF生成客户端代码 
首先，新建java项目，在命令行窗口中，切换到此java项目src目录。使用CXF的命令，wsdl2java+服务暴露地址?wsdl 
[注]生成客户端代码时，服务器端一定要运行，否则会保持，


客户端小结：

使用CXF开发Web Service客户端得步骤也分三步： 
（1）调用CXF提供的wsdl2java工具 
WSDL-Web Service Definition Language任何语言实现了Web Service，都需要提供、并暴露WSDL文档。 
（2）找到wsdl2java所生成类中，一个继承了Service的类。 
该类的实例可当成工厂使用。 
（3）调用Service子类的实例的getxxxPort方法,返回webService的代理。


参考
https://blog.csdn.net/jiuqiyuliang/article/details/48825577
https://my.oschina.net/u/246522/blog/151160

