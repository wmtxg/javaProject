package com.cetc.thread.synchroniz.demo;

public class Task {

	private String gatData1;
	private String gatData2;
	
	/*public synchronized void doLongTimeTask() {
		try {
			System.out.println("begin task");
			Thread.sleep(3000);
			gatData1 = "长时间处理任务后从远程返回的值1 threadName=" + 
					Thread.currentThread().getName();	
			gatData2 = "长时间处理任务后从远程返回的值2 threadName=" + 
					Thread.currentThread().getName();	
			System.out.println(gatData1);
			System.out.println(gatData2);
			System.out.println("end task");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}*/
	
	/*public void doLongTimeTask() {
		try {
			System.out.println("begin task");
			Thread.sleep(3000);	
			String data1 =  "长时间处理任务后从远程返回的值1 threadName=" + 
					Thread.currentThread().getName();
			String data2 = "长时间处理任务后从远程返回的值2 threadName=" + 
					Thread.currentThread().getName();	
			synchronized (this) {
				gatData1 = data1;
				gatData2 = data2;
			}
			System.out.println(data1);
			System.out.println(data2);
			System.out.println("end task");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}*/
	
	public void doLongTimeTask() {
		for(int i=0; i<100; i++) {
			System.out.println("nosynchronized threadName=" + 
					Thread.currentThread().getName() + "i=" + (i+1));
		}
		System.out.println("");
		synchronized (this) {
			for(int i=0; i<100; i++) {
				System.out.println("synchronized threadName=" + 
						Thread.currentThread().getName() + "i=" + (i+1));
			}
		}
	}
	
}
