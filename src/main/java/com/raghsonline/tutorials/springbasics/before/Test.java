/**
 * 
 */
package com.raghsonline.tutorials.springbasics.before;

/**
 * @author raghavan.muthu
 *
 */
public class Test 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Vehicle vehicle = new FourWheeler();
		String name = "Arun";
		
		Person arun = new Person(name, vehicle);
		arun.drive();
	}

}
