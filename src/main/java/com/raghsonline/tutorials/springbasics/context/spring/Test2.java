/**
 * 
 */
package com.raghsonline.tutorials.springbasics.context.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author raghavan.muthu
 *
 */
public class Test2 {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ac = 
				new AnnotationConfigApplicationContext();
		
		ac.scan("com.raghsonline.tutorials.springbasics.context.spring");
		
		ac.refresh();
		
		Vehicle v = ac.getBean("vehicle", Vehicle.class);
		System.out.println("Vehicle directly referred from Spring Context " 
					+ "(w/o downcasting) : " + v);
		
		ac.close();

	}

}
