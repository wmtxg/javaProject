package com.cetc.thread.communication.demo04;

public class ThreadC extends Thread{

	private C c;

	public ThreadC(C c) {
		super();
		this.c = c;
	}
	
	@Override
	public void run() {
		while(true) {
			c.popService();
		}
	}
}
