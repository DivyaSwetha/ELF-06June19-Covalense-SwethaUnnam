
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
1111111111111111111111111111111
<br>

<jsp:include page="index.html"/>
<br>
2222222222222222222222222222222
<br>
<jsp:include page="currentDate"></jsp:include>
<br>
3333333333333333333333333333333
<br>
<jsp:include page="currentDate?fname=swetha"/>
<br>
4444444444444444444444444444444
<br>
<jsp:include page="currentDate">
<jsp:param value="Swetha" name="fname"/>
<jsp:param value="Unnam" name="lname"/>
</jsp:include>
<br>
5555555555555555555555555555555
<br>
<jsp:include page="currentDateJsp"/>
<br>
6666666666666666666666666666666
<br>
<jsp:include page="MyFirstJsp.jsp"/>

</body>
</html>