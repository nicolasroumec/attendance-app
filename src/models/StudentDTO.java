
package models;

public class StudentDTO{
    private int dni;
    private String firstName;
    private String lastName;
    
    public StudentDTO(String pFirstName, String pLastName, int pDNI) {
        this.firstName = pFirstName;
        this.lastName = pLastName;
        this.dni = pDNI;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
     public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}