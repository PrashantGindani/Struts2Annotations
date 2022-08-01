package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

static Connection con;

static{
	if(con==null) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionUrl = "jdbc:sqlserver://DESKTOP-S1LCQH6:1433;databaseName=Bridal_Attire;user=saa;password=Prashant1234567890;encrypt=true;trustServerCertificate=true;";
			con = DriverManager.getConnection(connectionUrl);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public static Connection getConnection() {
	return con;
}

public static void closeConnection() {
	try {
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	
}
