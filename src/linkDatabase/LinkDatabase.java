package linkDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LinkDatabase {

	static final String drive = "com.mysql.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306/booklist?useSSL=false";
	static final String username="root";
	static final String password="8316685";

	static {
		try {
			Class.forName(drive);
		//	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static void closeConnection(ResultSet rs, Statement s, Connection conn) {
		if (rs != null)
			try {
				rs.close();
				if (s != null)
					s.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	public static void closeConnection(Statement s, Connection conn) {
		closeConnection(null, s, conn);

	}
}
