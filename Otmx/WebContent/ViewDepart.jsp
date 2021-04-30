<%@page import="com.Depart"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.model.BLManager"%>
<%@page import="com.*" %>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">Add Departments</a>
	<%
		BLManager bl = new BLManager();
		List<Depart> l = bl.getAllDepart();
		session.setAttribute("list", l);
	%>
	<table border="2" width="80%">
		<tr>
			<th>ID</th>
			<th>Department Name</th>
			<th>Delete</th>
			<th>Update</th>
			
		</tr>
		<c:forEach items="${sessionScope.list}" var="l">
			<tr>
				<td>${l.did}</td>
				<td>${l.dname}</td>
				<td><a href="DeleteDepart?did=${l.did}"> Delete </a></td>
				<td><a href="UpdateDepart?did=${l.did}"> Update </a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>