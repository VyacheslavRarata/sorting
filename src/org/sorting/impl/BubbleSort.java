package org.sorting.impl;

import org.sorting.api.Sort;

public class BubbleSort implements Sort {

	@Override
	public int[] sort(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0, k = 1; j < inputArray.length - i - 1; j++, k++) {
				if (inputArray[k] < inputArray[j]) {
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
