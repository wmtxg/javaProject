package com.cetc.thread.synchroniz.demo;

public class Run {

	public static void main(String[] args) {
		Task task = new Task();
		Thread thread1 = new MyThread1(task);
		thread1.start();
		Thread thread2 = new MyThread2(task);
		thread2.start();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		long beginTime = CommonUtils.beginTime2 < CommonUtils.beginTime1 ? 
				CommonUtils.beginTime2 : CommonUtils.beginTime1;
		long endTime = CommonUtils.endTime2 > CommonUtils.endTime1 ? 
				CommonUtils.endTime2 : CommonUtils.endTime1;
		System.out.println(beginTime);
		System.out.println(endTime);
		System.out.println((endTime - beginTime)/1000);
		long time = (endTime - beginTime)/1000;
		System.out.println("耗时：" + time);
		
	}
}
