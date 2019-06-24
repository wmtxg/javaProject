package com.cetc.thread.communication.demo05;

import java.util.concurrent.BlockingQueue;

public class Donwload implements Runnable{

	private final BlockingQueue<Object> queue;
    public Donwload(BlockingQueue<Object> q) {
        queue = q;
    }
    
	public void run() {
		try {
            while (true) {
                System.out.println("下载视频数据"+index);
                queue.put(produce());                
            }
        } catch (InterruptedException ex) {
        
        }
    }
	
	int index=0;
    public Object produce() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "视频数据"+index++;
    }

}
