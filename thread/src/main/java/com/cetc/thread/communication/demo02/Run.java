package com.cetc.thread.communication.demo02;

public class Run {

	public static void main(String[] args) {
		try {
			Object lock = new Object();
			Thread1 thread1 = new Thread1(lock);
			thread1.start();
			Thread.sleep(50);
			Thread2 thread2 = new Thread2(lock);
			thread2.start();
			thread1.interrupt();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
