package Model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSignUpDAO {
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/javacw";
		String username = "root";
		String password = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	} 
	public  String registerStudent(String uName, String uAddress, String uContact, String uEmail, String uGender, String uPass) {
		try {
			
			System.out.println(uName+uAddress+uContact+uEmail+uGender+uPass);
			String url = "jdbc:mysql://localhost:3306/javacw";
			String userName = "root";
			String password = "";
			String query = "insert into signupdata values(?,?,?,?,?,?)";
			
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,userName,password);
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1,uName );
			pt.setString(2, uAddress);
			pt.setString(3, uContact);
			pt.setString(4, uEmail);
			pt.setString(5,uGender);
			pt.setString(6, uPass);
			pt.executeUpdate();
			int rows = pt.executeUpdate();
			if (rows>=1) {
				return "Successfully added!";
			}
			else {
				return "Something is missing!";
			}			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return e.getMessage();
		}
		
		
		}
		
	}
	
	
