package gtrmcore.api.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gtrmcore.api.GTRMValues;

public class GTRMLog {

    private GTRMLog() {}

    public static Logger logger = LogManager.getLogger(GTRMValues.MODID);
}
