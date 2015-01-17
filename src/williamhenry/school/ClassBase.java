/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package williamhenry.school;

import java.io.Serializable;
/**
 *
 * @author sysop
 */
public class ClassBase implements IClassBase, Serializable {

    private Classroom room;
    private String className;
    private float classIdNumber;

    public ClassBase() {
    }
    public ClassBase(ClassBase c) {
        this.room = c.room;
        this.className = c.className;
        this.classIdNumber = c.classIdNumber;
    }

    public ClassBase(Classroom room, String className, float classIdNumber) {
        this.room = room;
        this.className = className;
        this.classIdNumber = classIdNumber;
    }

    public float getClassIdNumber() {
        return classIdNumber;
    }
    
    public void setClassIdNumber(float classIdNumber) {
        this.classIdNumber = classIdNumber;
    }
    
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Classroom getRoom() {
        return room;
    }

    public void setRoom(Classroom room) {
        this.room = room;
    }
    
    public String toString() {
        return getClass().getName() +"[class name=" + className + ",room=" + room + ",class ID=" +classIdNumber + "]";
    }
}
