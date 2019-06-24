package com.cetc.thread;

public class Thread_interrupted extends Thread {

	@Override
	public void run() {
		super.run();
		for(int i=0; i<50000; i++) {
			if(this.interrupted()) {
				System.out.println("已经是停止状态了！我要退出！");
				break;
			}
			System.out.println("i = " + (i + 1));
		}
	}
	
	public static void main(String[] args) {
		try {
			Thread thread = new Thread_interrupted();
			thread.start();
			Thread.sleep(20);
			thread.interrupt();
		} catch (Exception e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end !");
	}
}
