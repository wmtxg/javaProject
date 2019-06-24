package com.cetc.thread;

public class Thread_isAlive extends Thread{

	@Override
	public void run() {
		System.out.println("run = " + this.isAlive());
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread_isAlive();
		System.out.println("begin == " + thread.isAlive());
		thread.start();
		System.out.println("end == " + thread.isAlive());
	}

}
