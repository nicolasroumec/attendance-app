
package models;

public class Student{
    private int dni;
    private String firstName;
    private String lastName;
    private boolean status;
    private boolean justified;

    public boolean isJustified() {
        return justified;
    }

    public void setJustified(boolean justified) {
        this.justified = justified;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
     public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}