/**
 * 
 */
package com.raghsonline.tutorials.springbasics.context.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author raghavan.muthu
 *
 */
public class Test3 {

	public static void main(String[] args) 
	{
		try (AnnotationConfigApplicationContext ac = 
				new AnnotationConfigApplicationContext()) 
		{
			ac.scan("com.raghsonline.tutorials.springbasics.context.spring");
			
			ac.refresh();
			
			Vehicle v = ac.getBean("vehicle", Vehicle.class);
			System.out.println("Vehicle Bean managed by Spring Context : " + v);
			
			Person p = new Person("Arun", v);
			System.out.println("Person object managed by the Developer : " + p);
			
		} catch (BeansException | IllegalStateException e) {
			System.err.println("Exception occurred while managing " 
						+ "the AnnotationConfigApplicationContext in Spring");
			System.err.println("Exception Message : " + e.getMessage());
			System.err.println("Exception Type : " + e.getClass().getName());
			e.printStackTrace();
		}
	}
}
