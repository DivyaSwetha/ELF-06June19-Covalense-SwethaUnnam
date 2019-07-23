<%!public String name = "Seetha Ram";
	private int age = 22;
	{
		System.out.println("Inside my block");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getName(String name) {
		return "Given Name is:-" + name;
	}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Tags</title>
</head>
<body>
	<h1>Jsp Tags Examples...</h1>
	<br>
	<br> Name 1:<%=name%>
	<br> Name 2:<%=getName()%>
	<br> Name 3:<%=getName("swetha")%>
	<br>
	<br> Age 1:<%=age%><br> Age 2:<%=getAge()%>
	<br>
	<br>
	<%
	for(int i=0;i<5;i++){
	%>
	Name 1 :<%= name %><br>
	<%} %>
</body>
</html>