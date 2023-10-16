/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.Database;

public class AttendanceDAO {
    
    StudentsDAO studentsDAO = new StudentsDAO();
    private Database connection;
    
    public AttendanceDAO(){
        this.connection = new Database(); //Cada vez que se instancia un studentsDAO, va a inicializar un objeto de tipo Database
    }
    
   
}


