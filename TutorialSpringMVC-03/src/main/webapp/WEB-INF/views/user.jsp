<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User Data:</h1>        
        <p>ID:<c:out value="${user.id}"/></p>
        <p>Name:<c:out value="${user.name}"/></p>
        <p>Password:<c:out value="${user.password}"/></p>
        <p>Email:<c:out value="${user.email}"/></p>
    </body>
</html>
