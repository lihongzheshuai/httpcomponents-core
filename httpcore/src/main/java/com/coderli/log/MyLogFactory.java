package com.coderli.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * add by li.hzh
 */
public class MyLogFactory {

    private static final Log log = LogFactory.getLog("onecoder");
    private static final Log poolEntryBlockingLog = LogFactory.getLog("poolentry");

    public static Log getLog() {
        return log;
    }

    public static Log getPoolEntryBlockingLog() {
        return poolEntryBlockingLog;
    }

}
