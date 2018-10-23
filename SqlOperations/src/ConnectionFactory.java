import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.mariadb.jdbc.Driver;

public class ConnectionFactory {

	public static final String URL = "jdbc:mariadb://localhost/java_test";
	public static final String USER = "root";
	public static final String PASS = "root";
	
	
	public static Connection getConnection()
	{
		try
		{
			DriverManager.registerDriver(new Driver());
	          return DriverManager.getConnection(URL, USER, PASS);
			
		} catch(SQLException ex)
		{
			 throw new RuntimeException("Error connecting to the database", ex);
		}
	}
	
	
}
