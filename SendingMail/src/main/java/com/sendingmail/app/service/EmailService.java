package com.sendingmail.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.sendingmail.app.model.EmailSender;

@Component
public class EmailService {

	@Autowired
	JavaMailSender sender;
	
	public void sendMail(EmailSender e) {

		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(e.getTo());
		message.setFrom(e.getFrom());
		message.setSubject(e.getSubject());
		message.setText(e.getMessage());
		sender.send(message);
	}

}
