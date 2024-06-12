package DBconnect;
import java.sql.*;

public class DBconnectivity {

	public static void main(String[] args) throws Exception
	{
		Driver drv = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(drv);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		if(con!=null)
		{
			System.out.println("Connection is Successful");
		}
		else
		{
			System.out.println("Connection is not successful");
		}

		con.close();
	}

}
