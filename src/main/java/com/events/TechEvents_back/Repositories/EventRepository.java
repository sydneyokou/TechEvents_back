package com.events.TechEvents_back.Repositories;

import com.events.TechEvents_back.Models.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {
    Optional<Event> findEventByNameIsContaining(String searchName);

    void deleteEventById(String id);

    Optional<Event> findEventById(String id);
}
