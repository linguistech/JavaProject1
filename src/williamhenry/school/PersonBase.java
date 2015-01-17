/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package williamhenry.school;


import java.io.Serializable;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author sysop
 */
public class PersonBase implements IPersonBase, Serializable {
      
    
    private String name;
    private String address;
    private String socialSsecurityNnumber;
    private GregorianCalendar dateOfBirth;

    public PersonBase() {
        
    }
    
    public PersonBase(String name, String address, String socialSsecurityNnumber, GregorianCalendar dateOfBirth) {
        this.name = name;
        this.address = address;
        this.socialSsecurityNnumber = socialSsecurityNnumber;
        this.dateOfBirth = dateOfBirth;
    }
    
    public String toString() {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        String dob = fmt.format(dateOfBirth.getTime());
        return getClass().getName() +"[name=" + name + ",address=" + address + ",SSN=" + socialSsecurityNnumber + ",DOB=" + dob + "]";
    }
    
    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSocialSsecurityNnumber() {
        return socialSsecurityNnumber;
    }

    public void setSocialSsecurityNnumber(String socialSsecurityNnumber) {
        this.socialSsecurityNnumber = socialSsecurityNnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     
    
}
