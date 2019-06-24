package com.cetc.thread.communication.demo01;

public class Test {

	public static void main(String[] args) {
		try {
			Object lock = new Object();
			Thread thread1 = new MyThread1(lock);
			thread1.start();
			Thread.sleep(3000);
			Thread thread2 = new MyThread2(lock);
			thread2.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
