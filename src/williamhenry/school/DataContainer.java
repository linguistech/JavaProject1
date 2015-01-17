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
public class DataContainer implements Serializable {

    private ArrayList<Student> listOfStudents = new ArrayList<Student>();
    private ArrayList<Faculty> listOfFaculty = new ArrayList<Faculty>();
    private ArrayList<Classroom> listOfClassrooms = new ArrayList<Classroom>();
    private ArrayList<ClassBase> listOfClasses = new ArrayList<ClassBase>();

    public DataContainer() {
    }

    public DataContainer(ArrayList<Student> listOfStudents, ArrayList<Faculty> listOfFaculty, ArrayList<Classroom> listOfClassrooms, ArrayList<ClassBase> listOfClasses) {
        this.listOfStudents = listOfStudents;
        this.listOfFaculty = listOfFaculty;
        this.listOfClassrooms = listOfClassrooms;
        this.listOfClasses = listOfClasses;
    }

    public ArrayList<ClassBase> getListOfClasses() {
        return listOfClasses;
    }

    public void setListOfClasses(ArrayList<ClassBase> listOfClasses) {
        this.listOfClasses = listOfClasses;
    }

    public ArrayList<Classroom> getListOfClassrooms() {
        return listOfClassrooms;
    }

    public void setListOfClassrooms(ArrayList<Classroom> listOfClassrooms) {
        this.listOfClassrooms = listOfClassrooms;
    }

    public ArrayList<Faculty> getListOfFaculty() {
        return listOfFaculty;
    }

    public void setListOfFaculty(ArrayList<Faculty> listOfFaculty) {
        this.listOfFaculty = listOfFaculty;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

   public String toString() {
        return getClass().getName() +"[faculty=" + listOfFaculty + ",students=" + listOfStudents + ",classrooms=" + listOfClassrooms + ",classes=" + listOfClasses + "]";
   }
   
   //public void writeDataContainerToFile() {
   //    
   //}
    
    
}
