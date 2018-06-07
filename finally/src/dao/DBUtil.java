package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String  URL = "jdbc:mysql://127.0.0.1:3306/jdbc?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	private static final String USERNAME="root";
	private static final String PASSWORD="wwwNBA004";
	private static Connection con = null;
	
	public static Connection getConnection() {
		return con;
	}
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
