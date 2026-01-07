package org.springAnnotation.ClientApp;

import org.springAnnotation.Config.TestConfig;
import org.springAnnotation.bean.SchoolLookUp;
import org.springAnnotation.bean.StudentLookUp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookUpAnnotationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext cn=new AnnotationConfigApplicationContext(TestConfig.class);
		
		SchoolLookUp ss=(SchoolLookUp) cn.getBean("s");	
		ss.show();
		
	}
	
}
//output
//I am studend con
//I am studend con

//are atta singleton class cha yek ch object ani tya class madhun jr apn dusra class
//cha object bnel jr prototype asel tr anek pn yethe banat nahi te solve krayal lookup
//use krto 

