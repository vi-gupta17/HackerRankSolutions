/**
 * 
 */
package com.designPattern.singleton.factorypattern;

/**
 * @author vivekgupta
 *
 */
public interface Dress {
	public static final String COLOR = null;
	public static final String  SIZE = null;
	public static final String CLOTHTYPE = null;
	
	public String makeDress(String color, String size, String clothType);
}
