package com.covalense.javaapp.carsandbrand;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class TestCarsBean {

	public static void main(String[] args) {

		ArrayList<CarsBean> cars = new ArrayList<>();
		cars.add(new CarsBean("Marcopolo", "Tata Motors"));
		cars.add(new CarsBean("Tata Prima", "Tata Motors"));
		cars.add(new CarsBean("Swift DZire", "Maruti Suzuki"));
		cars.add(new CarsBean("GO+", "Maruti Suzuki"));
		cars.add(new CarsBean("Audi AG", "volkswagen"));
		cars.add(new CarsBean("Audi A6+", "volkswagen"));
		cars.add(new CarsBean("BMWG", "BMW"));
		cars.add(new CarsBean("phanthom", "Rolls Royce"));

		int option=3;
		Predicate<CarsBean> brand = null;
		switch (option) {
		case 1: brand=i-> i.getBrand()=="Tata Motors";
		break;
		case 2: brand=i-> i.getBrand()=="Maruti Suzuki";
		break;
		case 3: brand=i-> i.getBrand()=="volkswagen";
		break;
		case 4: brand=i-> i.getBrand()=="BMW";
		break;
		case 5: brand=i-> i.getBrand()=="Rolls Royce";
		break;

		default:log.info("Choose valid brand name");
		break;
		}

		List<CarsBean> carsList=cars.stream().filter(brand).collect(Collectors.toList());
		for (CarsBean carsBean : carsList) {
			log.info("Cars from this brand are: "+carsBean.getCar());
		}
	}

}
