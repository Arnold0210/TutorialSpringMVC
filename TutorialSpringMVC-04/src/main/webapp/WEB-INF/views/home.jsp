<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tutorial Spring MVC</title>
    </head>
    <body>
        <h1>Hello Spring MVC Forms!</h1>  
        
        <form:form modelAttribute="user" action="result" method="POST">
            <form:label path="id">Id</form:label>
            <form:input path="id" />
            <form:label path="name">Name</form:label>
            <form:input path="name" />
            <form:label path="password">Password</form:label>
            <form:input path="password" type="password"/>
            <form:label path="email">Email</form:label>
            <form:input path="email" />
            <form:label path="birthDate">Birthdate</form:label>
            <form:input path="birthDate" />
            <form:label path="country" >Country</form:label>
            <form:select path="country">
                <form:options items="${countries}"></form:options>
            </form:select>
            
            <input type="submit" value="Enviar">
        </form:form>     

    </body>
</html>
