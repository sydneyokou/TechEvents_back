package com.events.TechEvents_back.Repositories;

import com.events.TechEvents_back.Models.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {
}
