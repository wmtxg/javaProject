package com.cetc.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Thread_sleep extends Thread{

	@Override
	public void run() {
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date currentTime = new Date();
			System.out.println("run threadName = " + 
					this.currentThread().getName() + " begin " +
					format.format(currentTime));
			Thread.sleep(2000);
			currentTime = new Date();
			System.out.println("run threadName = " + 
					this.currentThread().getName() + " end " + 
					format.format(currentTime));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date currentTime = new Date();
		Thread thread = new Thread_sleep();
		System.out.println("begin = " + format.format(currentTime));
		//thread.run();
		thread.start();
		currentTime = new Date();
		System.out.println("end = " + format.format(currentTime));
	}

}
