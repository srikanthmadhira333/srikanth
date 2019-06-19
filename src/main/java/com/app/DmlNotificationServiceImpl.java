package com.app;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dml")
@Component
public class DmlNotificationServiceImpl implements InotificationService {

	@Override
	public void notificate() {
	System.out.println("from DML");

	}

}
