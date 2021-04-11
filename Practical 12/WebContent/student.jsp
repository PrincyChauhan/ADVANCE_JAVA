<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
	String enrollment_no=request.getParameter("enrollment_no");
	String student_name=request.getParameter("student_name");
	String address=request.getParameter("address");
	String cpi=request.getParameter("cpi");
	
	int a,b;
	
	 a = Integer.parseInt(enrollment_no);
	 b = Integer.parseInt(cpi);
	

	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");	
		Statement st=conn.createStatement();
	
		int i=st.executeUpdate("insert into student(enrollment_no,student_name,address,cpi) values('"+a+"','"+student_name+"','"+address+"','"+b+"')");

	}
	catch(Exception e)
	{
		System.out.print(e);
		e.printStackTrace();
	}
%>

</body>
</html>