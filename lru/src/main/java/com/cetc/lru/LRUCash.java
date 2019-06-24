package com.cetc.lru;

import java.util.Calendar;
import java.util.LinkedHashMap;

public class LRUCash extends LinkedHashMap<String, Object> {
	private static final long serialVersionUID = 7898909656314285374L;
	private Integer maxInitCapacity;

	public LRUCash(Integer initialCapacity) {
		super(initialCapacity, 0.75f, true);
		this.maxInitCapacity = initialCapacity;
		Calendar ca = Calendar.getInstance();
		System.out.println(ca);
	}

	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<String, Object> eldest) {
		// TODO Auto-generated method stub
		return size() > maxInitCapacity;
	}

}
