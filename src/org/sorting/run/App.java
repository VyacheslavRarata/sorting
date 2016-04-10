package org.sorting.run;

import org.sorting.api.Sort;
import org.sorting.impl.BubbleSort;

public class App {

	public static void main(String[] args) {
		int[] inputArray = { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };
		System.out.println("Welocme to Sorting World!");
		Sort sorting = new BubbleSort();
		inputArray = sorting.sort(inputArray);
		System.out.print(sorting.getClass().getSimpleName() + " = ");
		showArray(inputArray);
		inputArray = new int[] { 0 };
		inputArray = sorting.sort(inputArray);
		System.out.print(sorting.getClass().getSimpleName() + " = ");
		showArray(inputArray);
		inputArray = new int[] { -20, 23, 51, -2 };
		inputArray = sorting.sort(inputArray);
		System.out.print(sorting.getClass().getSimpleName() + " = ");
		showArray(inputArray);

	}

	public static void showArray(int[] inputArray) {
		System.out.print("[ ");
		for (int element : inputArray) {
			System.out.print(element + " ");
		}
		System.out.println("]");
	}
}
