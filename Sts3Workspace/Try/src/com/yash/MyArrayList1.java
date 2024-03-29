package com.yash;

public class MyArrayList1 {

	private Object[] list;
	private int actSize = 0;

	public MyArrayList1() {
		list = new Object[10];
	}

	public void add(Object obj) {
		list[actSize++] = obj;
	}

	public Object get(int index) {

		if (index < actSize) {
			return list[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public Object remove(int index) {
		if (index < actSize) {
			Object obj = list[index];
			while (index < actSize) {
				list[index++] = list[index];
				list[index] = null;
			}
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

}
