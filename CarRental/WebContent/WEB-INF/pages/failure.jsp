<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Не успешно</title>
</head>
<body>

<h1>Недостаточно средств</h1>
<br />
<h2><c:out value="${ result }" /></h2>


<a href="index.jsp">На главную</a>


</body>
</html>