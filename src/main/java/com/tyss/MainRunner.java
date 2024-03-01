package com.tyss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainRunner {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Student s=context.getBean(Student.class);
	
		System.out.println(context);
		System.out.println(s);
		
	}
}
