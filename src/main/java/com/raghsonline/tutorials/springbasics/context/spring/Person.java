/**
 * 
 */
package com.raghsonline.tutorials.springbasics.context.spring;

/**
 * @author raghavan.muthu
 *
 */
public class Person 
{
	String name;
	
	Vehicle v;
	
	public Person()
	{
		System.out.println("Person class is instantiated - Default Constructor");
		name = "Default";
		v = null;
	}
	
	public Person(String name)
	{
		System.out.println("Person class is instantiated - Parameterized Constructor");
		this.name = name;
		this.v = null;
	}
	
	public Person(String name, Vehicle v)
	{
		System.out.println("Person class is instantiated - Parameterized 2 Arg Constructor");
		this.name = name;
		this.v = v;
	}

	@Override
	public String toString() 
	{
		return "Person [" + ""
				+ "hashCode()=" + hashCode() 
				+ ", name=" + name
				+ ", \n\t....vehicle=" + v
				+ "]";
	}
	
	

}
