<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.ag.UserDao" %>
<jsp:useBean id="obj" class="com.ag.User"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>

<%
int i = UserDao.register(obj);
if(i > 0)
	out.print("You have successfully registered");
%>
</body>
</html>