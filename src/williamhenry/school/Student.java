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
public class Student extends PersonBase implements Serializable {
    
    private GregorianCalendar dateOfGraduation;
    private float currentGPA;
    private ArrayList<StudentClass> classes = new ArrayList<StudentClass>();
    
    public Student() {
        
    }
    public Student(String n, String a, String ssn, GregorianCalendar dob, GregorianCalendar dateOfGraduation) {
        super(n, a, ssn, dob);
        this.dateOfGraduation = dateOfGraduation;
    }
    
    public String toString() {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        String dog = fmt.format(dateOfGraduation.getTime());
        return super.toString() + "[graduate=" + dog + ",GPA=" + currentGPA + ",classes=" + classes + "]";
    }

    public ArrayList<StudentClass> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<StudentClass> classes) {
        this.classes = classes;
    }

    public void addClasses(StudentClass c) {
        // System.out.println(c);
        this.classes.add(c);
        // this.classes.add(new StudentClass(c.getRoom(), c.getClassName(), c.getClassIdNumber()));
    }

    
    public GregorianCalendar getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(GregorianCalendar dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    public float getCurrentGPA() {
        float classGPASum = 0;
        for (StudentClass c : classes)
            classGPASum = classGPASum + c.getGPA();
        currentGPA = classGPASum/classes.size();
        return currentGPA;
    }
    
}
