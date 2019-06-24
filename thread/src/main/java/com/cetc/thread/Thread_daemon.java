package com.cetc.thread;

public class Thread_daemon extends Thread{

	private int i = 0;
	
	@Override
	public void run() {
		try {
			while(true) {
				i++;
				System.out.println("i=" + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		try {
			Thread thread = new Thread_daemon();
			thread.setDaemon(true);
			thread.start();
			Thread.sleep(5000);
			System.out.println("我离开，thread对象也不再打印了！");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
