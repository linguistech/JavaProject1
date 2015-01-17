/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package williamhenry.utilities;

/**
 *
 * @author sysop
 */
public class Logger {

    /*
     * Initialise some variables.
     * 
     * The constants are public so that they can be passed 
     * as arguments to setLogLevel().
     */
    public static final int DEBUG = 4;
    public static final int INFO = 3;
    public static final int WARNING = 2;
    public static final int ERROR = 1;
    private static int errorLevel = 0;
    private static boolean loggingEnabled;

    /*
     * Following is how I wanted to set the error level, but...
     */
    public static void setLogLevel(int logLevel) {
        errorLevel = logLevel;
    }

    /*
     * ...but TestLogger didn't support it, 
     * thus the following four methods.
     * 
     * Rather than modify TestLogger, I just supported
     * both conventions.
     */
    public static void setDetailDebug() {
        errorLevel = DEBUG;
    }

    public static void setDetailInfo() {
        errorLevel = INFO;
    }

    public static void setDetailWarning() {
        errorLevel = WARNING;
    }

    public static void setDetailError() {
        errorLevel = ERROR;
    }

    
    /*
     * The next four methods print the passed string if
     * the right conditions are met. Those conditions 
     * should be rather self-explanatory
     * 
     * In a real log program, these would be output to a file
     * and include a timestamp and some indication of where
     * the message came from.
     */
    public static void logDebug(String strMessage) {
        if (loggingEnabled && errorLevel >= DEBUG) {
            System.out.println(strMessage);
        }
    }

    public static void logInfo(String strMessage) {
        if (loggingEnabled && errorLevel >= INFO) {
            System.out.println(strMessage);
        }
    }

    public static void logWarning(String strMessage) {
        if (loggingEnabled && errorLevel >= WARNING) {
            System.out.println(strMessage);
        }
    }

    public static void logError(String strMessage) {
        if (loggingEnabled && errorLevel >= ERROR) {
            System.out.println(strMessage);
        }
    }

    /*
     * The following two methods turn logging on and off.
     * They take no arguments and return nothing.
     * Pretty straightforward.
     */
    public static void enableLogging() {
        loggingEnabled = true;
    }

    public static void disableLogging() {
        loggingEnabled = false;
    }
}
