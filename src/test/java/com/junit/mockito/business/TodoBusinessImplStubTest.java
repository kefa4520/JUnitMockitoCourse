package com.junit.mockito.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.junit.mockito.data.TodoService;
import com.junit.mockito.data.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBus = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBus.retrieveTodosRelatesToSpring("Dummy");
		
		assertEquals(2, filteredTodos.size());
	}

}
