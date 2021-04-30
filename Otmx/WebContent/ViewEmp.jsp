<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.controller.*"%>
 <%@page import="com.*" %>
 <%@page import="com.model.BLManager" %>
 <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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