package DBconnect;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class PreparedStatement1 
{
	 public static void main(String[] args) throws Exception {
	        Driver drv = new oracle.jdbc.driver.OracleDriver();
	        DriverManager.registerDriver(drv);
	        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
	        PreparedStatement ps = con.prepareStatement("INSERT INTO employee (eid, ename, esalary) VALUES (?, ?, ?)");
	        ps.setInt(1, 17);
	        ps.setString(2, "Tharak Ram");
	        ps.setBigDecimal(3, new java.math.BigDecimal("1242.00"));
	        
	        System.out.println("Values inserted in oracle");
	        con.close();
	    }
}
