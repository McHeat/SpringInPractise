<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/11/9
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
新的首页~~~~~~~~~~~~~~
<hr>
<form method="post" enctype="multipart/form-data" action="<%=request.getContextPath()%>/uploadImgPart">
    <input name="pic" type="file" accept="image/jpeg, image/png, image/gif"/>

    <input type="submit" name="submit"/>
</form>
<img src="<%=request.getParameter("filePath")%>"  alt="上传图片"/>
</body>
</html>
