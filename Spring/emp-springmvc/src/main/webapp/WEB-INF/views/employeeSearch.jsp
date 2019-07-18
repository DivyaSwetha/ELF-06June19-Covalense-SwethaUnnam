<%@ page session="true" %>
<!DOCTYPE html>
<%@page import="com.covalense.emp.dto.EmployeeInfoBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="com.covalense.emp.util.HibernateUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.covalense.emp.dao.EmployeeDAOFactory"%>
<%@page import="com.covalense.emp.dao.EmployeeDAO"%>
<html>
<head>
    <meta charset="utf-8" />
    <title>Search</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="font-awesome/css/font-awesome.min.css" />
    <link rel="stylesheet" type="text/css" href="css/style3.css" />

    <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container mt-4">


<!-- Search Navbar - START -->
<nav class="navbar navbar-default" role="navigation">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">EMP</span>
            <span class="icon-bar">
            </span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <form method="GET"><a class="navbar-brand" href="/empnew/profile"><i class="fa fa-user" aria-hidden="true"></i></a></form>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
            <li class="active"><a href="/logout">Logout</a></li>
            <!-- <li><a href="#">Link</a></li> -->
           <!--  <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><form action="/empnew/empinfo" method="POST"><input type="submit" value="Employee Info"></form></li>
                    <li><form action="/empnew/empinfo"><a href="#"><input type="submit" value="Employee Other Info"></a></form></li>
                    <li><form action="/empnew/empinfo"><a href="#"><input type="submit" value="Department Info"></a></form></li>
                    <li class="divider"></li>
                    <li><a href="#">Separated link</a></li>
                    <li class="divider"></li>                    
                </ul>
            </li> -->
        </ul>
       <div class="col-sm-3 col-md-3 pull-right">
            <form class="navbar-form" role="search" action="../validate/search" >
                <div class="input-group">
                    <input  type="text" class="form-control" placeholder="Search with id..." name="id">
                    <div class="input-group-btn">
                    <input hidden type="text" class="form-control" placeholder="Search with id..." name="url" value="search">
                        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                    </div>
                </div>
            </form>
        </div>       
    </div>
</nav>

<!-- Search Navbar - END -->

</div>
	<% 
		  EmployeeDAO dao = EmployeeDAOFactory.getInstance();
         
          String idValue=request.getParameter("id");
          List<Integer> idList = dao.getAllEmployeeIds(idValue);
         // Query query=HibernateUtil.openSession().createQuery("from EmployeeInfoBean where str(id) LIKE 'idValue%'");
        //  List<Integer> ids=query.list();
          %>
          <%-- <% Iterator<EmployeeInfoBean> itr=idList.iterator();
          while(itr.hasNext()){ %>
          <a href=""><%= itr.next() %></a><br>
          <%} %> --%>
          <% for(Integer emps:idList){ %>
          <a href=""><%=emps %></a><br>
          <%} %>
		 


</body>
</html>