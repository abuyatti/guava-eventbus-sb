package com.example;

import com.google.common.eventbus.Subscribe;

public class EventListener {

	@Subscribe
	public void onEvent(Event event) {
		System.out.println("Event: " + event.getMessage());
	}

}
