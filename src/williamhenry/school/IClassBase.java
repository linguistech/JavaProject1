/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package williamhenry.school;

import java.util.GregorianCalendar;

/**
 *
 * @author sysop
 */
public interface IClassBase {
    String getClassName();
    void setClassName(String className);
    Classroom getRoom();
    void setRoom(Classroom room);
    String toString();
}
