/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package williamhenry.school;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author sysop
 */
public class StudentClass extends ClassBase implements Serializable {
    
    private ArrayList<Float> grades = new ArrayList<Float>();

    public StudentClass() {
    }
    
    public StudentClass(Classroom room, String className, float classIdNumber) {
        super(room, className, classIdNumber);
    }
    
    public StudentClass(ClassBase c) {
        super(c);
        // super(c.getRoom(), c.getClassName(), c.getClassIdNumber());
        System.out.println(c);
    }
       
    public Float getGrade(int i) {
       // if (i>0 && i<grades.size())
       return grades.get(i);
    }  
   
    public void addGrade(Float grade) {
       grades.add(grade);
    }
   
    public float getAverage() {
       float gradeSum = 0;
       for (int i = 0; i<grades.size(); i++)
           gradeSum = gradeSum + grades.get(i);
      
       return gradeSum/grades.size();
    }

    public float getGPA() {
       float gpa = 0;
       float gradeSum = 0;
       for (int i = 0; i<grades.size(); i++)
           gradeSum = gradeSum + grades.get(i);
      
       float gradeAverage = gradeSum/grades.size();
       if (gradeAverage>90)
           gpa = 4;
       else if (gradeAverage>80)
           gpa = 3;
       else if (gradeAverage>70)
           gpa = 2;
       else if (gradeAverage>60)
           gpa = 1;
       return gpa;
    }
   
    public String toString() {
        return super.toString() + "[grades=" + grades + "]";
    }
   
}
