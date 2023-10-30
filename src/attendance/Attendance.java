
package attendance;

import dao.StudentsDAO;
import view.vMain;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import database.Database;
import java.util.ArrayList;
import models.Student;
import models.StudentDTO;

public class Attendance {

    public Attendance(String string, int aInt, String string1, String string2, int aInt1) {
    }


    public static void main(String[] args) {
        
       vMain menu = new vMain();
       menu.setVisible(true);
       menu.setLocationRelativeTo(null);
        //Student student = new Student();
        //StudentsDAO dao = new StudentsDAO();
        //student.setDni(50);
        //student.setFirstName("Cristian");
        //student.setLastName("Gomez");
        //dao.addStudent(student);
        //int dni = 50;
        //dao.deleteStudent(dni);
        //dao.updateStudent(student);
       
       
    }
}
