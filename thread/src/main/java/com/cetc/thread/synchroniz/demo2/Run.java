package com.cetc.thread.synchroniz.demo2;

public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			Thread threadA = new ThreadA(service);
			threadA.start();
			System.out.println("准备发起停止命令了！");
			Thread.sleep(5000);
			Thread threadB = new ThreadB(service);
			threadB.start();
			System.out.println("已经发起停止命令了！");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
