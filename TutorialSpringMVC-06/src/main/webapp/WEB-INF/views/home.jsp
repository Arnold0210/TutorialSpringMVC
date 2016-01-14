<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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

        <h1><s:message code="Message.welcome" /></h1>
        <!-- JSTL -->
        <h1><fmt:message key="Message.welcome" /></h1>
        
        <br />
        <h2>Locale : ${pageContext.response.locale}</h2>
        
        <a href="?language=en">Cambiar idioma a Inglés</a><br />
        <a href="?language=es">Cambiar idioma a Español</a>  
    

</body>
</html>
