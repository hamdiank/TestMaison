package com.adneom.TestMaisonAdneom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.adneom.TestMaisonAdneom.exceptions.OperationsExceptions;
import com.adneom.TestMaisonAdneom.operations.Operations;

import junit.framework.Assert;

public class OperationsTest {

	// Expected Result
	private List<List<Integer>> expectedList;

	@Before
	public void setUp() throws Exception {
		expectedList = new ArrayList<>();
	}

	@Test
	public void testWithLengthMultipleListSize() throws OperationsExceptions {

		// Given
		Integer length = 3;
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		// When
		expectedList.add(Arrays.asList(1, 2, 3));
		expectedList.add(Arrays.asList(4, 5, 6));

		// Then
		Assert.assertEquals(expectedList, Operations.partition(list, length));
	}

	@Test
	public void testWithLengthNotMultipleListSize() throws OperationsExceptions {

		// Given
		Integer length = 3;
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		// When
		expectedList.add(Arrays.asList(1, 2, 3));
		expectedList.add(Arrays.asList(4, 5, 6));
		expectedList.add(Arrays.asList(7));

		// Then
		Assert.assertEquals(expectedList, Operations.partition(list, length));
	}

	@Test(expected = OperationsExceptions.class)
	public void testWithZeroLengthShouldThrowException() throws OperationsExceptions {

		// Given
		Integer length = 0;
		List<Integer> list = Arrays.asList(1, 2, 3);

		// When
		expectedList.add(Arrays.asList(1));
		expectedList.add(Arrays.asList(2));
		expectedList.add(Arrays.asList(3));

		// Then
		Assert.assertEquals(expectedList, Operations.partition(list, length));
	}

	@Test(expected = OperationsExceptions.class)
	public void testListNullShouldThrowException() throws OperationsExceptions {

		// Given
		Integer length = 2;
		List<Integer> list = null;

		// When
		expectedList.add(Arrays.asList(1, 2));
		expectedList.add(Arrays.asList(3, 4));
		expectedList.add(Arrays.asList(5));

		// Then
		Assert.assertEquals(expectedList, Operations.partition(list, length));
	}

}
