package com.cetc.thread.communication.demo05;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Setup {

	public static void main(String[] args) {
        BlockingQueue<Object> q = new ArrayBlockingQueue<Object>(10);
        Donwload p = new Donwload(q);
        Player c1 = new Player(q);
        Player c2 = new Player(q);
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
    }
	
}
