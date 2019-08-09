package com.cbp.web.impl;

public interface EmailService {
	
	void sendSimpleMessage(String to, String subject, String text);

}
