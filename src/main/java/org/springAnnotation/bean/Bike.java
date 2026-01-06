package org.springAnnotation.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bike")
@Primary
public class Bike implements Vehical {
	@Override
	public void start() {
		System.out.println("I am start method of Bike");
	}
	

}
