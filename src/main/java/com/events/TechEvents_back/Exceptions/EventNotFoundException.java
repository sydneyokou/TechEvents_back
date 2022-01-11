package com.events.TechEvents_back.Exceptions;

public class EventNotFoundException extends RuntimeException {
    public EventNotFoundException(String msg) {
        super(msg);
    }
}
