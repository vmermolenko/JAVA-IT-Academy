<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Param1</h1>
${request.param1}

<h1>${pageContext.request.contextPath}</h1>




<jsp:useBean id="user" class="by.htp.web.model.User" scope="session"/>


<jsp:getProperty name="user" property="name" />
<jsp:setProperty name="user" property="name" value="Ольга"/>
<jsp:getProperty name="user" property="name" />

<h1>${pageContext.session.creationTime}</h1>
<h1>${pageContext.session.id}</h1>
<h1>${pageContext.session.lastAccessedTime}</h1>
<h1>${pageContext.session.maxInactiveInterval}</h1>


</body>
</html>