# FilterDemo
留言板demo：利用Java过滤器实现了字符集编码过滤器和简单的用户登录安全控制过滤器功能。  
1.字符集编码过滤器：  
&emsp;解决页面显示中文乱码问题，在servlet中采用读取配置文件参数的方式设置request时的编码为“UTF-8”,避免以后直接修改servlet类。  
2.用户登录安全控制过滤器：   
&emsp;利用session（用户已登录且会话未关闭时，浏览器一直记录用户的登陆状态）+JSP（添加了flag标志位）判断用户的登陆状态，sessionFilter通过在web.xml中的配置来拦截未登录状态下直接访问我们的敏感信息message.jsp。
