/**
 * 
 */
package com.designPattern.singleton.factorypattern;

/**
 * @author vivekgupta
 *
 */
public class Trousers implements Dress {
	@Override
	public String makeDress(String color, String size, String clothType) {
		return "Trouser will be "+ color +"," + size+" and would be made by " + clothType;
	}
}
