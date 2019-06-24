package com.cetc.thread.singleton.demo01;

/**
 * 单例模式（饿汉模式）
 * @author	吴明涛
 * @phone	17346519691
 * @email	wmtxg@126.com
 * @time 	2019年5月7日 下午5:55:28
 */
public class MyObject {

	private static MyObject myObject = new MyObject();
	
	private MyObject() {
		
	}
	
	public static MyObject getInstance() {
		return myObject;
	}
}
