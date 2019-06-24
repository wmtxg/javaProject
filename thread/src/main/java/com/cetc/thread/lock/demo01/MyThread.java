package com.cetc.thread.lock.demo01;

public class MyThread extends Thread{

	private MyService myService;

	public MyThread(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		myService.testMethod();
	}
}