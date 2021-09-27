package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.common.eventbus.EventBus;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public EventBus eventBus() {
		EventBus eventbus = new EventBus();
		eventbus.register(new EventListener());
		return eventbus;
	}

}
