/**
 * 
 */
package com.designPattern.singleton.factorypattern;

/**
 * @author vivekgupta
 *
 */
public class Shirt implements Dress{

	@Override
	public String makeDress(String color, String size, String clothType) {
		return "Shirt will be "+ color +"," + size+" and would be made by " + clothType;
	}

}
