package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String email=request.getParameter("lgEmail");
		String pass=request.getParameter("lgPass");
		
		String url = "jdbc:mysql://localhost:3306/javacw";
		String userName = "root";
		String password = "";
		String query="select email from signupdata where email = ? and password = ? ";
		
		
		try {
			PrintWriter out =response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,userName,password);
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, email);
			pt.setString(2, pass);
			ResultSet rs=pt.executeQuery();
			
			if (rs.next()){
				RequestDispatcher rd=request.getRequestDispatcher("./view/Home.jsp");
				rd.forward(request, response);
				
//				out.println("<font color=red size=18>Login Successful</br>");
//				out.println("<a href='./view/Home.jsp'>Go to Home Page</a>");
			}
				
				else{
					out.println("<font color=red size=18>Login Failed</br>");
					out.println("<a href='./view/Login.jsp'>Try Again</a>");
					
//					RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
//					rd.forward(request, response);
				}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
