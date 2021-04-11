import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*; 
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class marksheet
 */
@WebServlet("/marksheet")
public class marksheet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public marksheet() {
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
			
			String rollno=request.getParameter("roll");  
			int roll=Integer.parseInt(rollno); 
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");		
//			Statement s = con.createStatement();
			
			
			PreparedStatement st = con.prepareStatement("select * from result where en_no=?");
	                  
			 st.setInt(1, roll);
			 
			 
			 out.print("<table width=50% border=1 >");  
			 out.print("<caption>Result:</caption>");  
			 
			 ResultSet rs=st.executeQuery();  
			 
			 
			 /* Printing column names */  			 
			 ResultSetMetaData rsmd=rs.getMetaData();    
			 int total=rsmd.getColumnCount();  
			 
			 out.print("<tr>");  
			 
			 for(int i=1;i<=total;i++)  
			 {  
			 out.print("<th>"+rsmd.getColumnName(i)+"</th>");  
			 }  
			 out.print("</tr>");  
			 
	            
			 /* Printing result */  
			   
			 while(rs.next())  
			 {  
				 out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td><td>"+rs.getInt(4)+"</td><td>"+rs.getInt(5)+"</td></tr>"); 
			 }  
			   
			 out.print("</table>");  
			               
			 
//			 st.executeUpdate();
			  
//	        st.close();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	
	}


