 <%@page import="com.model.BLManager"%>
 <%@page import="com.pojo.Emp" %>
 <%@page import="com.pojo.Depart"%>
 <%@page import="java.util.List"%>
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="Emp.jsp">Add Employee</a>
	<%
		BLManager bl = new BLManager();
		List<Emp> l = bl.getAllEmp();
		session.setAttribute("list", l);
	%>
	<table border="2" width="80%">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Department Name</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<c:forEach items="${sessionScope.list}" var="l">
			<tr>
				<td>${l.eid}</td>
				<td>${l.ename}</td>
				<td>${l.sal}</td>
				<td>${l.depart.dname}</td>
				<td><a href="DeleteEmp?eid=${l.eid}"> Delete</a></td>
				<td><a href="UpdateEmp?eid=${l.eid}"> Update</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>