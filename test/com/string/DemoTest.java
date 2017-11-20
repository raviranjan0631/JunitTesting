package com.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

//	@Test
////	public void testCompareString() {
////		Demo demo = new Demo();
////		assertFalse("hello and hello fails", demo.compareString("helo", "Hello"));
////	}
//	@Test
//	public void testConCatString(){
//		Demo demo = new Demo();
//		assertEquals("HelloWorld", demo.concatString("Hello", "World"));
//		assertEquals("HellWorld", demo.concatString("Hel", "World"));
//		assertEquals("HiWorld", demo.concatString("Hi", "World"));
//	} 
	@Test
	public void testAddOneToArray(){
		Demo demo = new Demo();
		int arr[] = {3,8, 4};
		assertArrayEquals(arr, demo.addOneToArray(new int[] {2,7,3}));
	}
}
