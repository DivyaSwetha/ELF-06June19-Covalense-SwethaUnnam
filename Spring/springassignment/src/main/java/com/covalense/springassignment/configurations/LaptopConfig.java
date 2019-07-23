package com.covalense.springassignment.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.covalense.springassignment.beans.Dell;
import com.covalense.springassignment.beans.Device;
import com.covalense.springassignment.beans.Hp;
import com.covalense.springassignment.interfaces.Laptop;

@Configuration
@Import(StorageConfig.class)
public class LaptopConfig {
	/*
	 * @Bean public Device getDevice() { return new Device();
	 * 
	 * }
	 */
	@Bean(name="dell")
	public Laptop getDell() {
		return new Dell();
	}
	
	@Bean(name="hp")
	public Laptop getHp() {
		return new Hp();
	}

}
                                                                      