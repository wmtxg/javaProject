package com.cetc.thread;

public class Thread_demo01 extends Thread {

	public Thread_demo01() {
		System.out.println("构造器方法的打印：" + Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		System.out.println("run方法的打印：" + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread_demo01();
		//thread.start();
		thread.run();
	}
}
