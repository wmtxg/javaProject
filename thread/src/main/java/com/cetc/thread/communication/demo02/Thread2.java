package com.cetc.thread.communication.demo02;

public class Thread2 extends Thread{

	private Object lock;

	public Thread2(Object lock) {
		super();
		this.lock = lock;
	}
	
	@Override
	public void run() {
		try {
			synchronized (lock) {
				for(int i=0; i<10; i++) {
					MyList.add();
					if(MyList.size() == 5) {
						lock.notify();
						System.out.println("已结发出通知！");
					}
					System.out.println("添加了" + (i+1) + "个元素");
					Thread.sleep(500);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
