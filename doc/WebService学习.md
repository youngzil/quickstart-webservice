一、基于SOAP的WebService解决方案
1、直接使用JWS api 实现，不借助任何webservice框架
2、基于JAX-WS规范的webservice 开发框架：Apache Axis2 和Apache CXF

二、基于Rest的Web Service解决方案
其它基于JAX-RS实现的框架还有：Jersey（详见参考17），RestEasy，Apache Wink，Spring REST都可以完成REST的搭建和使用


Java中共有三种Web Service规范，分别是JAXM&SAAJ、JAX-WS(JAX-RPC)、JAX-RS。

JAX-WS(Java API ForXML-WebService)，JDK1.6自带的版本为JAX-WS2.1，其底层支持为JAXB。早期的基于SOAP的JAVA的Web服务规范JAX-RPC(Java API For XML-RemoteProcedure Call)目前已经被JAX-WS规范取代，JAX-WS是JAX-RPC的演进版本，但JAX-WS并不完全向后兼容JAX-RPC，二者最大的区别就是RPC/encoded样式的WSDL，JAX-WS已经不提供这种支持。


JAX-RS (JavaAPI for RESTful Web Services)是Rest技术的一个Java实现规范，这个新规范提供了基于REST的webservice开发的应用程序接口。它主要关注使用Java注释和普通旧式Java对象(POJO)实现RESTful服务。尽管总是可以使用servlet实现RESTful服务，但是以这种方式实现业务逻辑需要太多HTTP GET请求。




JAX-WS（Java6引进） 是SOAP协议的一个Java的实现规范，这个新规范是为了简化基于SOAP的Java开发。JAX-WS规范其实就是一组XMLweb services的JAVA API，JAX-WS允许开发者可以选择RPC-oriented或者message-oriented来实现自己的web services。通过使用 Java™ API for XMLWeb Services (JAX-WS) 技术设计和开发 Web 服务，可以带来很多好处，能简化 Web 服务的开发和部署，并能加速 Web 服务的开发。
在 JAX-WS中，一个远程调用可以转换为一个基于XML的协议，比如SOAP。在使用JAX-WS过程中，开发者不需要编写任何生成和处理SOAP消息的代码。JAX-WS的运行时实现会将这些API的调用转换成为对应的SOAP消息。


SOA目前已经成为了人人皆知的热点，SOA是面向服务的架构，SOA的重点在于服务的重用，即Service1+Service2+Service3，所有的组件都是“即插即用”的。SOA是由IBM提倡的架构，希望以“组装电脑”的方式开发软件。SOA涉及到两个重要的技术：

各种提供服务的组件(web service)
企业服务总线（Enterprise Service Bus ——> ESB ）（后面的博文介绍）

 Web Service可以做什么？
      Web Servcie最主要的优点是： 即跨语言，跨平台的不同系统之间的通信。 现在企业内部的很多系统集成，企业和企业之间的系统集成的问题。Web Service是主要的解决方案。（服务重用，降低开发成本，只开放自己愿意开放的服务）。
       目前webservice开发主要有以下两种开发模式：一是传统基于SOAP模式的webservice开发；二是基于rest模式的webservice开发。


一、基于SOAP的WebService解决方案

1 、SOAP协议
       简单对象访问协议是交换数据的一种协议规范，是一种轻量的、简单的、基于XML（标准通用标记语言下的一个子集）的协议，它被设计成在WEB上交换结构化的和固化的信息。

2、SOAP与JAX-WS的关系
       JAX-WS（Java6引进） 是SOAP协议的一个Java的实现规范，这个新规范是为了简化基于SOAP的Java开发。JAX-WS规范其实就是一组XMLweb services的JAVA API，JAX-WS允许开发者可以选择RPC-oriented或者message-oriented来实现自己的web services。通过使用 Java™ API for XMLWeb Services (JAX-WS) 技术设计和开发 Web 服务，可以带来很多好处，能简化 Web 服务的开发和部署，并能加速 Web 服务的开发。
        在 JAX-WS中，一个远程调用可以转换为一个基于XML的协议，比如SOAP。在使用JAX-WS过程中，开发者不需要编写任何生成和处理SOAP消息的代码。JAX-WS的运行时实现会将这些API的调用转换成为对应的SOAP消息。


