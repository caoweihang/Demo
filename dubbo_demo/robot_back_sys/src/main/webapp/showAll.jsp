<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Document</title>
</head>
<body>


    <h1>用户信息展示</h1>
    <c:forEach items="${requestScope.users}" var="user">
        ${user.id}
        ${user.name}
        ${user.age}
        ${user.bir}
        <br/>
    </c:forEach>

    <h1>商品信息展示</h1>
   ${requestScope.product}



</body>
</html>