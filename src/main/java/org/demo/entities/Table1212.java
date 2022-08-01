/*
 * Created on 2022-07-29 ( 20:25:36 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package org.demo.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * JPA entity class for "Table1212"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Table1212", schema="dbo", catalog="Struts2app" )
public class Table1212 implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="packid", nullable=false)
    private BigDecimal packid ;

    //--- ENTITY DATA FIELDS 
    @Column(name="packname", nullable=false, length=2147483647)
    private String     packname ;

    @Column(name="packdesc", nullable=false)
    private BigDecimal packdesc ;

    @Column(name="price", nullable=false)
    private BigDecimal price ;

    @Temporal(TemporalType.TIME)
    @Column(name="avgtime", nullable=false)
    private Date       avgtime ;

    @Column(name="packimg", nullable=false, length=2147483647)
    private String     packimg ;

    @Column(name="beautician", nullable=false, length=2147483647)
    private String     beautician ;


    //--- ENTITY LINKS ( RELATIONSHIP )

    /**
     * Constructor
     */
    public Table1212() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setPackid( BigDecimal packid ) {
        this.packid = packid ;
    }
    public BigDecimal getPackid() {
        return this.packid;
    }

    public void setPackname( String packname ) {
        this.packname = packname ;
    }
    public String getPackname() {
        return this.packname;
    }

    public void setPackdesc( BigDecimal packdesc ) {
        this.packdesc = packdesc ;
    }
    public BigDecimal getPackdesc() {
        return this.packdesc;
    }

    public void setPrice( BigDecimal price ) {
        this.price = price ;
    }
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setAvgtime( Date avgtime ) {
        this.avgtime = avgtime ;
    }
    public Date getAvgtime() {
        return this.avgtime;
    }

    public void setPackimg( String packimg ) {
        this.packimg = packimg ;
    }
    public String getPackimg() {
        return this.packimg;
    }

    public void setBeautician( String beautician ) {
        this.beautician = beautician ;
    }
    public String getBeautician() {
        return this.beautician;
    }

    //--- GETTERS FOR LINKS
    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(packid);
        sb.append("|");
        sb.append(packname);
        sb.append("|");
        sb.append(packdesc);
        sb.append("|");
        sb.append(price);
        sb.append("|");
        sb.append(avgtime);
        sb.append("|");
        sb.append(packimg);
        sb.append("|");
        sb.append(beautician);
        return sb.toString(); 
    } 

}
