package com.cetc.thread;

/**
 * 多线程实现Runnable接口
 * @author	吴明涛
 * @phone	17346519691
 * @email	wmtxg@126.com
 * @time 	2019年5月6日 下午3:12:54
 */
public class Thread_implements implements Runnable{

	public void run() {
		System.out.println("running!");
	}

	public static void main(String[] args) {
		Runnable runnable = new Thread_implements();
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("run over!");
	}

}
