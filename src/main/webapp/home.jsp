<%@page import="dto.CourseDto"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome: ${sessionScope.user.username}</h2>
	<%
	List<CourseDto> list = (List<CourseDto>) request.getAttribute("courses");
	%>
	<table>
		<%
		if (list != null) {
			for (CourseDto dto : list) {
		%>
		<tr>
			<td><%=dto.getCourse_code()%></td>
			<td><%=dto.getTitle()%></td>
		</tr>
		<%
		}
		}
		%>
	</table>

</body>
</html>