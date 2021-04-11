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
	String Name = request.getParameter("name");
	String Password = request.getParameter("password");
	
	if(Name.equals("princy") && Password.equals("princy")) {
		
		out.print("Valid User");
		
	}else {
		out.print("Not valid user");		
	}
%>

</body>
</html>