package edu.bu.datastructures.list;

import java.util.EmptyStackException;

public class LinkedList<T> implements List<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;

	public LinkedList() {
	}

	public int size() {
		return size;
	}

	public T get(int i) {
		// TODO check if i<0 or i>=size--> throw exception
		if (i < 0 || i >= size) {
			throw new IllegalArgumentException("wrong index!");
		} else {
			T data = getData(i);
			return data;
		}
	}

	public void set(int index, T x) {
		// TODO: impelement the set method and its test cases
		if (index > size || index < 0) {
			throw new IllegalArgumentException("illegal argument");
		} else {
			Node<T> currData = getHead();
			int i = 0;
			while (i != index) {
				currData = currData.getNext();
				i++;
			}
			currData.setData(x);

		}
	}

	public void add(int index, T x) {
		// TODO check if dataIndex is valid
		if (index < 0 || index > size) {
			throw new IllegalArgumentException();
		} else {
			Node<T> newNode = new Node<T>();
			newNode.setData(x);

			if (index == 0) {
				addFirstPositionNode(newNode);
				return;
			}

			int i = 0;
			Node<T> currNode = getHead();
			while (i != index - 1) {
				currNode = currNode.getNext();
				i++;
			}
			newNode.setNext(currNode.getNext());
			currNode.setNext(newNode);
			size++;
		}
	}

	public void add(T x) {
		Node<T> newNode = new Node<T>();
		newNode.setData(x);
		newNode.setNext(null);
		if (size == 0) {
			setHead(newNode);
			setTail(newNode);
		} else {
			getTail().setNext(newNode);
			setTail(newNode);
		}
		size++;
	}

	public T remove(int i) {
		// TODO implement the remove method and its test case
		if (i < 0) {
			throw new IllegalArgumentException();
		}else if (i < size) {
			if (head == null) {
				return null;
			}else {
				Node<T> temp = head;
				for (int j = 0; j < i - 1; j++) {
					temp = temp.next;
					if (temp != null || temp.next != null) {
						return (T) temp.next;
					}
				}
				Node Next = temp.next.next;
				temp.next = Next;
			}
		}
		return null;
	}

	public int getSize() {
		return size;
	}

	private T getData(int index) {
		int i = 0;
		Node<T> currData = getHead();
		while (i != index) {
			currData = currData.getNext();
			i++;
		}

		return currData.data;
	}

	private void addFirstPositionNode(Node<T> newNode) {
		newNode.setNext(getHead());
		setHead(newNode);
		size++;
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	public class Node<T> {
		private T data;
		private Node<T> next;

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}
	}
}
