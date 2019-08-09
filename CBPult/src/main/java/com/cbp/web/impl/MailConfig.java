package com.cbp.web.impl;

import java.util.Properties; 

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration 
public class MailConfig {
	
	/**
	 * Configuración SMTP emp
	 * 
	 */
	@Bean
	 public JavaMailSender javaMailService() {
		/**
		 * Configuración SMTP empleando el servidor de Solutions Systems
		 * 
		 */
		JavaMailSender mailSender = new JavaMailSenderImpl();
		 ((JavaMailSenderImpl) mailSender).setHost("ss2526.com");
		 ((JavaMailSenderImpl) mailSender).setPort(587);
		     
		 ((JavaMailSenderImpl) mailSender).setUsername("simon@ss2526.com");
		 ((JavaMailSenderImpl) mailSender).setPassword("Solutions2526.");
		 
		 Properties props = ((JavaMailSenderImpl) mailSender).getJavaMailProperties();
		 props.put("mail.transport.protocol", "smtp");
		 props.put("mail.smtp.auth", "true");
		 props.put("mail.smtp.starttls.enable", false);
		 props.put("mail.debug", "true");
		 
		 /*
		  Configuaración SMTP Gmail
		  
		  JavaMailSender mailSender = new JavaMailSenderImpl();
		 ((JavaMailSenderImpl) mailSender).setHost("smtp.gmail.com");
		 ((JavaMailSenderImpl) mailSender).setPort(587);
		     
		 ((JavaMailSenderImpl) mailSender).setUsername("my.gmail@gmail.com");
		 ((JavaMailSenderImpl) mailSender).setPassword("password");
		     
		 Properties props = ((JavaMailSenderImpl) mailSender).getJavaMailProperties();
		 props.put("mail.transport.protocol", "smtp");
		 props.put("mail.smtp.auth", "true");
		 props.put("mail.smtp.starttls.enable", "true");
		 props.put("mail.debug", "true");*/
		    
	     return mailSender;
	}

	@Bean
	public SimpleMailMessage templateSimpleMessage() {
	    SimpleMailMessage message = new SimpleMailMessage();
	    message.setText(
	      "This is the test email template for your email:\n%s\n");
	    return message;
	}
}
