<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tutorial Spring MVC</title>
    </head>
    <body>
        <h1>Hello Spring MVC Forms!</h1>
        
        <h2>Formulario HTML Básico 1</h2>        
        <form method="POST" action="basicForm">
            Id:<input type="text" name="id"/>
            Nombre:<input type="text" name="name"/>
            Contraseña:<input type="password" name="password"/>
            Email<input type="text" name="email"/>            
            <input type="submit" value="Enviar">
        </form>        
        <br />
        <hr>
        <br />
        <h2>Formulario HTML Básico 2</h2>        
        <form method="POST" action="basicForm2">
            Id:<input type="text" name="id"/>
            Nombre:<input type="text" name="name"/>
            Contraseña:<input type="password" name="password"/>
            Email<input type="text" name="email"/>            
            <input type="submit" value="Enviar">
        </form>        
        <br />
        <hr>
        <br />
        <h2>Formulario HTML Básico 3</h2>        
        <form method="POST" action="basicForm3">
            Id:<input type="text" name="id"/>
            Nombre:<input type="text" name="name"/>
            Contraseña:<input type="password" name="password"/>
            Email<input type="text" name="email"/>            
            <input type="submit" value="Enviar">
        </form>        
        <br />
        <hr>
        <br />
        
        
    </body>
</html>
