package org.springAnnotation.ClientApp;

import org.springAnnotation.Config.TestConfig;
import org.springAnnotation.bean.Showroom;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShowroomApp {

	public static void main(String[] args) {
		
		//lose couping using Primary annoatation
		AnnotationConfigApplicationContext cn=new AnnotationConfigApplicationContext(TestConfig.class);
		Showroom sh=(Showroom) cn.getBean("sh");
		sh.show();
	}

}
