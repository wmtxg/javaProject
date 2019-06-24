package com.cetc.thread.communication.demo02;

public class MyRun {

	private String lock = "";
	private boolean isFirstRunB = false;
	
	private Runnable runnableA = new Runnable() {
		
		public void run() {
			try {
				synchronized (lock) {
					while(!isFirstRunB) {
						System.out.println("begin wait");
						lock.wait();
						System.out.println("end wait");
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	};
	
	private Runnable runnableB = new Runnable() {
		
		public void run() {
			synchronized (lock) {
				System.out.println("begin notify");
				lock.notify();
				System.out.println("end notify");
				isFirstRunB = true;
			}
		}
	};
	
	public static void main(String[] args) {
		
		try {
			MyRun myRun = new MyRun();
			Thread threadA = new Thread(myRun.runnableA);
			threadA.start();
			Thread.sleep(100);
			Thread threadB = new Thread(myRun.runnableB);
			threadB.start();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
