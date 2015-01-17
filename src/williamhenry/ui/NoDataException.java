/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package williamhenry.ui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author sysop
 */
public class NoDataException extends Exception {

    /**
     * Creates a new instance of
     * <code>NoDataException</code> without detail message.
     */
    public NoDataException(String missingdata) {
        JFrame frame = new JFrame("Missing Data Error");
        JOptionPane.showMessageDialog(frame,
        "Missing data: '" + missingdata + "'.",
        "Missing Data",
        JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Constructs an instance of
     * <code>NoDataException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public NoDataException() {
        JFrame frame = new JFrame("Missing Data Error");
        JOptionPane.showMessageDialog(frame,
        "Missing data. Please complete all",
        "Missing Data",
        JOptionPane.ERROR_MESSAGE);
        //super(msg);
    }
}
