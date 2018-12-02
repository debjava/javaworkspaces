package com.ddlab.rnd.java.logger;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * This is a sample class to show log messages reading from a config file.
 *
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class SampleApplication {

    protected static final Logger logger = Logger.getLogger(SampleApplication.class.getName());
    private static LogManager manager = LogManager.getLogManager();

    static {
        //Initialize the logger config file.
        try {
            InputStream in = new FileInputStream("logconfig/logconfig.properties");
            manager.readConfiguration(in);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method used to show the log messages
     */
    public static void showLogMsgs() {
        logger.log(Level.INFO, "It is an info message");
        logger.log(Level.SEVERE, "It is an Exception or an Error message");
        logger.log(Level.WARNING, "It is a warning message");
    }
}
