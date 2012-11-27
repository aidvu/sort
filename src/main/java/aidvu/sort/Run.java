package aidvu.sort;

import java.util.Random;

public class Run
{
	public static void main(String[] args)
	{
		// Array length
		int length = 20000;
		// Random number range
		int range = 200;
		// Print results
		boolean print = false;
		// For measuring performance
		long startTime, endTime;
		
		int[] unsortedArray = new int[length];
		
		// Array of randomly generated numbers
		Random generator = new Random();
		for (int i = 0; i < unsortedArray.length; i++) {
			unsortedArray[i] = generator.nextInt(range);
		}

		// BubbleSort run
		startTime = System.nanoTime();
		int[] bubbleSortedArray = BubbleSort.sort(unsortedArray);
		endTime = System.nanoTime(); 
		System.out.println("BubbleSort " + (endTime - startTime));
		
		// SelectionSort run
		startTime = System.nanoTime();
		int[] selectionSortedArray = SelectionSort.sort(unsortedArray);
		endTime = System.nanoTime(); 
		System.out.println("SelectionSort " + (endTime - startTime));

		// HeapSort run
		startTime = System.nanoTime();
		int[] heapSortedArray = HeapSort.sort(unsortedArray);
		endTime = System.nanoTime(); 
		System.out.println("HeapSort " + (endTime - startTime));

		// Print the arrays
		if (print) {
			Helper.printArray(unsortedArray);
			Helper.printArray(bubbleSortedArray);
			Helper.printArray(heapSortedArray);
			Helper.printArray(selectionSortedArray);
		}
	}
}
