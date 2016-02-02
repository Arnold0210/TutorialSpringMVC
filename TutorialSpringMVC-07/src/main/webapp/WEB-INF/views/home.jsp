<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tutorial Spring MVC</title>
    </head>
    <body>

        <h1><s:message code="Message.welcome" /></h1>
        <h2><s:message code="Message.uploadfile" /></h2>

        <form method="POST" action="uploadFile" enctype="multipart/form-data">
            File to upload: <input type="file" name="file"><br />
            <input type="submit" value="Upload"> Press here to upload the file!
        </form>

    </body>
</html>
