package org.springAnnotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("s")
public class SchoolLookUp {
	public SchoolLookUp()
	{
		System.out.println("I am Scholookup ");

	}
	
	@Lookup
	public StudentLookUp getStudentLookUp()
	{
		//ya method use krun student cha object bnvyala pn tyacha objevt spring
		//conatinr bnvto
		return null;
		//ya method logic spring container lihito tya mule apn yethe null lihito
	}
	
	public void show()
	{
		//he method jevha apn call krnar tevha student cha con call honar
		//con call mhnje tya class cha object bnvto
		StudentLookUp s1=getStudentLookUp();
		StudentLookUp s2=getStudentLookUp();
	}
	
	
}
