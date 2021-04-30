<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateDepart" method="post">
	<table align="center" border="20" bordercolor="black" width="80%">
			<tr>
				<th>Data</th>
				<th>Value</th>
			</tr>
			<tr>
				<td>id:-</td>
				<td><input type="text" name="did" value="${list.did}"></td>
			</tr>
			<tr>
				<td>Name:-</td>
				<td><input type="text" name="dname" value="${list.dname}"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Submit Department"></td>
			</tr>
		</table>
</form>
</body>
</html>