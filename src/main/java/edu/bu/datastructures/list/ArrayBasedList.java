package edu.bu.datastructures.list;

import java.util.Arrays;

public class ArrayBasedList<T> implements List<T> {
	private static final int DEFAULT_CAPACITY = 20;
	private T[] elements;
	private int size;

	public ArrayBasedList() {
		this(DEFAULT_CAPACITY);
	}

	public ArrayBasedList(int capacity) {
		elements = (T[]) new Object[capacity];
	}

	public int size() {
		return size;
	}

	public T get(int i) {
		// TODO:do bounds check (negative i? empty data? i>size?)->throw exception.
		if (i > elements.length || i < 0) {
			throw new IllegalArgumentException("illegal argument");
		} else if (size == 0) {
			throw new IllegalArgumentException("There is no data to present");
		}
		return elements[i];
	}

	public void set(int i, T x) {
		// TODO: check if i>= size? i<0?-->throw exception. size exceeds the array
		if (i >= elements.length || i < 0) {
			throw new IllegalArgumentException("illegal argument");
		} else {
			elements[i] = x;
		}
	}

	public void add(int i, T x) {
		// TODO: check if capacity allows addition and resize the array if needed. Check
		// if i>=size-> throw exception
		if (i < 0) {
			throw new IllegalArgumentException("illegal argument");
		} else if (i < size) {
			shiftForwards(i);
			elements[i] = x;
			size++;
		} else if (i < elements.length) {
			elements[i] = x;
			size++;
		} else {
			resize();
			elements[i] = x;
			size++;
		}
	}

	public void add(T x) {
		// TODO: check if capacity allows addition and resize the array if needed
		if (size < DEFAULT_CAPACITY) {
			elements[size] = x;
			size++;
		} else {

			elements = Arrays.copyOf(elements, elements.length*2);
			/*elements[size] = x;
			size++;*/
			add(elements.length, x);
		}

	}

	private void shiftForwards(int startShiftingIndex) {
		for (int i = size; i > startShiftingIndex; i--) {
			elements[i] = elements[i - 1];
		}
	}

	public T remove(int i) {
		// TODO: do bounds check (i>size? data is empty)

		if (size == 0 || i > size) {
			throw new IllegalArgumentException("There is no data to remove");
		} else {
			T x = elements[i];
			shiftBack(i);
			size--;
			return x;
		}
	}

	private void shiftBack(int startShiftingIndex) {
		for (int i = startShiftingIndex; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
	}

	private void resize() {
		/*int newSize = size * 2;
		T[] elements1 = (T[]) new Object[newSize];
		for (int i = 0; i < elements.length; i++) {
			elements1[i] = elements[i];
		}*/
	}

}
