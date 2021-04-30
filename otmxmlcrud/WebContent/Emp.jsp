<%@page import="com.pojo.Depart"%>
<%@page import="java.util.List"%>
<%@page import="com.model.BLManager"%>

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
	<%
		BLManager bl = new BLManager();
		List<Depart> dl = bl.SearchDepartlist();
		session.setAttribute("list", dl);
	%>
	<a href="ViewEmp.jsp" >View Employee</a>
	<form action="SaveEmp" method="post">
		Add Employee:<input type="text" name="ename"> <br> Add
		Salary:<input type="text" name="sal"> <br> Name of
		Department <select name="dname">
			<option>Select Department</option>
			<c:forEach items="${sessionScope.list}" var="dl">
			<option>${dl.dname}</option>
			</c:forEach>
		</select> <input type="submit" value="SaveEmp">

	</form>

</body>
</html>