package com.yash;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class A {
	void m1() {
		System.out.println("1");
	}
}

class B extends A {

	void m1() {
		System.out.println("2");
	}
}

class C extends B {

	void m1() {
		System.out.println("3 Inside Child...");
	}
}
interface Aa{
	void show();
}
interface Bb{
	void show();
}
abstract class AAA implements Aa, Bb{
	
}
public class Test1 {
	public static void main(String[] args) {

		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("2")) {
				myMap.remove("1");
				// myMap.put("4", "4");
			}
		}
		
	}
}