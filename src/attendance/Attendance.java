
package attendance;

import dao.studentsDAO;
import view.MainInterface;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import database.Database;
import models.Student;

public class Attendance {


    public static void main(String[] args) {
        
       MainInterface menu = new MainInterface();
       menu.setVisible(true);
       menu.setLocationRelativeTo(null);
       
       Connection conexion = Database.connect();
       Student student = new Student();
       studentsDAO dao = new studentsDAO();
       student.setDni(50);
       student.setFirstName("Nicolas");
       student.setLastName("Roumec");
       dao.add(student);
       
    }
    
}
