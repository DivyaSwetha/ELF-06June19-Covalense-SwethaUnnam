package com.covalense.javaapp.mobile;

import java.util.ArrayList;

public class TestMobileBean {

	public static void main(String[] args) {

		ArrayList<MobileBean> beans = new ArrayList<>();
		beans.add(new MobileBean("Galaxy A6+", "Samsung", 18000.0, "black"));
		beans.add(new MobileBean("Galaxy J7", "Samsung", 13000.0, "gold"));
		beans.add(new MobileBean("Desire 820G+", "HTC", 12000, "white"));

		new MobileInfoPrint().print(beans);
	}

}
