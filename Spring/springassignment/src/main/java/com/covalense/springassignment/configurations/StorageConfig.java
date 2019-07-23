package com.covalense.springassignment.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.springassignment.beans.HardDisk;
import com.covalense.springassignment.beans.PenDrive;
import com.covalense.springassignment.interfaces.StorageDevice;

@Configuration
public class StorageConfig {
	@Bean(name="harddisk")
	public StorageDevice getHardDisk() {
		return new HardDisk();
	}
	
	@Bean(name="pendrive")
	public StorageDevice getPenDrive() {
		return new PenDrive();
	}


}
