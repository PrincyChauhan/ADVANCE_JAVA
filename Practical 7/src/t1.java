

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class t1
 */
@WebServlet("/t1")
public class t1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public t1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String a = request.getParameter("fname");

		String b = request.getParameter("lname");
				
		out.print("Welcome to home page"+" " + a+" "+b+"</br>");
		
		
//		create link 
		
		out.print("<a href='t1\'>Home_Cookie</a><br>"+"<a href='t2\'>Page 2</a><br>");
		
		
//		create cookie
		Cookie c = new Cookie("firstname",a);
		Cookie d = new Cookie("lastname",b);
		
		response.addCookie(c);

		response.addCookie(d);
		
	}

}
