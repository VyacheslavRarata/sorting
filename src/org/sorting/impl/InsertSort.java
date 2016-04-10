package org.sorting.impl;

import org.sorting.api.Sort;

public class InsertSort implements Sort {

	@Override
	public int[] sort(int[] inputArray) {
		for (int i = 1; i < inputArray.length; i++) {
			for (int j = i, k = i - 1; j > 0; j--, k--) {
				if (inputArray[k] > inputArray[j]) {
					// changing elements
					inputArray[j] += inputArray[k];
					inputArray[k] = inputArray[j] - inputArray[k];
					inputArray[j] -= inputArray[k];
				}
			}
		}
		return inputArray;
	}

}
