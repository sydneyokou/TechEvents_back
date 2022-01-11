package com.events.TechEvents_back;

import com.events.TechEvents_back.Models.Event;
import com.events.TechEvents_back.Models.Location;
import com.events.TechEvents_back.Models.Session;
import com.events.TechEvents_back.Repositories.EventRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;
import java.util.Date;


@SpringBootApplication
public class TechEventsBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechEventsBackApplication.class, args);
	}

	/*
	@Bean
	CommandLineRunner runner(EventRepository repository){
		return args -> {
			String[] voters1 = {"bradgreen", "igorminar", "martinfowler"};
			Session[] sessions1 = {new Session(1,"Using Angular 4 Pipes","Peter Bacon Darwin", 1, "Intermediate", "Learn all about the new pipes in Angular 4,  Given by the famous PBD, president of Angular University (formerly Oxford University)",voters1),
					new Session(2,"Getting the most out of your dev team","Peter Bacon Darwin", 1, "Intermediate", "Learn all about the new pipes in Angular 4,  Given by the famous PBD, president of Angular University (formerly Oxford University)",voters1)};
			Event event = new Event(
					 "Angular Connect Bis",
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
	*/

	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}


}
