<!DOCTYPE html>
<%@page import="com.covalense.empnew.dao.EmployeeDAOFactory"%>
<%@page import="com.covalense.empnew.dao.EmployeeDAO"%>
<%@page import="com.covalense.empnew.beans.EmployeeInfoBean"%>
<html>
<head>
  
</head>
<body>

<div class="container mt-4">


<!-- Search Navbar - START -->
<nav class="navbar navbar-default" role="navigation">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar">
            </span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <form method="GET"><a class="navbar-brand" href="/empnew/profile"><i class="fa fa-user" aria-hidden="true"></i></a></form>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
            <li class="active"><a href="/logout.jsp?logout=Thanks for visiting!!!">Logout</a></li>
            <!-- <li><a href="#">Link</a></li> -->
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><form action="/empnew/empinfo" method="POST"><input type="submit" value="Employee Info"></form></li>
                    <li><form action="/empnew/empinfo"><a href="#"><input type="submit" value="Employee Other Info"></a></form></li>
                    <li><form action="/empnew/empinfo"><a href="#"><input type="submit" value="Department Info"></a></form></li>
                    <li class="divider"></li>
                    <li><a href="#">Separated link</a></li>
                    <li class="divider"></li>                    
                </ul>
            </li>
        </ul>
        <div class="col-sm-3 col-md-3 pull-right">
            <form class="navbar-form" role="search" action="empsearch.jsp" >
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search with id..." name="id">
                    <div class="input-group-btn">
                        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                    </div>
                </div>
            </form>
        </div>        
    </div>
</nav>

<!-- Search Navbar - END -->

</div>
	
<H1><span style="color: blue"><%=request.getParameter("notfound") %></H1>


</body>
</html>