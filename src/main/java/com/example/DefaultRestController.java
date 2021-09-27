package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.eventbus.EventBus;

@RestController
public class DefaultRestController {

	@Autowired
	private EventBus eventbus;

	@GetMapping("/hello") // ?message=Hola Mundo!
	public Event hello(@RequestParam(value = "message", defaultValue = "Hello World!") String message) {
		Event event = new Event(message);
		eventbus.post(event);
		return event;
	}

}
