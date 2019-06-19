package com.app;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("htc")
@Component
public class HtcNotificationServiceImpl implements InotificationService {

	@Override
	public void notificate() {
		System.out.println("from htc");

	}

}
