

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class data
 */
@WebServlet("/data")
public class data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public data() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
	try {
			
			String age=request.getParameter("age");
			String EmpId=request.getParameter("EmpId");
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			
			int a,b;
			
			
			a = Integer.parseInt(age);
			b = Integer.parseInt(EmpId);
			
			
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");		
//			Statement s = con.createStatement();
			PreparedStatement st = con.prepareStatement("insert into emp values(?, ?,?,?)");
	                   
			 st.setInt(1, b);
			 st.setInt(4, a);
			 st.setString(3, email);
			 st.setString(2, name);
			 
			 
			  st.executeUpdate();
			  
//	        st.close();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
