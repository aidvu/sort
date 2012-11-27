package aidvu.sort;

/**
 * Heap sort implementation
 * 
 * @author aidvu
 */
public class HeapSort 
{
	// Array we're sorting
	private static int[] a;
	// Size of array
	private static int n;
	// Left child index
	private static int left;
	// Right child index
	private static int right;
	// Largest element index
	private static int largest;

	/**
	 * Build the initial heap
	 * 
	 * @param a - array for which to build the heap
	 */
	public static void buildHeap(int[] a)
	{
		// We're using indexing from 0
		n = a.length - 1;
		// Go through all parents from bottom
		for(int i = n / 2; i >= 0; i--) {
			// And make max heaps
			maxHeap(a, i);
		}
	}

	/**
	 * Builds a max heap
	 * 
	 * @param a - array for which to build the max heap
	 * @param i - index of the root
	 */
	public static void maxHeap(int[] a, int i)
	{
		// Left son position in the heap represented as array
		left = 2 * i + 1;
		// Right son position in the heap represented as array
		right = 2 * (i + 1);

		// If the left son is in array, and larger then element at index i
		if (left <= n && a[left] > a[i]) {
			largest = left;
		} else {
			largest = i;
		}

		// If the right son is in array, and larger then largest element 
		if (right <= n && a[right] > a[largest]) {
			largest = right;
		}
		
		// If largest index is different than i
		if (largest != i) {
			// Swap then
			Helper.swap(a, i, largest);
			// And build a max heap from largest
			maxHeap(a, largest);
		}
	}

	/**
	 * Sorts an array using Heap sort
	 * 
	 * @param unsortedArray - Array to sort
	 * @return sorted array
	 */
	public static int[] sort(int[] unsortedArray)
	{
		// Save the array for use between functions
		a = (int[]) unsortedArray.clone();

		// Build initial heap
		buildHeap(a);

		// Go through the heap structure 
		for (int i = n; i > 0; i--) {
			// Exchange top (largest) element 
			Helper.swap(a, 0, i);
			// Lower the size of the array by the 1 exchanged 
			n = n - 1;
			// Reorder the heap because we put element i on top
			maxHeap(a, 0);
		}
		
		return a;
	}
}
