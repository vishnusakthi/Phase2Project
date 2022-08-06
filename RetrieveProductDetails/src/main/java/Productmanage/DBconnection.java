package Productmanage;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	static Connection con=null;
	public static Connection getMyConnection() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Vishnumysql");
		return con;
	}
}

