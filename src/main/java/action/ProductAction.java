package action;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.demo.entities.Productdescript;

import com.opensymphony.xwork2.ActionSupport;

import Util.DBUtil;

public class ProductAction extends ActionSupport {
	
	String search;
	public String prodid;
	
	public String pagetitle;
	
	public List<Productdescript> pp;
	
	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Action(value="/products",results = {
			@Result(name="success",location="/AllProducts.jsp"),
			@Result(name="input",location="/AllProducts.jsp"),
			@Result(name="error",location="/Error.jsp")
			})
	public String execute() {
		pagetitle="All products";
		try {
			PreparedStatement ps = DBUtil.getConnection().prepareStatement("Select * from productdescript");
			ResultSet rs= ps.executeQuery();
			pp=new ArrayList<>();
			System.out.println("klnlklmlklkmlkmklkml");
			while(rs.next()) {
				pp.add(new Productdescript(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
						rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16)));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return SUCCESS; 
	}
	
	@Action(value="/searchproducts",results = {
			@Result(name="success",location="/AllProducts.jsp"),
			@Result(name="input",location="/AllProducts.jsp"),
			@Result(name="error",location="/Error.jsp")
			})
	public String searchProducts() {
		pagetitle="Search list";
		try {
			PreparedStatement ps = DBUtil.getConnection().prepareStatement("select * from productdescript where productname like ? or procolor like ? or tags like ?");
			ps.setString(1,"%"+search+"%");
			ps.setString(2,"%"+search+"%");
			ps.setString(3,"%"+search+"%");
			ResultSet rs= ps.executeQuery();
			pp=new ArrayList<>();
			while(rs.next()) {
				pp.add(new Productdescript(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
						rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16)));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return SUCCESS; 
	}
	
	
	
	@Action(value="/addcart",results = {
			@Result(name="success",location="/AllProducts.jsp"),
			@Result(name="input",location="/AllProducts.jsp"),
			@Result(name="error",location="/Error.jsp")
			})
	public String addCart() {
		pagetitle="Search list";
		try {
			PreparedStatement ps = DBUtil.getConnection().prepareStatement("INSERT INTO [dbo].[CartMaster]([userid],[prodid],[quantity]) VALUES(1,"+prodid+",1)");
			ps.execute();		
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		
//		try {
//			PreparedStatement ps = DBUtil.getConnection().prepareStatement("select * from productdescript where productname like ? or procolor like ? or tags like ?");
//			ps.setString(1,"%"+search+"%");
//			ps.setString(2,"%"+search+"%");
//			ps.setString(3,"%"+search+"%");
//			ResultSet rs= ps.executeQuery();
//			pp=new ArrayList<>();
//			while(rs.next()) {
//				pp.add(new Productdescript(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
//						rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16)));
//			}
//			
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
		
		
		
		
		
		if(search== null || search.isEmpty()) {
			return execute();
		}
		
		
		
		return SUCCESS; 
	}
	
	
	
	
	
	@Action(value="/searchproducts",results = {
			@Result(name="success",location="/AllProducts.jsp"),
			@Result(name="input",location="/AllProducts.jsp"),
			@Result(name="error",location="/Error.jsp")
			})
	public String searchProducts() {
		pagetitle="Search list";
		try {
			PreparedStatement ps = DBUtil.getConnection().prepareStatement("select * from productdescript where productname like ? or procolor like ? or tags like ?");
			ps.setString(1,"%"+search+"%");
			ps.setString(2,"%"+search+"%");
			ps.setString(3,"%"+search+"%");
			ResultSet rs= ps.executeQuery();
			pp=new ArrayList<>();
			while(rs.next()) {
				pp.add(new Productdescript(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
						rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16)));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return SUCCESS; 
	}
	
	
	
	@Action(value="/deletecart",results = {
			@Result(name="success",location="/Cart.jsp"),
			@Result(name="input",location="/Cart.jsp"),
			@Result(name="error",location="/Error.jsp")
			})
	public String deleteCart() {
		try {
			PreparedStatement ps = DBUtil.getConnection().prepareStatement("delete from CartMaster where userid like '1' and prodid ="+prodid);
			ps.execute();		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userCart();	
	}
	
	
	
	
	
	
	
	@Action(value="/userCart",results = {
			@Result(name="success",location="/Cart.jsp"),
			@Result(name="input",location="/Cart.jsp"),
			@Result(name="error",location="/Error.jsp")
			})
	public String userCart() {
		pagetitle="Your Cart";
		try {
			PreparedStatement ps = DBUtil.getConnection().prepareStatement("Select * from productdescript where ProdID in (select ProdID from CartMaster where userid like '1')");
			ResultSet rs= ps.executeQuery();
			pp=new ArrayList<>();
			System.out.println("klnlklmlklkmlkmklkml");
			while(rs.next()) {
				pp.add(new Productdescript(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
						rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16)));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return SUCCESS; 
	}
}
