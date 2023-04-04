package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SigningUp")
public class SignUp extends HttpServlet {
      
  
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uName= request.getParameter("name");
		String uAddress=request.getParameter("address");
		String uContact=request.getParameter("contact");
		String uEmail=request.getParameter("email");
		String uGender=request.getParameter("gender");
		String uPass=request.getParameter("pass");
		
		
		
	}

}
