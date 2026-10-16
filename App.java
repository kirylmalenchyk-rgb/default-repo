package com.example;

public class App {
    public static void main(String[] args) {
        UserDto dto = new UserDto.Builder()
            .panNumber("123456789012")
            .build();

        LoggingService logging = new LoggingService();
        logging.logUserContext("user-1", dto.getPanNumber());
    }
}
