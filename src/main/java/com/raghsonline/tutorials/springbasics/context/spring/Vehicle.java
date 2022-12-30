/**
 * 
 */
package com.raghsonline.tutorials.springbasics.context.spring;

import org.springframework.stereotype.Component;

/**
 * @author raghavan.muthu
 *
 */
@Component
public class Vehicle 
{
	String name;
	
	public Vehicle()
	{
		System.out.println("Vehicle class instantiated with a Default Constructor");
		name = "Default";
	}
	
	public Vehicle(String name)
	{
		System.out.println("Vehicle class instantiated with a Parameterized Constructor");
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Vehicle [" + 
					"hashCode()=" + hashCode() 
					+ ", name=" + name + "]";
	}	
}
