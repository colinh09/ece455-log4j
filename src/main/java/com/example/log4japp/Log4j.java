package com.example.log4japp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {
    private static final Logger logger = LogManager.getLogger(Log4j.class);

    public static Logger getLogger() {
        return logger;
    }
}
