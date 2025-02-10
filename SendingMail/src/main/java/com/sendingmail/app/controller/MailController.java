package com.sendingmail.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sendingmail.app.model.EmailSender;
import com.sendingmail.app.service.EmailService;

@RestController
public class MailController {
	
	@Autowired
	EmailService service;
	
//	@Value("${spring.mail.username}")
//	String from;
	
	@PostMapping("/email")
	public String sendMail(@RequestBody EmailSender e) {
		try {
			
	//		e.setFrom(from);
			service.sendMail(e);
			return "email sent";
		}
		catch(Exception e2) {
			return "email not sent   " + e2;
		}		
	}
}
