package com.cetc.thread;

/**
 * 多线程继承Thread类
 * @author	吴明涛
 * @phone	17346519691
 * @email	wmtxg@126.com
 * @time 	2019年5月6日 下午3:10:01
 */
public class Thread_extends extends Thread{

	@Override
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("run = " + Thread.currentThread().getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			Thread_extends thread = new Thread_extends();
			thread.setName("Extends_thread");
			thread.start();
			for(int i=0; i<10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("main = " + Thread.currentThread().getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
