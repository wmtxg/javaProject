package com.cetc.test;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

import com.cetc.reflect.entity.Child;

public class Testreflect02 {

	public static void main(String[] args) throws Exception {
		// 获取子类
		Class<?> child = Class.forName("com.cetc.reflect.entity.Child");
		// 得到父类
		Class<?> superclass = child.getSuperclass();
		// 得到父类非继承的所有方法
		Method[] methods = superclass.getDeclaredMethods();
		// 设置私有方法可以被访问
		AccessibleObject.setAccessible(methods, true);
		for (Method m : methods) {
			System.out.println();
			System.out.println("子类调用方法" + m.getName() + "()的调用结果：");
			m.invoke(new Child());
		}
	}
}
