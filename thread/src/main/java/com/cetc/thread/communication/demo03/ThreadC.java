package com.cetc.thread.communication.demo03;

public class ThreadC extends Thread{

	private C c;

	public ThreadC(C c) {
		super();
		this.c = c;
	}
	
	@Override
	public void run() {
		while(true) {
			c.getValue();
		}
	}
}
