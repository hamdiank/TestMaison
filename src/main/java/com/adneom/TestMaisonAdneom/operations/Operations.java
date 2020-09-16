package com.adneom.TestMaisonAdneom.operations;

import java.util.ArrayList;
import java.util.List;

import com.adneom.TestMaisonAdneom.exceptions.OperationsExceptions;

public final class Operations {
	/**
	 * Don't let anyone instantiate this class.
	 */
	private Operations() {

	}

	public static List<List<Integer>> partition(List<Integer> list, int taille) throws OperationsExceptions {

		if (list == null || list.isEmpty() || taille <= 0)
			throw new OperationsExceptions("Use of inappropriate arguments");

		// returned list
		List<List<Integer>> parts = new ArrayList<List<Integer>>();
		// List length
		int n = list.size();

		for (int i = 0; i < n; i += taille) {
			// increment sublist portion
			int toIndex = i + taille;
			// if toIndex exceeds list length
			if (toIndex > n)
				toIndex = n;
			parts.add(list.subList(i, toIndex));

		}

		return parts;
	}

}
