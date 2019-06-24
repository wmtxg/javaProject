package com.cetc.reflect.entity;

public class Parent {

	public Parent() {
		System.out.println("调用父类构造方法！");
	}

	@SuppressWarnings("unused")
	private static void staticParent() {
		System.out.println("调用父类静态方法！");
	}

	@SuppressWarnings("unused")
	private final void finalParent() {
		System.out.println("调用父类final方法！");
	}

	@SuppressWarnings("unused")
	private void privateParent() {
		System.out.println("调用父类私有方法！");
	}

}
