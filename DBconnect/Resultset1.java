package DBconnect;
import java.sql.*;
import java.math.BigDecimal;

public class Resultset1 {

    public static void main(String[] args) throws Exception {
        Driver drv = new oracle.jdbc.driver.OracleDriver();
        DriverManager.registerDriver(drv);

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM employee where eid= 1");
        while (rs.next())
        {
            int eid = rs.getInt("eid");
            String ename = rs.getString("ename");
            BigDecimal esalary = rs.getBigDecimal("esalary");
            System.out.println("EID: " + eid + ", Name: " + ename + ", Salary: " + esalary);
        }
        con.close();
    }
}
