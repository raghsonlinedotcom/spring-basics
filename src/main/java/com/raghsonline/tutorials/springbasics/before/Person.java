/**
 * 
 */
package com.raghsonline.tutorials.springbasics.before;

/**
 * @author raghavan.muthu
 *
 */
public class Person 
{
	private String name;
	
	private Vehicle vehicle;
	
	public void drive()
	{
		vehicle.drive();
	}
	
	public Person(String name, Vehicle vehicle)
	{
		this.name = name;
		this.vehicle = vehicle;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the vehicle
	 */
	public Vehicle getVehicle() {
		return vehicle;
	}

	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
