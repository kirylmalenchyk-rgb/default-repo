package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingService {
    private static final Logger log = LoggerFactory.getLogger(LoggingService.class);

    public void logUserContext(String userId, String panNumber) {
        log.info("user=" + userId + " pan=" + panNumber);
    }

    public void logSafe(String userId) {
        log.info("user={}", userId);
    }
}
