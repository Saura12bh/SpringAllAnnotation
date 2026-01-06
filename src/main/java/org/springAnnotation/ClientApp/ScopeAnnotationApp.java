package org.springAnnotation.ClientApp;

import org.springAnnotation.Config.TestConfig;
import org.springAnnotation.bean.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeAnnotationApp {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext cn=new AnnotationConfigApplicationContext(TestConfig.class);
		
		
		//defalult scope singlton  asto 
//		Student std=(Student) cn.getBean("student");
//		Student std1=(Student) cn.getBean("student");
//		Student std2=(Student) cn.getBean("student");
		
		//prototype scope atta jevhe bean call kru tevdhe object bntil
		Student std=(Student) cn.getBean("student");
		Student std1=(Student) cn.getBean("student");
		Student std2=(Student) cn.getBean("student");
	
	}
}
