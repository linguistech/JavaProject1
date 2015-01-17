/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package williamhenry.school;

import java.util.*;
import java.text.SimpleDateFormat;
import java.io.Serializable;

/**
 *
 * @author sysop
 */
public class Faculty extends PersonBase implements Serializable {
    
    private GregorianCalendar dateOfHire;
    private GregorianCalendar dateOfTermination = new GregorianCalendar(1900, Calendar.JANUARY, 1);
    private double salary;
    private ArrayList<FacultyClass> classes = new ArrayList<FacultyClass>();
    private char status;

    public Faculty() {
    }

    public Faculty(String n, String a, String ssn, GregorianCalendar dob, GregorianCalendar dateOfHire, double salary, char status) {
        super(n, a, ssn, dob);
        this.dateOfHire = dateOfHire;
        this.salary = salary;
        this.status = status;
    }

    public ArrayList<FacultyClass> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<FacultyClass> classes) {
        this.classes = classes;
    }

    public void addClass(Classroom room, String className, float classIdNumber) {
        this.classes.add(new FacultyClass(room, className, classIdNumber));
    }
    
    public GregorianCalendar getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(GregorianCalendar dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public GregorianCalendar getDateOfTermination() {
        return dateOfTermination;
    }

    public void setDateOfTermination(GregorianCalendar dateOfTermination) {
        this.dateOfTermination = dateOfTermination;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
    public String toString() {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        String inDate = fmt.format(dateOfHire.getTime());
        String outDate = fmt.format(dateOfTermination.getTime());
        return super.toString() + "[hired=" + inDate + ",fired=" + outDate + ",salary=" + salary + ",classes=" + classes + ",status=" + status + "]";
    }

    
}
