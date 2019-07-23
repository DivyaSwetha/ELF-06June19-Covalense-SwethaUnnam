package com.covalense.springcore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.covalense.springcore.beans.MessageBean;
//@Configuration
//@Repository
@Component
public class MessageConfig {
	@Bean
	@Scope("prototype")
	public MessageBean getMessageBean() {
		MessageBean bean = new MessageBean();
		bean.setMessage("Hello World!");
		return bean;
	}
}
