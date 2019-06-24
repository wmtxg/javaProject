package com.cetc.thread.singleton.demo02;

public class MyObject {

	private static MyObject myObject;
	
	private MyObject() {}
	
	public static MyObject getInstance() {
		if(myObject == null) {
			synchronized (MyObject.class) {
				if(myObject == null) {
					myObject = new MyObject();
				}
			}
		}
		return myObject;
	}
}
