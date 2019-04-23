/**
 * 
 */
package com.designPattern.singleton.factorypattern;

/**
 * @author vivekgupta
 *
 */
public class DressFactory {
	public String makeDress(String dressType, String size, String color, String clothType) {
		
		if(dressType.equalsIgnoreCase("skirt")) {
			return new Skirt().makeDress(color, size, clothType);
		} else if(dressType.equalsIgnoreCase("Shirt")) {
			return new Skirt().makeDress(color, size, clothType);
		} else if(dressType.equalsIgnoreCase("trousers")) {
			return new Skirt().makeDress(color, size, clothType);
		} else {
			return "We wont able to make " + dressType;
		}
	}
}
