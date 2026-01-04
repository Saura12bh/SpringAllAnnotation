package org.springAnnotation.bean;

import org.springframework.stereotype.Component;
@Component("car")
public class Car implements Vehical{
	@Override
	public void start() {
		System.out.println("I am  Start method of car class");
	}
}
