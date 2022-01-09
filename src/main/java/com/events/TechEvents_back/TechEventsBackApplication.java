package com.events.TechEvents_back;

import com.events.TechEvents_back.Models.Event;
import com.events.TechEvents_back.Models.Location;
import com.events.TechEvents_back.Models.Session;
import com.events.TechEvents_back.Repositories.EventRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class TechEventsBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechEventsBackApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(EventRepository repository){
		return args -> {
			String[] voters1 = {"bradgreen", "igorminar", "martinfowler"};
			Session[] sessions1 = {new Session(1,"Using Angular 4 Pipes","Peter Bacon Darwin", 1, "Intermediate", "Learn all about the new pipes in Angular 4,  Given by the famous PBD, president of Angular University (formerly Oxford University)",voters1),
					new Session(2,"Getting the most out of your dev team","Peter Bacon Darwin", 1, "Intermediate", "Learn all about the new pipes in Angular 4,  Given by the famous PBD, president of Angular University (formerly Oxford University)",voters1)};
			Event event = new Event(
					 "Angular Connect BIS",
					 new Date("9/26/2036"),
					 "10:00 am",
					 599.99,
					"/assets/images/angularconnect-shield.png",
					 new Location("1057 DT", "London", "England"),
					"",
					sessions1
			);

			repository.insert(event);
		};
	}

}
