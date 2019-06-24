package com.cetc.thread.communication.demo03;

import org.omg.CORBA.PUBLIC_MEMBER;

public class C {

	private String lock;

	public C(String lock) {
		super();
		this.lock = lock;
	}
	
	public void getValue() {
		try {
			synchronized (lock) {
				/*if (ValueObject.value.equals("")) {
					lock.wait();
				}*/
				while(ValueObject.value.equals("")) {
					System.out.println("消费者 " + Thread.currentThread().getName() + 
							" Waiting 了");
					lock.wait();
				}
				System.out.println("消费者  " + Thread.currentThread().getName() + 
						" RUNNABLE 了");
				System.out.println("get的值是：" + ValueObject.value);
				ValueObject.value = "";
				lock.notify();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
