package DBconnect;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.DatabaseMetaData;

public class Databasemetadata1 {
    public static void main(String[] args) throws Exception {
        Driver drv = new oracle.jdbc.driver.OracleDriver();
        DriverManager.registerDriver(drv);

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
        DatabaseMetaData dbmd = con.getMetaData();
        System.out.println(dbmd.getDatabaseProductName());
        System.out.println(dbmd.getDriverName());
        System.out.println(dbmd.getDriverVersion());
        System.out.println(dbmd.getDatabaseProductVersion());
       
        con.close();
    }
}