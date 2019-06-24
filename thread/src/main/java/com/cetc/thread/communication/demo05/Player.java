package com.cetc.thread.communication.demo05;

import java.util.concurrent.BlockingQueue;

public class Player implements Runnable{

	private final BlockingQueue<Object> queue;
    public Player(BlockingQueue<Object> q) {
        queue = q;
    }
    
	public void run() {
		try {
            while (true) {
                consume(queue.take());
            }
        } catch (InterruptedException ex) {
        }
	}
	
	void consume(Object x) {
        System.out.println("播放"+x);
    }

}
