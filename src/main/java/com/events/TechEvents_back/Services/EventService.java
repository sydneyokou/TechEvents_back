package com.events.TechEvents_back.Services;

import com.events.TechEvents_back.Exceptions.EventNotFoundException;
import com.events.TechEvents_back.Models.Event;
import com.events.TechEvents_back.Repositories.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EventService {
    private final EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event addEvent(Event event){
        return eventRepository.save(event);
    }

    public Event updateEvent(Event event, String Id){
        Event eventToUpdate =  findEventById(Id);
        eventToUpdate.setSessions(event.getSessions());
        return eventRepository.save(eventToUpdate);
    }

    public Event findEventById(String id){
        return eventRepository.findEventById(id)
                .orElseThrow(() -> new EventNotFoundException("Event by id "+id+" was not found"));
    }

    public void deleteEvent(String id){
        eventRepository.deleteEventById(id);
    }
}
