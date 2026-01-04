package org.springAnnotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std")
//ha std aplya Class chya name sarkha bnvaycha fkr small 
//Emp  ->emp
public class Std {
	@Value("1")
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
