package com.ddlab.rnd.logger.test;

import com.ddlab.rnd.java.logger.SampleApplication;
import org.some.third.party.ThirdPartySample;

/**
 * Test class to display the log messages in a file and console from logger config file.
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class TestLoggerFromConfig {
    
    public static void main( String[] args ) {
        SampleApplication.showLogMsgs();
        new ThirdPartySample().show();
    }

}
