/**
 * 
 */
package com.designPattern.singleton.factorypattern;

/**
 * @author vivekgupta
 *
 */
public class Skirt implements Dress {

	
	@Override
	public String makeDress(String color, String size, String clothType) {
		return "Skirt will be "+ color +"," + size+" and would be made by " + clothType;
	}
}
