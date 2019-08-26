package com.cbp.web.impl;

import javax.mail.MessagingException;   
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;


@Component
public class EmailServiceImpl implements EmailService {
  
	private Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);
	
    @Autowired
    public JavaMailSender emailSender;
 
    public void sendSimpleMessage(String to, String subject, String text) {
       /* SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom("finanplus@ss2526.com");//Correo por el cual se enviaran los msj a los tarjetahabientes y usuarios del vadmin
        message.setTo(to); 
        message.setSubject(subject); 
        message.setText(text);
        emailSender.send(message);*/
    	
    	/*
    	 * Envio del correo electronico con formato de html
    	 */
    	try {
			MimeMessage message = emailSender.createMimeMessage();
			
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			helper.setFrom("finanplus@ss2526.com");//Correo por el cual se enviaran los msj a los tarjetahabientes y usuarios del vadmin
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(text, true);
			
			emailSender.send(message);
		} catch (MailException e) {
			e.printStackTrace();
			logger.error("MailException {}",e);
		} catch (MessagingException e) {
			logger.error("MessagingException {}",e);
		}
    }
    
}
