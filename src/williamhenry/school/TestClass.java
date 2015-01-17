/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package williamhenry.school;

import java.util.*;

/**
 *
 * @author sysop
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        ArrayList<Classroom> classrooms = new ArrayList<Classroom>();
        ArrayList<ClassBase> classes = new ArrayList<ClassBase>();
        ArrayList<Faculty> faculty = new ArrayList<Faculty>();
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<FacultyClass> facultyClasses = new ArrayList<FacultyClass>();
        
        classrooms.add(new Classroom("101", 'c'));
        classrooms.add(new Classroom("stadium", 'h'));
        classrooms.add(new Classroom("532", 'l'));
        classrooms.add(new Classroom("221", 'c'));
        
        classes.add(new ClassBase(classrooms.get(0), "Advanced Underwater Basket Weaving", 883));
        classes.add(new ClassBase(classrooms.get(1), "Arithmetic for Business Majors", 51));
        classes.add(new ClassBase(classrooms.get(2), "Cooking with Gas", 117));
        classes.add(new ClassBase(classrooms.get(3), "Intro to Plasma Physics", 333));
        
        GregorianCalendar hireDay = new GregorianCalendar();
        GregorianCalendar dob = new GregorianCalendar();
        hireDay.set(1907, Calendar.FEBRUARY, 6);
        dob.set(1906, Calendar.OCTOBER, 17);
        faculty.add(new Faculty("Bob the Aged", "I93 Exit 27 overpass", "101547654", dob, hireDay, 21553.25, 'f'));
        hireDay.set(1999, Calendar.JUNE, 13);
        dob.set(1973, Calendar.JANUARY, 30);
        faculty.add(new Faculty("Bob the Younger", "112 Elm St", "709551232", dob, hireDay, 21553.25, 'p'));
        hireDay.set(2012, Calendar.AUGUST, 18);
        dob.set(2010, Calendar.JULY, 4);
        faculty.add(new Faculty("Crystal Roque", "983 Main St", "076873244", dob, hireDay, 21553.25, 'f'));
        hireDay.set(2011, Calendar.MARCH, 15);
        dob.set(1962, Calendar.SEPTEMBER, 1);
        faculty.add(new Faculty("Doris Knight", "293 Mass Ave", "213759876", dob, hireDay, 21553.25, 'f'));
        
        GregorianCalendar gradDay = new GregorianCalendar();
        gradDay.set(2014, Calendar.MAY, 6);
        dob.set(1996, Calendar.OCTOBER, 17);
        students.add(new Student("Joe", "123 2nd St", "002551234", dob, gradDay));
        students.add(new Student("Jane", "13 2nd St", "002551235", dob, gradDay));
        students.add(new Student("Jimmy", "125 3rd St", "002512634", dob, gradDay));
        students.add(new Student("John", "1 1st St", "003556234", dob, gradDay));
        
        Random rand = new Random();
        for (Student s : students) {
//            System.out.println(classes.get(0));
            s.addClasses(new StudentClass(classes.get(0).getRoom(), classes.get(0).getClassName(), classes.get(0).getClassIdNumber()));
            s.addClasses(new StudentClass(classes.get(1).getRoom(), classes.get(1).getClassName(), classes.get(1).getClassIdNumber()));
            s.addClasses(new StudentClass(classes.get(2).getRoom(), classes.get(2).getClassName(), classes.get(2).getClassIdNumber()));            
            s.addClasses(new StudentClass(classes.get(3).getRoom(), classes.get(3).getClassName(), classes.get(3).getClassIdNumber()));
        }
        for (Student s : students) {
            ArrayList<StudentClass> scl = s.getClasses();
            for (StudentClass sc : scl) {
                for (int i = 0; i < 10; i++) {
                    float grade = rand.nextInt(60) + 41;
                    sc.addGrade(grade);
                }
            }
        }
        
        
        
        faculty.get(0).addClass(classes.get(0).getRoom(), classes.get(0).getClassName(), classes.get(0).getClassIdNumber());   
        faculty.get(1).addClass(classes.get(1).getRoom(), classes.get(1).getClassName(), classes.get(1).getClassIdNumber());   
        faculty.get(2).addClass(classes.get(2).getRoom(), classes.get(2).getClassName(), classes.get(2).getClassIdNumber());   
        faculty.get(3).addClass(classes.get(3).getRoom(), classes.get(3).getClassName(), classes.get(3).getClassIdNumber());   

        for (int i = 0; i < 4; i++) {
            ArrayList<FacultyClass> fcl = faculty.get(i).getClasses();
            for (FacultyClass fc : fcl) {
                for (int j = 0; j < 4; j++) {
                    fc.addStudent(students.get(j));
                }
            }
        }
        
        for (int i = 0; i < 4; i++) {
            ArrayList<StudentClass> scls = students.get(i).getClasses();
            for (StudentClass sc : scls) {
                System.out.println(students.get(i).getName() + "'s GPA in " + sc.getClassName() + " is " + sc.getGPA());
            }
        }
        
        for (Faculty f : faculty) {
            System.out.println(f);
        }
        for (ClassBase c : classes) {
            System.out.println(c);
        }
        for (Student s : students) {
            System.out.println(s);
        }
        for (Classroom c : classrooms) {
            System.out.println(c);
        }
        for (FacultyClass fc : facultyClasses) {
            System.out.println(fc);
        }
    }
}
