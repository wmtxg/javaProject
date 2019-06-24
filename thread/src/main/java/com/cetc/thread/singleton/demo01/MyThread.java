package com.cetc.thread.singleton.demo01;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
