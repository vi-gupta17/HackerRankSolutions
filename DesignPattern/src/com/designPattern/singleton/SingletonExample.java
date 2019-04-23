/**
 * 
 */
package com.designPattern.singleton;

/**
 * @author vivekgupta
 *
 */
public class SingletonExample {

	private static volatile  SingletonExample singletonExampleDoubleCheck = null;
	private SingletonExample() {
		
	}
	
	public static SingletonExample getInstance() {
		if(singletonExampleDoubleCheck == null) {
			synchronized (SingletonExample.class) {
				if(singletonExampleDoubleCheck == null) {
					singletonExampleDoubleCheck = new SingletonExample();
				}
			}
		}
	return 	singletonExampleDoubleCheck;
	}
}
