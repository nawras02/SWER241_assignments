package edu.bu.datastructures.list;

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
		return elements[i];
	}

	public void set(int i, T x) {
		// TODO: check if i>= size? i<0?-->throw exception. size exceeds the array
		// capacity?-->resize the array. not allowed
		elements[i] = x;
	}

	public void add(int i, T x) {
		// TODO: check if capacity allows addition and resize the array if needed. Check
		// if i>=size-> throw exception
		shiftForwards(i);
		elements[i] = x;
		size++;
	}

	public void add(T x) {
		// TODO: check if capacity allows addition and resize the array if needed
		elements[size] = x;
		size++;
	}

	private void shiftForwards(int startShiftingIndex) {
		for (int i = size; i > startShiftingIndex; i--) {
			elements[i] = elements[i - 1];
		}
	}

	public T remove(int i) {
		// TODO: do bounds check (i>size? data is empty?--? throw exception)
		T x = elements[i];
		shiftBack(i);
		size--;
		return x;
	}

	private void shiftBack(int startShiftingIndex) {
		for (int i = startShiftingIndex; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
	}

}
