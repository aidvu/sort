package aidvu.sort;

/**
 * Sort helper functions
 * 
 * @author aidvu
 */
public class Helper {
	
	/**
	 * Print an integer array
	 * 
	 * @param numbers - array to be printed
	 */
	public static void printArray(int[] numbers)
	{
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * Swap element i and j in the array a
	 * 
	 * @param a - array in which to swap 
	 * @param i - index of swap element
	 * @param j - index of swap element
	 */
	public static void swap(int[] a, int i, int j)
	{
		int t = a[i];
		a[i] = a[j];
		a[j] = t; 
	}
}
