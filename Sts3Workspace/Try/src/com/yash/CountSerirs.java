package com.yash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountSerirs {

	public static void main(String[] args) {

		System.out.println("hello");
		List<Integer> arr = Arrays.asList(1, 2, 4, 6, 8, 3, 4, 3, 2, 2, 7, 12, 14, 16, 1, 4, 8);

		HashMap<Integer, List<Integer>> result = new HashMap<Integer, List<Integer>>();
		int sum = 0;

		int count = 0;
		for (Integer integer : arr) {
			if (integer % 2 == 0) {
				count++;
			} else {
				if (count >= 3) {
					sum++;
				}
				count = 0;
			}
		}

		System.out.println(sum);
	}
}
