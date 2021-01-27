/**
 * Douglas Willian CB3005348
 * João Vitor Gino CB3005488
 */

import java.sql.Connection; 
import java.sql.SQLException; 

public class ConnectionTest {     
    public static void main(String[] args) throws SQLException {
         Connection connection = new JavaConnect().getConnection();
         System.out.println("Connection working!");
         connection.close();
     }
}