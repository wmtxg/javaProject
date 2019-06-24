package com.cetc.thread.synchroniz.demo2;

public class Service {

	private volatile boolean isContinueRun = true;
	/*public void runMethod() {
		String str = new String();
		while(isContinueRun) {
			synchronized (str) {
				
			}
		}
		System.out.println("停下来了！");
	}*/
	public void runMethod() {
		while(isContinueRun) {
		}
		System.out.println("停下来了！");
	}
	public void stopMethod() {
		isContinueRun = false;
	}
}
