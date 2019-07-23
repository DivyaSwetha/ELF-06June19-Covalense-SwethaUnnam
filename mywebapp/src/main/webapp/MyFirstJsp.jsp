<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My First JSP</title>
</head>
<body>
	<h1>
		Current Date & Time : 
		<%
		String CurrentDateTime=new Date().toString();
		%>
		<br>
		 <span style="color: blue"><%=CurrentDateTime %></span>
	</h1>
	
</body>
</html>