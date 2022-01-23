package com.events.TechEvents_back.Controllers;

import com.events.TechEvents_back.Models.Event;
import com.events.TechEvents_back.Services.EventService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/events")
@AllArgsConstructor
public class EventController {
    private final EventService eventService;

    @GetMapping("/all")
    public ResponseEntity<List<Event>> fetchAllEvents(){
        List<Event> events = eventService.getAllEvents();
        return new ResponseEntity<>(events, HttpStatus.OK);
    };

    @GetMapping("/find/{id}")
    public ResponseEntity<Event> getEventById(@PathVariable("id") String id){
        Event event = eventService.findEventById(id);
        return new ResponseEntity<>(event, HttpStatus.OK);
    };

    @PostMapping("/add")
    public ResponseEntity<Event> addEvent(@RequestBody Event event){
        Event newEvent = eventService.addEvent(event);
        return new ResponseEntity<>(newEvent, HttpStatus.CREATED);
    };

    @PutMapping("/update/{id}")
    public ResponseEntity<Event> updateEvent(@RequestBody Event event, @PathVariable String id){
        Event updatedEvent = eventService.updateEvent(event, id);
        return new ResponseEntity<>(updatedEvent, HttpStatus.CREATED);
    };

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEvent(@PathVariable("id") String id){
        eventService.deleteEvent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    };
}
