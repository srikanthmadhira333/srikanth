package com.app;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class NotificateServiceImpl implements InotificationService {

	@Override
	public void notificate() {
		System.out.println("from default");

	}

}
