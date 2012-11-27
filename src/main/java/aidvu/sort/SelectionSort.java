package aidvu.sort;

/**
 * Selection sort implementation
 * 
 * @author aidvu
 */
public class SelectionSort 
{
	/**
	 * Sorts an array using Selection sort
	 * 
	 * @param unsortedArray - Array to sort
	 * @return sorted array
	 */
	public static int[] sort(int[] unsortedArray)
	{
		// Clone the array, so we don't change the original one 
		int[] a = (int[]) unsortedArray.clone();

		/*
		 * Go through all the elements and compare them with all that have greater index
		 * so when the outer loop finishes one iteration (for i) an element that's lower than all
		 * that have larger index is in the position of that i
		 */
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					Helper.swap(a, i, j);
				}
			}
		}

		return a;
	}
}
