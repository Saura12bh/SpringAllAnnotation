package org.springAnnotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")
//@Scope("singleton")  //lihila pn an nahi lihila pn tri ky prb yet nahi

@Scope("prototype")  //jevdhe vela call hoyl tevdhe object bntil
public class Student {

	public Student()
	{
		System.out.println("I am defalut construtor");
	}
	public Student(@Value("1") int a,@Value("20") int b)
	{
		System.out.println("a ="+a+" b= "+b);
		System.out.println("i am para");
	}
}
