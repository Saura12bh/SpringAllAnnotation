package org.springAnnotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sh")
public class Showroom {
	
	@Autowired
	@Qualifier("bike")  //jr apn use  nahi kel tr spring conatiner confused hoto konta
						//bean use kraycha te
	Vehical vehical;
	public void show()
	{
		vehical.start();
	}
}
