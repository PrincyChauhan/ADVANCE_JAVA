

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeNumber
 */
@WebServlet("/PrimeNumber")
public class PrimeNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeNumber() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n1=request.getParameter("num1");
		String n2=request.getParameter("num2");
		int a,b,i,j,flag;
		a = Integer.parseInt(n1);
		b = Integer.parseInt(n2);
		out.printf("\nPrime numbers between %d and %d are: ", a, b);
        for (i = a; i <= b; i++) {
        

            if (i == 1 || i == 0)
                continue;
 
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                out.println(i);

	}

	}}
