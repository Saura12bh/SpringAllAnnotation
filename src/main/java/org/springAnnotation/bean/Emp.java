package org.springAnnotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e")
//user defined class e ha refereance ahe
public class Emp {
	@Value("1")
	//ya cha use krun apn id la 1 value set keli apn he setID method vr use kru shkto
	private int id;
	@Value("Sai")
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
