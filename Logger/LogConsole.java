package CalculatorModel;

import java.time.LocalDateTime;

import Logger.Loggable;

public class LogConsole implements Loggable {

    @Override
    public void log(String message) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime + "  " + message);
    }

    
}
