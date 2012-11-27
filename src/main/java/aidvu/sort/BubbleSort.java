package aidvu.sort;

/**
 * Bubble sort implementation
 * 
 * @author aidvu
 */
public class BubbleSort 
{
	
	/**
	 * Sorts an array using Bubble sort
	 * 
	 * @param unsortedArray - Array to sort
	 * @return sorted array
	 */
	public static int[] sort(int[] unsortedArray)
	{
		// Clone the array, so we don't change the original one 
		int[] a = (int[]) unsortedArray.clone();
		
		// Swap flag
		boolean swapped;
		
		do {
			// If we haven't swapped anything, the array is sorted
			swapped = false;

			// Go through the array
			for (int i = 0; i < a.length - 1; i++) {
				// Compare all adjacent items and swap them if in wrong order
				if (a[i] > a[i + 1]) {
					Helper.swap(a, i, i + 1);
					// Remember we swapped something
					swapped = true;
				}
			}
		} while (swapped); // If we swapped something, go through the array again

		return a;
	}
}
