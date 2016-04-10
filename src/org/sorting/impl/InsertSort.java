package org.sorting.impl;

import org.sorting.api.Sort;
import org.sorting.changer.ElementChanger;

public class InsertSort implements Sort {

	@Override
	public int[] sort(int[] inputArray) {
		for (int i = 1; i < inputArray.length; i++) {
			for (int j = i, k = i - 1; j > 0; j--, k--) {
				if (inputArray[k] > inputArray[j]) {
					// changing elements
					inputArray = ElementChanger.changeElements(inputArray, k, j);
				}
			}
		}
		return inputArray;
	}

}
