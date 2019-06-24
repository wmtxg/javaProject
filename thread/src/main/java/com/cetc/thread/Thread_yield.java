package com.cetc.thread;

public class Thread_yield extends Thread{

	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		int count = 0;
		for(int i=0; i<5000000; i++) {
			Thread.yield();
			count++;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("用时：" + (endTime - beginTime) + 
				"毫秒！");
	}
	
	public static void main(String[] args) {

		Thread thread = new Thread_yield();
		thread.start();

	}

}
