package com.ust.ioc2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.ust.ioc.Connection;
import com.ust.ioc.Login;

public class TestDrawing {
	
	public static void main(String[] args) {
//		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
//		
//		Object obj2=factory.getBean("line");
//		Line l=(Line)obj2; //downcasting object to login
//		l.drawline();
		
		//ClassPathXmlApplicationContext context= 
//		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		context.registerShutdownHook();
		boolean exists=context.containsBean("line");
		System.out.println(exists);
		if(exists) {
			Object object=context.getBean("line");
			if(object instanceof Line) {
				Line line=(Line)object;
				line.drawline();
			}
		}
		boolean type=context.isSingleton("line");
		System.out.println(type);
		/*
		 * Object obj1=context.getBean("line"); Object obj2=context.getBean("line");
		 * if(obj1.hashCode()==obj2.hashCode()) {
		 * System.out.println("Line is Singleton"); } else {
		 * System.out.println("Line is not a Singleton"); }
		 */
		Line line1=(Line)context.getBean("line");
		Line line2=(Line)context.getBean("line");
		if(line1.hashCode()==line2.hashCode()) {
			System.out.println("Line is Singleton");
		}
		else
		{
			System.out.println("Line is not a Singleton");
		}
		
	}

}