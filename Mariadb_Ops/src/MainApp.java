import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;

import org.mariadb.jdbc.Driver;
public class MainApp {

	public static final String DB_LINK = "jdbc:mariadb://localhost/java_test";
	
	public static void main(String[] args) throws Exception{
		Connection conn = null;
		try
		{
			new Driver();
			conn = DriverManager.getConnection(DB_LINK, "root", "root");
			Statement smt = conn.createStatement();
			String sampleQuery = "Select * from user";
			ResultSet res = smt.executeQuery(sampleQuery);
			while(res.next())
			{
				System.out.println("---->" + res.getString(2));
			}
		} catch(Exception ex)
		{
			ex.printStackTrace();
		} finally {
			conn.close();
		}

	}

}
