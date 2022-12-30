/**
 * 
 */
package com.raghsonline.tutorials.springbasics.context.developer;

/**
 * @author raghavan.muthu
 *
 */
public class Person 
{
	String name;
	
	public Person()
	{
		System.out.println("Person class is instantiated - Default Constructor");
		name = "Default";
	}
	
	public Person(String name)
	{
		System.out.println("Person class is instantiated - Parameterized Constructor");
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Person [" + ""
				+ "hashCode()=" + hashCode() 
				+ ", name=" + name + "]";
	}
	
	

}
