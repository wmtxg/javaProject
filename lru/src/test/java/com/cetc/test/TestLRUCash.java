package com.cetc.test;

import com.cetc.lru.LRUCash;

public class TestLRUCash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCash cash = new LRUCash(3);
		cash.put("d", 1);
		cash.put("hg", 1);
		cash.put("a", 1);
		cash.put("hgf", 1);
		cash.put("hf", 1);
		System.out.println(cash);
	}

}
