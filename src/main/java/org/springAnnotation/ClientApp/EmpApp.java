package org.springAnnotation.ClientApp;

import org.springAnnotation.Config.TestConfig;
import org.springAnnotation.bean.Emp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpApp {

	public static void main(String[] args) {

		//Setter Depedency Injection   =>TestConfig.class ch lihaych
		AnnotationConfigApplicationContext cn=new AnnotationConfigApplicationContext(TestConfig.class);
		Emp emp=(Emp) cn.getBean("e");
		//Emp class cha object bnvla
		System.out.println("id ="+emp.getId()+"name ="+emp.getName());
		//jr apn tikde show method lihili asti tr emp.show() kel ast
		//id =1name =Sai

	}
}
