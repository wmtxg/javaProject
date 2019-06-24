package com.cetc.thread.communication.demo04;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

	private List<String> list = new ArrayList<String>();
	
	synchronized public void push() {
		try {
			if(list.size() == 1) {
				this.wait();
			}
			list.add("antString= " + Math.random());
			this.notify();
			System.out.println("push=" + list.size());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	synchronized public String pop() {
		String str = "";
		try {
			if(list.size() == 0) {
				System.out.println("pop操作中的：" + 
						Thread.currentThread().getName() + 
						" 线程呈wait状态");
				this.wait();
			}
			str = list.get(0);
			list.remove(0);
			this.notify();
			System.out.println("pop=" + list.size());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return str;
	}
}
