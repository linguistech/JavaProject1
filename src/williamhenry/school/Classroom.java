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
public class Classroom implements Serializable {

    private String roomNumber;
    private char status;

    public Classroom() {
    }

    public Classroom(String roomNumber, char status) {
        this.roomNumber = roomNumber;
        this.status = status;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    
    public String toString() {
        return getClass().getName() +"[room number=" + roomNumber + ",status=" + status + "]";
    }
    
    
}
