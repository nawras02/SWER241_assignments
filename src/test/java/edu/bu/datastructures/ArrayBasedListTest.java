package edu.bu.datastructures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.awt.List;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

import org.junit.Test;

import edu.bu.datastructures.list.ArrayBasedList;

public class ArrayBasedListTest {

	@Test
	public void testSizeOfEmptyList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		assertEquals(0, list.size());
	}

	@Test
	public void testAddingToList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		assertEquals(3, (int) list.get(0));
	}

	@Test
	public void testAddingToListAtPosition() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		list.add(0, 5);

		int actual = (int) list.get(0);
		assertEquals(5, actual);

		assertEquals(2, list.size());
	}

	@Test(expected = Exception.class)
	public void getTest() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(5);
		list.get(-1);
	}

	@Test
	public void setTest() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.set(0, 13);
	}

	@Test(expected = Exception.class)
	public void addByIndexExceptionTest(){
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(-1, 7);
	}

	@Test(expected = IllegalArgumentException.class)
	public void addByIndexTest() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(0, 7);
		assertEquals(7, (int) list.get(0));
	}
	
	@Test
	public void addToFullListTest() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add( 8);
		list.add( 8);
		list.add( 8);
		list.add( 8);
		list.add( 8);
		list.add( 8);
		list.add( 8);
		list.add( 8);
		list.add( 8);
		list.add( 8);
		list.add( 8);
		list.add(8);
		list.add(8);
		list.add(8);
		list.add( 8);
		list.add( 8);
		list.add( 8);
		list.add( 8);
		list.add( 8);
		list.add( 8);
		list.add( 8);	
		list.add( 8);

	}

	@Test
	public void secondAddTest() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(7);
		list.add(8);
	}
}// TODO: add more tests 1) test removing from empty list 2)adding to full list
// 3)add test for cases that expect exception
