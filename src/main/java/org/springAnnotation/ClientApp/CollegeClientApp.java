package org.springAnnotation.ClientApp;

import org.springAnnotation.Config.TestConfig;
import org.springAnnotation.bean.Clg;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollegeClientApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext cn=new AnnotationConfigApplicationContext(TestConfig.class);
		Clg clg=(Clg) cn.getBean("clg");
		clg.show();
	}
}
