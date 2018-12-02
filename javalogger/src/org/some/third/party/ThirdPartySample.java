package org.some.third.party;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is a sample java class which acts as a third party libray.
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class ThirdPartySample {
    /**
     * Java Logger
     */
    protected static final Logger logger = Logger.getLogger(ThirdPartySample.class.getName());
    
    /**
     * Method used to show the log messages as if it is coming from third party library
     */
    public void show() {
        logger.log(Level.INFO, "It is an info message from third party");
        logger.log(Level.SEVERE, "It is an Exception or an Error message from third party");
        logger.log(Level.WARNING, "It is a warning message from third party");
    }
}
