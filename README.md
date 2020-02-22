[toc]

#### Servlet 开发笔记

在JavaWeb开发中，Servlet是我入门以来碰到的第一个想要解决的问题。最初，看网上评论说，Servlet/jsp编程是最老的技术，没有学的必要。最好直接学习SSM、SSH、SpringBoot这些框架。然而，在学习到Spring框架的时候，发现没有理解Servlet，就无法深入理解Spring框架。于是，我决定，无论如何，我要把Servlet学习一遍。并且有自己的理解。关于Servlet相关笔记，将在陆续展开~



##### Servlet-mapping 通配符

在Servlet中映射到的URL可以使用通配符，通配符只能有两种固定的格式：

1. 拓展名方式
2. 以正斜杠（/）开头，以“/*”结尾



##### Servlet 容器对Servlet管理分析

Servlet的生命周期只有四个：

1. 构造器
2. init(ServletConfig servletConfig)
3. service()
4. destory()

构造器是在第一次请求Servlet的时候被调用，**只被调用一次**。

init(ServletConfig servletConfig)，**只被调用一次**，在创建好实例之后，立即被调用，用于初始化当前的Servlet.

通过ServletConfig,可以获取在web.xml文件中注册Servlet是注入的参数。



##### Servlet容器创建Servlet的时机

在注册Servlet是，load-on-startup参数决定着Servlet被加载的时机：

当值为负数时，表示在有客户请求时，才创建Servlet实例，这是一种懒加载模式。

当值为0或者正数是，表示当WEB应用被Servlet加载时，创建实例。这种方式可以在用户第一次访问时，加快服务器的响应速度。



**相关代码检验：**

在index.jsp中添加<a>标签如下：

```jsp
<a href="/lifecycle">/lifecycle</a>
```

在web.xml文件中，设置映射如下：

```xml
<servlet-mapping>
	<servlet-name>lifeCycleServlet</servlet-name>  
	<url-pattern>/lifecycle</url-pattern>
</servlet-mapping>
```

便可以检验ServletConfig、加载时期、生命周期等性质