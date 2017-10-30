package cn.nokia.com.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by fan on 2017/10/22.
 */
public class Benci implements Car {
    private Logger logger = LogManager.getLogger(DynamicProxy.class);

    public void run() {
        logger.debug("this car is run");
    }
}
