package edu.bu.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.datastructures.list.ArrayBasedList;
import edu.bu.datastructures.list.LinkedList;
import edu.bu.datastructures.list.LinkedList.Node;

public class LinkedListTest {
	@Test
	public void testSizeOfEmptyList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertEquals(0, list.size());
	}

	@Test
	public void testSizeOfList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		assertEquals(2, list.size());
	}

	@Test(expected = Exception.class)
	public void testAddingToList(){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		assertEquals(3, (int) list.get(0));
	}

	@Test(expected = Exception.class)
	public void testAddingToListAtPosition(){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(0, 5);
		assertEquals(5, (int) list.get(0));
		assertEquals(3, (int) list.get(1));
		assertEquals(2, list.size());
	}

	@Test(expected = Exception.class)
	public void setTest(){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.set(0, 5);
		assertEquals(5, (int)list.get(0));
		}
	
	@Test(expected = Exception.class)
	public void getExeptionTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(-1, 5);
		list.get(-1);
		}
	
	@Test
	public void getTest(){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0, 5);
		list.get(0);
		assertEquals(5, (int)list.get(0));
		}
	
	@Test(expected = Exception.class)
	public void removeExceptionTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.remove(-1);	
	}
	
	@Test
	public void removeTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(4);
		list.add(6);
		list.remove(2);	
	}
	
	@Test
	public void removeFromEmptyListTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.remove(0);	
	}
	
	@Test
	public void addingToFullListTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(4);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(4);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(4);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
	}
	
	// TODO add remove test
	// TODO: add more tests 1) test removing from empty list 2)adding to full list
	// 3)add test for cases that expect exception
}
