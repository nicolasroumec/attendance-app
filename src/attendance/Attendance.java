
package attendance;

import view.MainInterface;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import database.Database;

public class Attendance {


    public static void main(String[] args) {
        
       MainInterface menu = new MainInterface();
       menu.setVisible(true);
       menu.setLocationRelativeTo(null);
       
       Connection conexion = Database.connect();
       
       
    }
    
}
