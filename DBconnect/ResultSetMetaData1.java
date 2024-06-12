package DBconnect;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMetaData1 {
    public static void main(String[] args) throws Exception {
        Driver drv = new oracle.jdbc.driver.OracleDriver();
        DriverManager.registerDriver(drv);

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
        ResultSetMetaData rsmd = rs.getMetaData();
        String tableName = rsmd.getTableName(1);
        System.out.println("Table Name: " + tableName);

        int columnCount = rsmd.getColumnCount();
        String CN=  rsmd.getColumnName(1);
       String CTN = rsmd.getColumnTypeName(1);
       System.out.println("CN :" + CN + " CTN ="+CTN +" ");
       
        con.close();
    }
}