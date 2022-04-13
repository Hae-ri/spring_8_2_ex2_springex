package com.javatest.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	AdminConnection adminC = ctx.getBean("adminConfig", AdminConnection.class);
	
	
	System.out.println("adminID : " + adminC.getAdminId());
	System.out.println("adminPW : " + adminC.getAdminPw());
	System.out.println("sub_adminID : " + adminC.getSub_adminId());
	System.out.println("sub_adminPW : " + adminC.getSub_adminPw());
	
	ctx.close();
	}
}
