import java.sql.*;
import javax.swing.*;

public class connection {
	
	
	
	private static Connection conn = null;
	public static void  cnx() {
		
		try {
			  Class.forName("org.sqlite.JDBC");
			 conn = DriverManager.getConnection("jdbc:sqlite:my_database.sqlite");
				
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		
		}
	}
	public static Connection getConn() {
		return conn;
	}
	}


