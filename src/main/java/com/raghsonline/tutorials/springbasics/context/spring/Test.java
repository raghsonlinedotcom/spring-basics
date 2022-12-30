/**
 * 
 */
package com.raghsonline.tutorials.springbasics.context.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author raghavan.muthu
 *
 */
public class Test {

	public static void main(String[] args) 
	{	
		// Step 1. Get hold of the Spring Context (Container)
		AnnotationConfigApplicationContext ac = 
				new AnnotationConfigApplicationContext();
		
		// Step 2. Inform Spring that where to look for the classes (scan the packages)
		ac.scan("com.raghsonline.tutorials.springbasics.context.spring");
		
		// Step 3. Refresh the context scope (so that Spring adjusts the metadata)
		ac.refresh();
		
		// Step 4. Retrieve the Spring Bean (now the Java object becomes a Spring Bean)
		Object obj = ac.getBean("vehicle");
		
		// You still don't have the Bean of the right type/class. Downcast it. 
		Vehicle vehicle = (Vehicle) obj;
		
		System.out.println("Vehicle Object from Spring Context : " + vehicle);
		
		ac.close();
		
		Person p = new Person("Spring", vehicle);
		System.out.println("Person object managed by the Developer : " + p);
	}
}
