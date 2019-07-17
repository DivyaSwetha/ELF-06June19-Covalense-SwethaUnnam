package com.covalense.springcore.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.springcore.beans.Donkey;
import com.covalense.springcore.beans.Monkey;
import com.covalense.springcore.beans.Pet;
import com.covalense.springcore.interfaces.Animal;

@Configuration
public class PetConfig {
	@Bean
	public Pet getPet() {
		return new Pet();
	}

	@Bean(name="monkey")
	public Animal getMonkey() {
		return new Monkey();
	}
	@Bean(name="donkey")
	public Animal getDonkey() {
		return new Donkey();
	}

}
