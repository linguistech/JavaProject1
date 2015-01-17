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
public interface IPersonBase {
    String toString();
    GregorianCalendar getDateOfBirth();
    void setDateOfBirth(GregorianCalendar dateOfBirth);
    String getSocialSsecurityNnumber();
    void setSocialSsecurityNnumber(String socialSsecurityNnumber);
    String getAddress();
    void setAddress(String address);
    String getName();
    void setName(String name);
}
