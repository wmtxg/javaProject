package com.cetc.thread;

public class Thread_getId extends Thread{

	@Override
	public void run() {
		try {
			System.out.println("run threadName = " + 
					this.currentThread().getName() + " begin");
			Thread.sleep(2000);
			System.out.println("run threadName = " + 
					this.currentThread().getName() + " end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " " + thread.getId());

	}

}
