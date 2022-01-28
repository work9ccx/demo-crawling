package com.example.sqi.main;

import com.sun.deploy.si.SingleInstanceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.sqi.parser.parserToolJsonArray;
import com.example.sqi.parser.parserToolJsonObject;

public class mainApplication {
    private static final Logger LOGGER = LogManager.getLogger(mainApplication.class);

    public static void run() {
        String data="";

        LOGGER.debug("Hello Debug level log");
        LOGGER.info("Hello Info level log");
        LOGGER.error("Hello Error level log");

        parserToolJsonObject.run(data);
        parserToolJsonArray.run(data);
    }
}
