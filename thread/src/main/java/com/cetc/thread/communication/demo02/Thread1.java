package com.cetc.thread.communication.demo02;

public class Thread1 extends Thread{

	private Object lock;

	public Thread1(Object lock) {
		super();
		this.lock = lock;
	}
	
	@Override
	public void run() {
		try {
			synchronized (lock) {
				if(MyList.size() != 5) {
					System.out.println("wait begin " + 
							System.currentTimeMillis());
					lock.wait();
					System.out.println("wait end " + 
							System.currentTimeMillis());
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("出现异常了，因为呈wait状态的线程被interrupt了！");
		}
	}
}
