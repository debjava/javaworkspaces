package com.ddlab.rnd.logger.test;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class Test1 {
    /**
     * Java logger
     */
    protected final static Logger logger = Logger.getLogger(Test1.class.getName());

    static {
        try {
            Handler handler = new FileHandler("applogs1.log", true);
            //Default is XMl Formatter
//            handler.setFormatter( new java.util.logging.SimpleFormatter());
            logger.addHandler(handler);
        } catch (IOException ex) {
            Logger.getLogger(Test1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Test1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Main method
     * @param args 
     */
    public static void main(String[] args) {
        logger.log(Level.INFO, "Info Message");
        logger.log(Level.SEVERE, "It is an Exception or an Error");
    }
}
