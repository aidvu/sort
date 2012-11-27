package aidvu.sort;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

/**
 * Test class for sort algorithms
 * 
 * @author aidvu
 */
public class SortTest {
	
	private int[] unsortedArray = {5, 2, 1, 4, 12, 8};
	private int[] sortedArray = {1, 2, 4, 5, 8, 12};
	
	/**
	 * Test BubbleSort
	 */
	@Test
	public void testBubbleSort() {
		assertTrue(Arrays.equals(this.sortedArray, BubbleSort.sort(unsortedArray)));
	}
	
	/**
	 * Test HeapSort
	 */
	@Test
	public void testHeapSort() {
		assertTrue(Arrays.equals(this.sortedArray, HeapSort.sort(unsortedArray)));
	}
	
	/**
	 * Test SelectionSort
	 */
	@Test
	public void testSelectionSort() {
		assertTrue(Arrays.equals(this.sortedArray, SelectionSort.sort(unsortedArray)));
	}
}
