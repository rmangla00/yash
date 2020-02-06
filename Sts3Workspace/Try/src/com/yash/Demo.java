package com.yash;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

}

public class Demo {

	public static void main(String args[]) {

		/*
		 * List<Integer> list = new ArrayList<Integer>();
		 * 
		 * list.add(55); list.add(10); list.add(368); list.add(22); list.add(13);
		 * list.add(16); list.add(1000);
		 * 
		 */

//		Integer max = list.stream().max(Integer::compare).get();

//		System.out.println(getNextInSeries(Arrays.asList(7, 10, 8, 11, 9)));

//		System.out.println(capitalizeFirstAndLastCharcter(""));

//		System.out.println(max);

//		System.out.println(checkSpyNumber(1421));
//		System.out.println(factorial(4));

		/*
		 * Node linkedList = new Node(1); linkedList.next = new Node(2);
		 * linkedList.next.next = new Node(3); linkedList.next.next.next = new Node(4);
		 * linkedList.next.next.next.next = new Node(5);
		 * linkedList.next.next.next.next.next = linkedList.next;
		 * System.out.println("before");
		 * System.out.println(countLengthOfLoop(linkedList));
		 * System.out.println("after");
		 * 
		 */
		/*
		 * HashMap<String, Integer> map = new HashMap<>(); map.put("rakesh", 101);
		 * map.put("rajat", 105); map.put("nikhil", 102); map.put("bhaskar", 104);
		 * map.put("preena", 115); map.put("mitali", 110); map.put("mayank", 109);
		 * 
		 * // System.out.println(map);
		 * 
		 * sortHashMapByValue(map);
		 */

		/*
		 * List<Integer> numbers = Arrays.asList(10, 20, 30, 11, 20, 33, 4, 44, 55, 20);
		 * Map<Integer, Integer> numbersMap =
		 * numbers.stream().collect(Collectors.toMap(n -> n, n -> n, (old, nw) -> nw));
		 * System.out.println(numbersMap);
		 */

		String inputString = "iamyashemployee";
		Map<String, Integer> frequencies = inputString.chars().mapToObj(c -> (char) c).collect(
				Collectors.toMap(k -> k.toString(), v -> 1, Integer::sum, LinkedHashMap<String, Integer>::new)); // counting
		System.out.println("Fre " + frequencies);
		String result = frequencies.entrySet().stream().map(e -> {
			if (e.getValue() == 1)
				return e.getKey().toString();
			else
				return e.getKey().toString() + e.getValue().toString();
		}).collect(Collectors.joining(""));
		System.out.println(result);
	}

	public static void sortHashMapByValue(HashMap<String, Integer> map) {

		Map<String, Integer> sorted = map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		sorted.entrySet().forEach(System.out::println);

	}

	// Returns count of nodes present in loop.
	static int countNodes(Node n) {
		int res = 1;
		Node temp = n;
		while (temp.next != n) {
			res++;
			temp = temp.next;
		}
		return res;
	}

	public static int countLengthOfLoop(Node list) {

		Node slow = list, fast = list;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return countNodes(slow);
		}

		return 0;
	}

	public static int getNextInSeries(List<Integer> series) {

		int nextElement = series.get(0);
		for (int i = 1; i < series.size() + 1; i++) {
			if (i % 2 == 0) {
				nextElement -= 2;
			} else {
				nextElement += 3;
			}
			if (i > series.size())
				break;
		}
		return nextElement;
	}

	static int factorial1(int number) {
		int fact = 1;
		for (int i = 1; i < number - 1; i++) {
			fact = fact * i;
		}
		return fact;
	}

	static int factorial(int number) {
		if (number == 1)
			return 1;
		else
			return number * factorial(number - 1);
	}

	public static boolean checkSpyNumber(int input) {

		int sumOfDigits = 0;
		int multiplicationOfDigits = 1;

		while (input > 0) {
			int number = input % 10;
			sumOfDigits += number;
			multiplicationOfDigits *= number;
			input /= 10;
		}
		if (sumOfDigits == multiplicationOfDigits)
			return true;
		else
			return false;
	}

	public static String capitalizeFirstAndLastCharcter(String inputString) {

		String[] words = inputString.split(" ");

		String resultantString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			int length = word.length();
			word = word.substring(0, 1).toUpperCase() + word.substring(1, length - 1)
					+ word.substring(length - 1).toUpperCase();
			resultantString += word;
			if (i < words.length - 1)
				resultantString += " ";
		}
		return resultantString;
	}

}