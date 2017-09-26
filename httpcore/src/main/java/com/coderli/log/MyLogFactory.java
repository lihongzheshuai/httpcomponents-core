package com.coderli.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * add by li.hzh
 */
public class MyLogFactory {

    private static final Log log = LogFactory.getLog("onecoder");

    public static Log getLog() {
        return log;
    }

}
