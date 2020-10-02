package com.junit.mockito.helper;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class StringHelperTest {

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
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CFED", helper.truncateAInFirst2Positions("CFED"));
	}

}
