<%@page import="com.Depart"%>
<%@page import="java.util.List"%>
<%@page import="com.model.BLManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		BLManager bl = new BLManager();
		List<Depart> dl = bl.SearchDepartlist();
		session.setAttribute("list", dl);
	%>
	<a href="ViewEmp.jsp">View Employee</a>
	<form action="SaveEmp" method="post">
		Add Employee:<input type="text" name="ename"> <br> Add
		Salary:<input type="text" name="sal"> <br> Name of
		Department <select name="dname">
			<option>Select Department </option>
			<c:forEach items="${sessionScope.list}" var="dl">
			<option>${dl.dname}</option>
			</c:forEach> <input type="submit" value="SaveEmp">
		</select>
	</form>

</body>
</html>