package az.shafag.testapp.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    private static Logger logger = LogManager.getLogger();

    public static void info(String msg){
        logger.info(msg);
    }
}
