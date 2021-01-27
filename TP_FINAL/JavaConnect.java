/**
 * Douglas Willian CB3005348
 * João Vitor Gino CB3005488
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaConnect {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=students";
		String user = "doug";
		String password = "123456";

		public Connection getConnection() {
			try {
				return DriverManager.getConnection(url, user, password);				
			}			
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	
	}
}		

