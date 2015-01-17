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
public class NoRoomSpecifiedException extends Exception {

    /**
     * Creates a new instance of
     * <code>NoRoomSpecifiedException</code> without detail message.
     */
    public NoRoomSpecifiedException() {
        JFrame frame = new JFrame("No Room Specified Error");
        JOptionPane.showMessageDialog(frame,
        "No Room Specified. Will be set to '100'.",
        "Missing Room",
        JOptionPane.ERROR_MESSAGE);
        //super(msg);
    }

    /**
     * Constructs an instance of
     * <code>NoRoomSpecifiedException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public NoRoomSpecifiedException(String msg) {
        JFrame frame = new JFrame("No Room Specified Error");
        JOptionPane.showMessageDialog(frame,
        "No Room Specified. Will be set to '100'.",
        "Missing Room",
        JOptionPane.ERROR_MESSAGE);
        //super(msg);
    }
}
