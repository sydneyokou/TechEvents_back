package com.events.TechEvents_back.Models;

import lombok.Data;

@Data
public class Session {
    private int id;
    private String name;
    private String presenter;
    private int duration;
    private String level;
    private String _abstract;
    private String[] voters;

    public Session(int id, String name, String presenter, int duration, String level, String _abstract, String[] voters) {
        this.id = id;
        this.name = name;
        this.presenter = presenter;
        this.duration = duration;
        this.level = level;
        this._abstract = _abstract;
        this.voters = voters;
    }

    public Session(String name, String presenter, int duration, String level, String _abstract, String[] voters) {
        this.name = name;
        this.presenter = presenter;
        this.duration = duration;
        this.level = level;
        this._abstract = _abstract;
        this.voters = voters;
    }
}
