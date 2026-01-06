package org.springAnnotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sh")
public class Showroom {
	
	@Autowired
	//by the default car cha ref bnvto karan apn Car chya varti primary use kela ahe
	//ani jr apn qualifer use kela yethe tr qualier madhe aslela bean cha object bnel 
	//kran primary jevha qualifer use krt nahi tevha default mhnun use krto
//	@Qualifier("car")  ->car chi method run hoyl
	Vehical vehical;
	public void show()
	{
		vehical.start();
	}
}
