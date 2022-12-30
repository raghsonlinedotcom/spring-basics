/**
 * 
 */
package com.raghsonline.tutorials.springbasics.before;

/**
 * @author raghavan.muthu
 *
 */
public abstract class Vehicle 
{
	private String regnNo;
	
	private String name;
	
	public abstract void drive();

	/**
	 * @return the regnNo
	 */
	public String getRegnNo() {
		return regnNo;
	}

	/**
	 * @param regnNo the regnNo to set
	 */
	public void setRegnNo(String regnNo) {
		this.regnNo = regnNo;
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


}
