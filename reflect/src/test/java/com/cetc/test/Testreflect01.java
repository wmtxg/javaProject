package com.cetc.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Testreflect01 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		Class<?> l = list.getClass();
		Method add = l.getDeclaredMethod("add", Object.class);
		add.invoke(list, 100);
		System.out.println(list);
	}

}
