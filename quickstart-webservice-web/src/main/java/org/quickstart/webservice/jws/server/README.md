使用jdk自带工具wsgen，生成webservice工具类，使用方法如下： 
打开控制台进入工程根目录下的build\classes目录，输入命名
wsgen -keep -cp . org.quickstart.webservice.jws.server.MyServiceImpl
將生成的类拷贝到jaxws子包下 

將应用部署到tomcat中，并启动web服务器，打开浏览器访问:
http://localhost:8080/quickstart-webservice-web/service/MyService?wsdl



路径在src/main/webapp/WEB-INF/sun-jaxws.xml中配置
http://localhost:8080/quickstart-webservice-web/service/MyService?wsdl



