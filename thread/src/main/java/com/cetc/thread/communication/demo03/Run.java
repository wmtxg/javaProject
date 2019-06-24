package com.cetc.thread.communication.demo03;

public class Run {

	private static final Runnable P = null;

	public static void main(String[] args) {
		try {
			String lock = "";
			P p = new P(lock);
			C c = new C(lock);
			/*ThreadP threadP = new ThreadP(p);
			ThreadC threadC = new ThreadC(c);
			threadP.start();
			threadC.start();*/
			ThreadP[] threadPs = new ThreadP[2];
			ThreadC[] threadCs = new ThreadC[2];
			for(int i=0; i<2; i++) {
				threadPs[i] = new ThreadP(p);
				threadPs[i].setName("生产者" + (i+1));
				threadCs[i] = new ThreadC(c);
				threadCs[i].setName("消费者" + (i+1));
				threadPs[i].start();
				threadCs[i].start();
			}
			Thread.sleep(5000);
			Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
			Thread.currentThread().getThreadGroup().enumerate(threadArray);
			for(int i=0; i<threadArray.length; i++) {
				System.out.println(threadArray[i].getName() + " " + threadArray[i].getState());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}
