package org.springAnnotation.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("studentLookUp")
@Scope("prototype")
public class StudentLookUp {
	public StudentLookUp()
	{
		System.out.println("I am studend con");
	}
}


// bean class ahe with con ani protype scope 
//mhnje apn ya class che multipal object bnu shkto