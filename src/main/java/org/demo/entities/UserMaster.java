/*
 * Created on 2022-07-29 ( 20:25:36 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package org.demo.entities;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * JPA entity class for "UserMaster"
 *
 * @author Telosys
 *
 */
public class UserMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String     userEmail ;

    private String     firstname ;

    private String     lastname ;

    private String     password ;

    private BigDecimal mobileno ;

    private String     gender ;

    private String     useraddress ;

    private String     usercity ;

    public UserMaster(String userEmail, String firstname, String lastname, String password, BigDecimal mobileno,
			String gender, String useraddress, String usercity, BigDecimal userpincode) {
		super();
		this.userEmail = userEmail;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.mobileno = mobileno;
		this.gender = gender;
		this.useraddress = useraddress;
		this.usercity = usercity;
		this.userpincode = userpincode;
	}

	private BigDecimal userpincode ;

    public UserMaster() {
		super();
    }
    
    public void setUserEmail( String userEmail ) {
        this.userEmail = userEmail ;
    }
    public String getUserEmail() {
        return this.userEmail;
    }

    public void setFirstname( String firstname ) {
        this.firstname = firstname ;
    }
    public String getFirstname() {
        return this.firstname;
    }

    public void setLastname( String lastname ) {
        this.lastname = lastname ;
    }
    public String getLastname() {
        return this.lastname;
    }

    public void setPassword( String password ) {
        this.password = password ;
    }
    public String getPassword() {
        return this.password;
    }

    public void setMobileno( BigDecimal mobileno ) {
        this.mobileno = mobileno ;
    }
    public BigDecimal getMobileno() {
        return this.mobileno;
    }

    public void setGender( String gender ) {
        this.gender = gender ;
    }
    public String getGender() {
        return this.gender;
    }

    public void setUseraddress( String useraddress ) {
        this.useraddress = useraddress ;
    }
    public String getUseraddress() {
        return this.useraddress;
    }

    public void setUsercity( String usercity ) {
        this.usercity = usercity ;
    }
    public String getUsercity() {
        return this.usercity;
    }

    public void setUserpincode( BigDecimal userpincode ) {
        this.userpincode = userpincode ;
    }
    public BigDecimal getUserpincode() {
        return this.userpincode;
    }

	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(userEmail);
        sb.append("|");
        sb.append(firstname);
        sb.append("|");
        sb.append(lastname);
        sb.append("|");
        sb.append(password);
        sb.append("|");
        sb.append(mobileno);
        sb.append("|");
        sb.append(gender);
        sb.append("|");
        sb.append(useraddress);
        sb.append("|");
        sb.append(usercity);
        sb.append("|");
        sb.append(userpincode);
        return sb.toString(); 
    } 

}