package com.example.demo;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Logg {
    private static final Logger logger = LoggerFactory.getLogger(Logg.class);
    private static long count;

    @RequestMapping("/")
        private static final String s(){
        logger.info("RELOADED / " + ++count);
        return "This is Spring Boot application";
    }
    }