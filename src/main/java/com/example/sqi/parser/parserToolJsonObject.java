package com.example.sqi.parser;

import com.example.sqi.main.mainApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.json.simple.JSONObject;

public class parserToolJsonObject {
    private static final Logger LOGGER = LogManager.getLogger(mainApplication.class);
    public static String run(String data) {
        LOGGER.info("Hello parserToolJsonObject",data);

        return null;
    }
}
