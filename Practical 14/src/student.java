
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class student {
	
	public static void main(String args[]) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");		
			Statement s = con.createStatement();
			ResultSet  rs = s.executeQuery("SELECT * FROM student");

			System.out.println("enrollment_no\t\tstudent_name\t\taddress\t\tcpi");
			 while(rs.next())  
			 {  
				  
			
		 System.out.println(rs.getInt(1) + "\t\t" + "\t\t"+ rs.getString(2)+"\t\t" + rs.getString(3) + "\t\t" + rs.getInt(4));
                         	 }  
			
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
