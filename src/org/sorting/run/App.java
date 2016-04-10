package org.sorting.run;

import org.sorting.api.Sort;
import org.sorting.impl.BubbleSort;
import org.sorting.impl.InsertSort;
import org.sorting.impl.SelectSort;

public class App {

	public static int[] inputArray;

	public static void main(String[] args) {
		System.out.println("Welocme to Sorting World!");
		runSorting();
	}

	public static void showArray(int[] inputArray) {
		System.out.print("[ ");
		for (int element : inputArray) {
			System.out.print(element + " ");
		}
		System.out.println("]");
	}

	public static void runSorting() {
		runSortByClass(new BubbleSort());
		runSortByClass(new InsertSort());
		runSortByClass(new SelectSort());
	}

	private static void runSortByClass(Sort sorting) {
		inputArray = new int[] { 3, 0, 1, 8, 7, 2, 5, 4, 9, 6 };
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

}
