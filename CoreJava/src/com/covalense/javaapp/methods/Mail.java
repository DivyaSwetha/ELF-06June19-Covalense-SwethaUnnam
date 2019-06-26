package com.covalense.javaapp.methods;

import lombok.extern.java.Log;

@Log
public class Mail {
	String To;
	String CC;
	String Subject;

	void send() {
		log.info("Sending the mail");
	}

	void attach() {
		log.info("Attaching the files");
	}
}

@Log
class TestMail {
	public static void main(String[] args) {

		Mail m = new Mail();
		m.To = "xyz@gmail.com.covalense.javaapp.lambdaexpressions";
		m.CC = "klm@gmail.com.covalense.javaapp.lambdaexpressions";
		m.Subject = "Request";
		
		log.info(m.To);
		log.info(m.CC);
		log.info(m.Subject);
		
		m.send();
		m.attach();
	}
}