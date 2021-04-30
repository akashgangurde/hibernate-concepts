 <%@page import="com.model.BLManager"%>
<%@page import="com.pojo.Emp"%>
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
	<%
		BLManager bl = new BLManager();
		List<Depart> dl = bl.SearchDepartlist();
		session.setAttribute("list1", dl);
	%>
	<%
		Emp d = (Emp) session.getAttribute("list");
		String did = request.getParameter("did");
		System.out.print(did);
	%>

	<c:set var="d12" value="<%=d.getDepart()%>"/>
	<form action="UpdateEmp" method="post">
		<table align="center" border="20" bordercolor="black" width="80%">
			<tr>
				<th>Data</th>
				<th>Value</th>
			</tr>
			<tr>
				<td>id:-</td>
				<td><input type="text" name="eid" value="${list.eid}"></td>
			</tr>
			<tr>
				<td>Name:-</td>
				<td><input type="text" name="ename" value="${list.ename}"></td>
			</tr>
			<tr>
				<td>salary:-</td>
				<td><input type="text" name="sal" value="${list.sal}"></td>
			</tr>
			<tr>
				<td>Department Name:-</td>
				<td><select name="dname">
						<option>Select Department</option>
						<c:forEach items="${sessionScope.list1}" var="dl">
							<option <c:if test="${d12==list.depart.dname}">checked</c:if>>${dl.dname}</option>
						</c:forEach>
				</select></td>
			</tr>

			<tr>


				<td colspan="2" align="center"><input type="submit"
					value="Submit Department"></td>
			</tr>
		</table>
	</form>


</body>
</html>