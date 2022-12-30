/**
 * 
 */
package com.raghsonline.tutorials.springbasics.context.developer;

/**
 * @author raghavan.muthu
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("Car");
		
		Person p1 = new Person();
		Person p2 = new Person("Karthik");
		
		System.out.println("Vehicle #1 : " + v1);
		System.out.println("Vehicle #2 : " + v2);
		
		System.out.println("Person #1 : " + p1);
		System.out.println("Person #2 : " + p2);
	}
}
