package Val_validate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/numbers")
public class Test extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		
		String num1= req.getParameter("num1");
		String num2= req.getParameter("num2");
		String num3= req.getParameter("num3");
		
		if(num1.equals(num2))
		{
			if(num1.equals(num3))
			{
				pw.println("All the three numbers are equal");
			}
			else 
			{
				pw.println("1st and 2nd number are equal");
			}
			
		}
		
		else if(num2.equals(num3))
		{
			pw.println("2nd and 3rd number are equal");
		}
		else if(num1.equals(num3))
		{
			pw.println("1st and 3rd number are equal");
		}
			else
			{
			pw.println("All the three numbers are different");
			}
	}

}
