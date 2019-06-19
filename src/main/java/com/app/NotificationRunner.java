package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NotificationRunner implements CommandLineRunner {

	@Autowired
	private InotificationService service;
	@Override
	public void run(String... args) throws Exception {
	
		service.notificate();

	}

}
