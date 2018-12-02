package com.ddlab.logger.custom.filter;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

/**
 * This class is used as a log filter. You have to provide your own implementation
 * for custom logging message. In this class I have provided implementation to skip
 * the log messages coming from a particular library.
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class LogFilter implements Filter {

    /**
     * This method is used to provide the custom implementation for the logging
     * messages. In this case the implementation prevents to log the messages coming
     * from a third party.
     * @param record
     * @return true or false
     */
    @Override
    public boolean isLoggable(LogRecord record) {
        if(record.getSourceClassName().indexOf("org.some.third") != -1)
            return false;
        else
            return true;
    }
}
