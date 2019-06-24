package com.cetc.thread.communication.demo03;

public class P {

	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}
	
	public void setValue() {
		try {
			synchronized (lock) {
				/*if(!ValueObject.value.equals("")) {
					lock.wait();
				}*/
				while(!ValueObject.value.equals("")) {
					System.out.println("生产者 " + Thread.currentThread().getName() + 
							" Waiting 了");
					lock.wait();
				}
				System.out.println("生产者 " + Thread.currentThread().getName() + 
						" RUNNABLE 了");
				String value = System.currentTimeMillis() + "_" + System.nanoTime();
				ValueObject.value = value;
				System.out.println("set的值是：" + value);
				Thread.sleep(500);
				lock.notify();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
