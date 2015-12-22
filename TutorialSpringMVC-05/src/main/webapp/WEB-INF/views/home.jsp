<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tutorial Spring MVC</title>
        <style type="text/css">
            .formError { background-color: #FFC; }
        </style>
    </head>
    <body>
        <h1>Hello Spring MVC Forms!</h1>  

        <form:form modelAttribute="user" action="result" method="POST">
            <table>
                <tr>            
                    <td><form:label path="id">Id</form:label></td>
                    <td><form:input path="id" cssErrorClass="formError"/> </td>
                    <td><form:errors path="id"/></td>
                </tr>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name" cssErrorClass="formError"/></td>
                    <td><form:errors path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="email">Email</form:label></td>
                    <td><form:input path="email" cssErrorClass="formError" /></td>
                    <td><form:errors path="email"/></td>
                </tr>
                <tr>
                    <td><form:label path="password">Password</form:label></td>
                    <td><form:input path="password" type="password" cssErrorClass="formError"/></td>
                    <td><form:errors path="password"/></td>
                </tr>
                
                <tr>
                    <td> <form:label path="birthDate">Birthdate</form:label></td>
                    <td><form:input path="birthDate" cssErrorClass="formError"/></td>
                    <td><form:errors path="birthDate"/></td>
                </tr>
                <tr>
                    <td><form:label path="country" >Country</form:label></td>
                    <td>
                    <form:select path="country">
                            <form:options items="${countries}"></form:options>
                        </form:select>
                    </td>
                    <td><form:errors path="country"/></td>
                </tr>
            </table>
            <input type="submit" value="Enviar">
        </form:form>     

    </body>
</html>
