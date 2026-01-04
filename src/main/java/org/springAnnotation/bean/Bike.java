package org.springAnnotation.bean;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehical {
	@Override
	public void start() {
		System.out.println("I am start method of Bike");
	}
	

}
