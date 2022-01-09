package com.events.TechEvents_back.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Event {
    @Id
    private String id;
    private String name;
    private Date date;
    private String time;
    private double price;
    private String imageUrl;
    private Location location;
    private String onlineUrl;
    private Session[] sessions;

    public Event(String name, Date date, String time, double price, String imageUrl, Location location, String onlineUrl, Session[] sessions) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.price = price;
        this.imageUrl = imageUrl;
        this.location = location;
        this.onlineUrl = onlineUrl;
        this.sessions = sessions;
    }
}

