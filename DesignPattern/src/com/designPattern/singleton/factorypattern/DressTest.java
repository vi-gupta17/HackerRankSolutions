/**
 * 
 */
package com.designPattern.singleton.factorypattern;

/**
 * @author vivekgupta
 *
 */
public class DressTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DressFactory dressFactory = new DressFactory();
		
		System.out.println("Make Skirt for my daugther");
		System.out.println(dressFactory.makeDress("skirt", "Small", "red", "nylon"));
		
		System.out.println("Make Skirt for my wife");
		System.out.println(dressFactory.makeDress("skirt", "Medium", "red", "nylon"));
		
		System.out.println("Make Shirt for Me");
		System.out.println(dressFactory.makeDress("shirt", "Medium", "white", "cotton"));
		
		System.out.println("Make trouser for Me");
		System.out.println(dressFactory.makeDress("trouser", "Small", "black", "tericot"));
		
		System.out.println("Make shirt for my wife");
		System.out.println(dressFactory.makeDress("female shirt", "Small", "black", "tericot"));
	}

}
