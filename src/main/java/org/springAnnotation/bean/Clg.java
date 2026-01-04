package org.springAnnotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("clg")
public class Clg {

	@Autowired   //yethe yani automatic Std class cha object bnvla
	private Std std;
	//Object depdency using Setter
//	public void setStd(Std std)
//	{
//		this.std=std;
//	}
	//object depdency using construtor 
	public Clg(Std std)
	{
		this.std=std;
	}
	public void show()
	{
		System.out.println("id ="+std.getId()+" Name = "+std.getName());

	}
}

