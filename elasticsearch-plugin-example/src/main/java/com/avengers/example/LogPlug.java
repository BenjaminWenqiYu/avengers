package com.avengers.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.plugins.ActionPlugin;
import org.elasticsearch.plugins.Plugin;

public class LogPlug extends Plugin implements ActionPlugin {

    private final static Logger LOGGER = LogManager.getLogger(LogPlug.class);

    public LogPlug(){
        super();
        LOGGER.info("the simple LogPlug----------------");
        LOGGER.info("the simple LogPlug----------------");
        LOGGER.info("the simple LogPlug----------------");
        LOGGER.info("the simple LogPlug----------------");
        LOGGER.info("the simple LogPlug----------------");
    }
}
