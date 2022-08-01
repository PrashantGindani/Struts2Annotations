package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Util.DBUtil;

public class ProductDao {
	
	
public static void getAllProducts() {
	Connection con = DBUtil.getConnection();
	try {
		PreparedStatement ps= con.prepareStatement("select * from productdescript");
		ResultSet rs=  ps.executeQuery();
		while(rs.next()) {
			
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}
}
