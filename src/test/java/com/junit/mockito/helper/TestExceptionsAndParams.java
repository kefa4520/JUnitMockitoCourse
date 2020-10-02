package com.junit.mockito.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestExceptionsAndParams {

	StringHelper helper = new StringHelper();
	
	private String input;
	private String expectOutput;
		
	
	
	public TestExceptionsAndParams(String input, String expectOutput) {
		super();
		this.input = input;
		this.expectOutput = expectOutput;
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		
	}
	
	//to test same method with different conditions
	@Parameters 
	public static Collection<String[]> testConditions() {
	String expectOutput[][] = { { "AACD", "CD"},
	 {"ACD", "CD"} }; 
	
	return Arrays.asList(expectOutput);
	}

	

	@Test
	public void test1() {
		assertEquals(expectOutput, helper.truncateAInFirst2Positions(input));
	}
	
	
	//testing Exceptions in JUnit (without try catch)
	@Test(expected=NullPointerException.class)
	public void test2() {
		int[] numbers = null;
		Arrays.parallelSort(numbers);
	}

}
