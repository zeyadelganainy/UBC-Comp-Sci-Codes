/**
 *  This program is to compare the runtime of the following sorting 
 *  algorithms: quick, merge, insertion, selection, and bubble sort.
 */

import java.util.*;   // for Random

public class Ex11Sorting {
	private static final Random RAND = new Random(42);   // random number generator
	
	private static final String QUICK = "Quick";
	private static final String MERGE = "Merge";
	private static final String INSERTION = "Insert";
	private static final String SELECTION = "Select";
	private static final String BUBBLE = "Bubble";
	private static final String[] METHODS = {QUICK, MERGE, INSERTION, SELECTION, BUBBLE};
	
	public static void main(String[] args) {
		int LENGTH = 1000;   // initial length of array to sort
		int RUNS   =  8;   // how many times to double length
		
		int[] a;
		long startTime, endTime;

		String header = "Size \t";
		for(String method : METHODS) {
			header += method+"\t";
		}
		System.out.println(header);
		
		for (int i = 0; i < RUNS; i++) {
			System.out.print(LENGTH+"\t");
			for(String method : METHODS) {
				a = createRandomArray(LENGTH);
	
				// perform a sort and time how long it takes
				startTime = System.currentTimeMillis();
				switch(method) {
					case QUICK:
						quickSort(a);
						break;
					case MERGE:
						mergeSort(a);
						break;
					case INSERTION:
						insertionSort(a);
						break;
					case SELECTION:
						selectionSort(a);
						break;
					case BUBBLE:
						bubbleSort(a);
						break;
					default:
						break;
				}
				endTime = System.currentTimeMillis();
				
				System.out.print((endTime - startTime)+"\t");
			}
			LENGTH *= 2;   // double size of array for next time
			System.out.println();
		}
	}
	
	// Sorts the elements of the given array using the "quick sort"
	// algorithm, which divides the input up into two partitions
	// based on which elements are less-than and greater-than a given
	// chosen "pivot" value.
	// This implementation chooses the first element as the pivot.
	public static void quickSort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}

	// Recursive helper for quickSort that sorts the given range of the array,
	// from index [min .. max], inclusive.
	private static void quickSort(int[] a, int min, int max) {
		if (min >= max) {
			return;  // base case;  EZ mode
		}

		// pick a "pivot" value (first element)
		int pivot = a[min];

		// move the pivot to the end
		swap(a, min, max);

		// partition: left: < pivot,  right: > pivot
		int i = min;
		int j = max - 1;
		while (i <= j) {
			while (i <= j && a[i] < pivot) {
				i++;
			}
			while (i <= j && a[j] > pivot) {
				j--;
			}

			if (i <= j) {
				swap(a, i, j);
				i++;
				j--;
			}
		}

		// move pivot back to middle
		swap(a, max, i);

		// sort the two partitions
		quickSort(a, min, i - 1);
		quickSort(a, i + 1, max);
	}

	// Arranges the elements of the given array into sorted order
	// using the "merge sort" algorithm, which splits the array in half,
	// recursively sorts the halves, then merges the sorted halves.
	// It is O(N log N) for all inputs.
	public static void mergeSort(int[] a) {
		if (a.length >= 2) {
			// split array in half
			int[] left  = Arrays.copyOfRange(a, 0, a.length / 2);
			int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);

			// sort the halves
			mergeSort(left);
			mergeSort(right);

			// merge them back together
			int i1 = 0;
			int i2 = 0;
			for (int i = 0; i < a.length; i++) {
				if (i2 >= right.length ||
						(i1 < left.length && left[i1] < right[i2])) {
					a[i] = left[i1];
					i1++;
				} else {
					a[i] = right[i2];
					i2++;
				}
			}
		}
	}


	// Arranges the elements of the given array into sorted order
	// using the "insertion sort" algorithm, which manages a sorted
	// prefix of the array, and one at a time, shifts each next element
	// to be in the right ordered place within that sorted prefix
	// until the entire array is sorted.
	// It is O(N^2) but faster (O(N)) for sorted inputs.
	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			// move a[pass] into its proper place,
			// assuming that a[0]..a[pass-1] are sorted
			int temp = a[i];
			int j = i;
			while (j >= 1 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = temp;
		}
	}

	// Arranges the elements of the given array into sorted order
	// using the "selection sort" algorithm, which makes sweeps over
	// the array, finding the i'th smallest element each time,
	// and swapping it to be stored at index i.
	// It is O(N^2) for all inputs.
	public static void selectionSort(int[] a) {
		for (int pass = 0; pass < a.length; pass++) {
			// figure out what should go into a[pass]
			int min = pass;
			for (int j = pass + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}

			swap(a, pass, min);
		}
	}

	// Arranges the elements of the given array into sorted order
	// using the "bubble sort" algorithm, which makes sweeps over
	// the array and swaps neighbors that are out of order.
	// It is O(N^2) for all inputs.
	public static void bubbleSort(int[] a) {
		for (int pass = 0; pass < a.length; pass++) {
			// make a sweep
			boolean changed = false;
			for (int i = 0; i < a.length - 1 - pass; i++) {
				if (a[i] > a[i + 1]) {
					swap(a, i, i + 1);
					changed = true;
				}
			}
			if (!changed) {
				return;
			}
		}
	}


	// Swaps the values at the two given indexes in the given array.
	private static final void swap(int[] a, int i, int j) {
		if (i != j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}

	// Randomly rearranges the elements of the given array.
	private static void shuffle(int[] a) {
		for (int i = 0; i < a.length; i++) {
			// move element i to a random index in [i .. length-1]
			int randomIndex = (int) (Math.random() * a.length - i);
			swap(a, i, i + randomIndex);
		}
	}

	// Returns true if the given array is in sorted ascending order.
	private static boolean isSorted(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}



	// Creates an array of the given length, fills it with random
	// non-negative integers, and returns it.
	public static int[] createRandomArray(int length) {
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++) {
			a[i] = RAND.nextInt(1000000);
		}
		return a;
	}

}