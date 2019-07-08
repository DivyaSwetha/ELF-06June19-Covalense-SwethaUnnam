package com.covalense.javaapp.mobile;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class MobileInfoPrint {
	public void print(ArrayList<MobileBean> beans) {
		for (MobileBean mobileBean : beans) {
			
			log.info("Mobile details are: "+mobileBean);
		}
	}
}
