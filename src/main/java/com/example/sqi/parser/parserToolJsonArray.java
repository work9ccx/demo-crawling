package com.example.sqi.parser;

import com.example.sqi.main.mainApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.json.simple.JSONArray;

public class parserToolJsonArray {
    private static final Logger LOGGER = LogManager.getLogger(mainApplication.class);
    public static String run(Object data, String key) {
        String value=null;
        LOGGER.info("Hello parserToolJsonArray",data);

        JSONArray parsingAra = null;
        int idx=0;
        for (Object i : parsingAra = (JSONArray) data) {
            value = parsingAra.get(idx).toString();
            idx++;
        }

        return value;
    }
}
