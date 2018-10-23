
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DB_Handler_User {
	
	public static ArrayList getAllUsers()
	{
		ArrayList<User> list=new ArrayList<User>();
		Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user");
            while(rs.next())
            {
                User user = new User();
                user.setId( rs.getInt("id") );
                user.setName( rs.getString("name") );	                
                list.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
		
		return list;
	}

	public static User getUserbyId(int id) {
	    Connection connection = ConnectionFactory.getConnection();
	        try {
	            Statement stmt = connection.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE id=" + id);
	            if(rs.next())
	            {
	                User user = new User();
	                user.setId( rs.getInt("id") );
	                user.setName( rs.getString("name") );	                
	                return user;
	            }
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
	    return null;
	}
	
	public static boolean insertUser(User user) {
		Connection connection = ConnectionFactory.getConnection();
	    try {
	        PreparedStatement ps = connection.prepareStatement("INSERT INTO user VALUES (?, ?)");
	        ps.setString(1, user.getId().toString());
	        ps.setString(2, user.getName());
	        int i = ps.executeUpdate();
	      if(i == 1) {
	        return true;
	      }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	    return false;
	}
	
	public static boolean updateUser(User user) {
		Connection connection = ConnectionFactory.getConnection();
	    try {
	        PreparedStatement ps = connection.prepareStatement("UPDATE user SET name=?WHERE id=?");
	        ps.setString(1, user.getName());
	        ps.setString(2, user.getId().toString());
	        int i = ps.executeUpdate();
	      if(i == 1) {
	    return true;
	      }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	    return false;
	}
	
	public static boolean deleteUser(int id) {
		Connection connection = ConnectionFactory.getConnection();
	    try {
	        Statement stmt = connection.createStatement();
	        int i = stmt.executeUpdate("DELETE FROM user WHERE id=" + id);
	      if(i == 1) {
	    	  System.out.println("Success");
	    return true;
	      }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	    return false;
	}
	
	
}
