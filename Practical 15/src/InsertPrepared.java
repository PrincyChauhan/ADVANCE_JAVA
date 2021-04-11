import java.sql.*;  
public class InsertPrepared {

	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");	
			
		PreparedStatement stmt=con.prepareStatement("insert into record values(?,?,?,?)");  
		stmt.setInt(1,101);
		stmt.setString(2,"Princy");  
		stmt.setString(3,"CE");  
		stmt.setInt(4,8);  
		
		stmt.executeUpdate(); 
		
		stmt.setInt(1,102);
		stmt.setString(2,"Presha");  
		stmt.setString(3,"CE");  
		stmt.setInt(4,8); 
		
		stmt.executeUpdate(); 
		
		stmt.setInt(1,103);
		stmt.setString(2,"Bhoomi");  
		stmt.setString(3,"CE");  
		stmt.setInt(4,8); 
		
		stmt.executeUpdate(); 
		
		
		
		stmt.setInt(1,103);
		stmt.setString(2,"Priya");  
		stmt.setString(3,"IT");  
		stmt.setInt(4,8); 
		
		stmt.executeUpdate(); 
		
//		int i=stmt.executeUpdate();  
		System.out.println( "records inserted");  
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
	
	
}
