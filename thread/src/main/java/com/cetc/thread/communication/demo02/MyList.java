package com.cetc.thread.communication.demo02;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private static List<String> list = new ArrayList<String>();
	
	public static void add() {
		list.add("str");
	}
	
	public static int size() {
		return list.size();
	}
}
