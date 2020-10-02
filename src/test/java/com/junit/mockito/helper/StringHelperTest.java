package com.junit.mockito.helper;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	
	
	//org.junit.ComparisonFailure: expected:<ABC[]> but was:<ABC[D]>
	@Test
	public void test1() {
		assertEquals("ABC", "ABC");
	}
	@Test
	public void test2() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CFED", helper.truncateAInFirst2Positions("CFED"));
	}
	
	@Test
	public void test3() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void test4() {
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

}
