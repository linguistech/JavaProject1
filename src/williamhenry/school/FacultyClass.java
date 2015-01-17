/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package williamhenry.school;

import java.util.*;
import java.io.Serializable;

/**
 *
 * @author sysop
 */
public class FacultyClass extends ClassBase implements Serializable {
    
    private ArrayList<Student> students = new ArrayList<Student>();

    public FacultyClass() {
    }

    public FacultyClass(ArrayList<Student> students, Classroom room, String className, float classIdNumber) {
        super(room, className, classIdNumber);
        this.students = students;
    }
    
    public FacultyClass(Classroom room, String className, float classIdNumber) {
        super(room, className, classIdNumber);
    }
    
    public Student getStudent(int i) {
        return students.get(i);
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
   public String toString() {
        return super.toString() + "[students=" + students + "]";
   }
    
}
