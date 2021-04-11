import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class t2
 */
@WebServlet("/t2")
public class t2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public t2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie ck[] = request.getCookies();
		
		
		for(int i = 0;i<ck.length;i++) {
			out.print("<br>"+" "+ck[i].getValue()+"<br>");
		}

		
		out.print("<a href='t1\'>Home_Cookie</a><br>"+"<a href='t2\'>Page 2</a><br>");
	}

}
