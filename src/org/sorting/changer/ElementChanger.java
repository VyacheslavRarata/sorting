package org.sorting.changer;

public class ElementChanger {

	public static int[] changeElements(int[] inputArray, int firstElementPosition, int secondElementPosition) {
		if (checkConditions(inputArray, firstElementPosition, secondElementPosition)) {
			inputArray[firstElementPosition] += inputArray[secondElementPosition];
			inputArray[secondElementPosition] = inputArray[firstElementPosition] - inputArray[secondElementPosition];
			inputArray[firstElementPosition] -= inputArray[secondElementPosition];
		} else
			throw new ArrayIndexOutOfBoundsException();
		return inputArray;
	}

	private static boolean checkConditions(int[] inputArray, int firstElementPosition, int secondElementPosition) {
		if (firstElementPosition >= inputArray.length || secondElementPosition >= inputArray.length)
			return false;
		else if (firstElementPosition < 0 || firstElementPosition < 0)
			return false;
		else
			return true;
	}
}
