package org.sorting.changer;

public class ElementChanger {

	public static int[] changeElements(int[] inputArray, int firstElementPosition, int secondElementPosition){
		inputArray[firstElementPosition] += inputArray[secondElementPosition];
		inputArray[secondElementPosition] = inputArray[firstElementPosition] - inputArray[secondElementPosition];
		inputArray[firstElementPosition] -= inputArray[secondElementPosition];
		return inputArray;
	}
}
