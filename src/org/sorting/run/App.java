package org.sorting.run;

import org.sorting.api.Sort;
import org.sorting.impl.BubbleSort;
import org.sorting.impl.InsertSort;
import org.sorting.impl.SelectSort;

public class App {

	public static Sort sorting;
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
	public static void runSorting(){
		runBubbleSort();
		runInsertSort();
		runSelectSort();
	}
	private static void runBubbleSort(){
		inputArray = new int[] { 3, 0, 1, 8, 7, 2, 5, 4, 9, 6 };
		sorting = new BubbleSort();
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
	private static void runInsertSort(){
		sorting = new InsertSort();
		inputArray = new int[]{ 3, 0, 1, 8, 7, 2, 5, 4, 9, 6 };
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
	private static void runSelectSort(){
		sorting = new SelectSort();
		inputArray = new int[]{ 3, 0, 1, 8, 7, 2, 5, 4, 9, 6 };
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
