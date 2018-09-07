<%--
  Created by IntelliJ IDEA.
  User: DUSTY
  Date: 2018/9/7
  Time: 8:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--获取传递的flag参数--%>
<%
    String flag = request.getParameter("flag");
%>
<html>
  <head>
    <title>系统登陆</title>
    <link href="form.css" rel="stylesheet" type="text/css">
    <script type="text/javascript">
        var flag = '<%=flag %>';
        if ("1" == flag) {
            alert("请登录系统！");
        }
    </script>
  </head>
  <body>
      <form action="login.jsp" method="post" class="smart-green">
          <h1>系统登陆</h1>

          <label>
              <span>用户名：</span>
              <input id="username" type="text" name="username">
          </label>
          <span>&nbsp;</span>
          <label>
              <span>密码：</span>
              <input id="password" type="password" name="password">
          </label>
          <span>&nbsp;</span>
          <label>
              <input type="submit" class="button" value="登陆">
          </label>
      </form>
  </body>
</html>
