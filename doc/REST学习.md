REST是设计风格而不是标准

REST 是一种软件架构模式，只是一种风格，不是像SOAP 那样本身承载着一种消息协议，也可以叫做REST 是基于HTTP协议的软件架构。

REST 中重要的两个概念就是资源定位和资源操作，而HTTP 协议恰好完整的提供了这两个要点，HTTP 协议中的URI 可以完成资源定位，GET、POST、OPTION等方法可以完成资源操作，因此REST 完全依赖HTTP 协议就可以完成Web 服务，而不像SOAP 协议那样只利用HTTP 的传输特性，定位与操作由SOAP 协议自身完成，也正是由于SOAP 消息的存在，使得SOAP 笨重。你也可以说REST 充分利用了HTTP 协议的特性，而不是像SOAP 那样只利用了其传输这一特性（事实上大多数人提到HTTP 协议就只会想到它能用于数据传输）。



目前在三种主流的Web服务实现方案中，因为REST模式与复杂的SOAP和XML-RPC相比更加简洁，越来越多的web服务开始采用REST风格设计和实现。例如，Amazon.com提供接近REST风格的Web服务运行图书查询；雅虎提供的Web服务也是REST风格的。


需要注意的是，REST是设计风格而不是标准。REST通常基于使用HTTP，URI，和XML以及HTML这些现有的广泛流行的协议和标准。
资源是由URI来指定。
对资源的操作包括获取、创建、修改和删除资源，这些操作正好对应HTTP协议提供的GET、POST、PUT和DELETE方法。
通过操作资源的表现形式来操作资源。
资源的表现形式则是XML或者HTML，取决于读者是机器还是人，是消费web服务的客户软件还是web浏览器。当然也可以是任何其他的格式。


REST架构风格最重要的架构约束有6个：
1、客户-服务器（Client-Server）
通信只能由客户端单方面发起，表现为请求-响应的形式。
2、无状态（Stateless）
通信的会话状态（Session State）应该全部由客户端负责维护。
3、缓存（Cache）
响应内容可以在通信链的某处被缓存，以改善网络效率。
4、统一接口（Uniform Interface）
通信链的组件之间通过统一的接口相互通信，以提高交互的可见性。
5、分层系统（Layered System）
通过限制组件的行为（即每个组件只能“看到”与其交互的紧邻层），将架构分解为若干等级的层。
6、按需代码（Code-On-Demand，可选）
支持通过下载并执行一些代码（例如Java Applet、Flash或JavaScript），对客户端的功能进行扩展。



看Url就知道要什么
看http method就知道干什么
看http status code就知道结果如何





参考
http://www.infoq.com/cn/articles/understanding-restful-style
https://www.jianshu.com/p/84568e364ee8
http://www.ruanyifeng.com/blog/2011/09/restful.html
https://www.oschina.net/translate/best-practices-for-a-pragmatic-restful-api

https://www.restapitutorial.com/
https://www.restapitutorial.com/lessons/whatisrest.html
https://github.com/tfredrich/RestApiTutorial.com

https://www.codecademy.com/articles/what-is-rest


论文地址：Architectural Styles and the Design of Network-based Software Architectures
https://www.ics.uci.edu/~fielding/pubs/dissertation/top.htm
REST章节：Fielding Dissertation: CHAPTER 5: Representational State Transfer (REST)
https://www.ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm



