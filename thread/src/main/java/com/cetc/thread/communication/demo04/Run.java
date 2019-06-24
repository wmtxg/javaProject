package com.cetc.thread.communication.demo04;

public class Run {

	public static void main(String[] args) {
		
		MyStack myStack = new MyStack();
		P p = new P(myStack);
		C c = new C(myStack);
		ThreadP threadP = new ThreadP(p);
		ThreadC threadC = new ThreadC(c);
		threadP.start();
		threadC.start();
	}
}
