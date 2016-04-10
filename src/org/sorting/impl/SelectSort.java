package org.sorting.impl;

import org.sorting.api.Sort;

public class SelectSort implements Sort{

	@Override
	public int[] sort(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i; j < inputArray.length; j++) {
				if (inputArray[i] > inputArray[j]) {
					// changing elements
					inputArray[j] += inputArray[i];
					inputArray[i] = inputArray[j] - inputArray[i];
					inputArray[j] -= inputArray[i];
				}
			}
		}
		return inputArray;
	}
}
