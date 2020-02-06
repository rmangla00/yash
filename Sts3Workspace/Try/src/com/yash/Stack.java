package com.yash;

import java.util.Arrays;

public class Stack<T> {
 
	private int currentElementPosition = 0;
	private Object[] elements;
	private int INITIAL_SIZE = 10;
 
	/**
	 * Constructor which initializes the array to be used as the stack
	 */
	public Stack() {
		elements = new Object[INITIAL_SIZE];
	}
 
	/**
	 * Pop operation which retrieves topmost element from the stack
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T pop() {
		// retrieve top most element
		T t = (T) elements[--currentElementPosition];
		// empty its position
		elements[currentElementPosition] = null;
		return t;
	}
 
	/**
	 * Push operation which adds item to the stack
	 * 
	 * @param elementToPush
	 */
	public void push(T elementToPush) {
		// check if array is full
		if (currentElementPosition == elements.length) {
			expandSize();
		}
		elements[currentElementPosition++] = elementToPush;
	}
 
	public int size() {
		return currentElementPosition;
	}
 
	/**
	 * Increases the size of the array by double its existing size
	 */
	private void expandSize() {
		int increasedSize = elements.length * 2;
		// create a new array with double size and copy existing contents into it
		elements = Arrays.copyOf(elements, increasedSize);
	}
	
	
	@Override
	public String toString() {
		return "Stack [elements=" + Arrays.toString(elements) + "]";
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.pop();
		System.out.println(st);
	}
	
	
	
}