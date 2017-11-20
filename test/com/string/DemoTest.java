package com.string;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DemoTest {
	//to test boolean
//	@Test
//	public void testCompareString() {
//		Demo demo = new Demo();
//		assertFalse("hello and hello fails", demo.compareString("helo", "Hello"));
//	}
	//to test string
//	@Test
//	public void testConCatString(){
//		Demo demo = new Demo();
//		assertEquals("HelloWorld", demo.concatString("Hello", "World"));
//		assertEquals("HellWorld", demo.concatString("Hel", "World"));
//		assertEquals("HiWorld", demo.concatString("Hi", "World"));
//	} 
	//to test array
//	@Test
//	public void testAddOneToArray(){
//		Demo demo = new Demo();
//		int arr[] = {3,8, 4};
//		assertArrayEquals(arr, demo.addOneToArray(new int[] {2,7,3}));
//	}
	// to test method performance
//	@Test(timeout = 10)
//	public void testPerformance(){
//		Demo demo = new Demo();
//		demo.performance();
//	}
	// to check exceptions
//	@Test(expected = ArithmeticException.class)
//	public void testException(){
//		Demo demo = new Demo();
//		demo.exception(0);
//	}
	static Demo demo = null;
	@BeforeClass
	public static void beforeclasss(){
		System.out.println("beforeclass");
		demo = new Demo();
	}
	//afterclass is a static method
	@AfterClass
	public static void afterclass(){
		System.out.println("AfterClass");
		demo =null;
	}
	//after
	@After
	public void after(){
		System.out.println("After");
	}
	//before
	@Before
	public void before(){
		System.out.println("before");
	}
	@Test
	public void testCompareString() {
		System.out.println("first");
		assertFalse("hello and hello fails", demo.compareString("helo", "Hello"));
	}
	//to test string
	@Test
	public void testConCatString(){
		System.out.println("second");
		
		assertEquals("HelloWorld", demo.concatString("Hello", "World"));
	} 
	
	
}