二、基于Rest的Web Service解决方案

1、Rest
       REST（Representational State Transfer）是一种轻量级的Web Service架构风格，其实现和操作明显比基于SOAP和XML-RPC技术的webservice更为简洁，可以完全通过HTTP协议实现，还可以利用缓存Cache来提高响应速度，性能、效率和易用性上都优于SOAP协议。REST架构让人们真正理解我们的网络协议HTTP本来面貌，对资源的操作包括获取、创建、修改和删除资源的操作正好对应HTTP协议提供的GET、POST、PUT和DELETE方法，因此REST把HTTP对一个URL资源的操作限制在GET、POST、PUT和DELETE这四个之内。这种针对网络应用的设计和开发方式，可以降低开发的复杂性，提高系统的可伸缩性。

2、Rest和JAX-RS的关系
      JAX-RS (JavaAPI for RESTful Web Services)是Rest技术的一个Java实现规范，这个新规范提供了基于REST的webservice开发的应用程序接口。它主要关注使用Java注释和普通旧式Java对象(POJO)实现RESTful服务。尽管总是可以使用servlet实现RESTful服务，但是以这种方式实现业务逻辑需要太多HTTP GET请求。
       JAX-RS 隐藏所有 HTTP 并把servlet 绑定到 Java 类中的各个方法。注释还可以动态地提取 HTTP 请求中的信息，以及把应用程序生成的异常映射到 HTTP 响应码。由于这些原因，JAX-RS 是一种实现RESTful Java Web 服务的有效方法。
       JAX-RS提供了一些标注将一个资源类，一个POJO Java类，封装为Web资源。

       标注包括：
        @Path，标注资源类或者方法的相对路径
        @GET，@PUT，@POST，@DELETE，标注方法是HTTP请求的类型。
        @Produces，标注返回的MIME媒体类型
        @Consumes，标注可接受请求的MIME媒体类型
        @PathParam，@QueryParam，@HeaderParam，@CookieParam，@MatrixParam，@FormParam,分别标注方法的参数来自于HTTP请求的不同位置，例如        @PathParam来自于URL的路径，@QueryParam来自于URL的查询参数，@HeaderParam来自于HTTP请求的头信息，@CookieParam来自于HTTP请求的Cookie。





api接口、RPC、WebService分别解决什么问题

RPC：所谓的远程过程调用 (面向方法)
SOA：所谓的面向服务的架构(面向消息)
REST：所谓的 Representational state transfer (面向资源)
RPC 即远程过程调用, 很简单的概念, 像调用本地服务(方法)一样调用服务器的服务(方法).
通常的实现有 XML-RPC , JSON-RPC , 通信方式基本相同, 所不同的只是传输数据的格式.

REST 的三个要素是 唯一的资源标识, 简单的方法 (此处的方法是个抽象的概念), 一定的表达方式.
重要的特性：无状态
个人也比较喜欢REST,目前基本主流开放平台都是使用这个（淘宝开放平台／人人网／facebook...)

Web Service 已经是过时之物，平常基本使用甚少，建议不要在折腾它了


API只是一个实现方式，Web Service属于架构里的Web服务，RPC属于Web Service的一种使用方式。
Web Service：
从使用方式上，分为RPC，SOAP，REST；
从数据格式上，分为XML，JSON；
其中，RPC和SOAP的使用在减少，Restful架构占到了主导地位；XML格式的使用在减少，json等轻量级格式的使用在增多。



WebServiceCaller：WebService可视化界面调用客户端
https://github.com/iTanken/TestProjects/tree/master/WebServiceCaller
https://github.com/duqian42707/wscaller


webservice之实现一个基于JWS的webservice项目
https://blog.csdn.net/zolalad/article/details/31735791
https://blog.csdn.net/zolalad/article/details/25158995
https://blog.csdn.net/column/details/ws-learn.html






