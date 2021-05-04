/**
 * This class sorts an array, using the merge sort algorithm non-recursively.
 */
public class MergeSorter {
	//******* COMPLETE THIS METHOD ********//
	public static void sort(int[] a) {
		for(int i=1; i<=a.length-1; i=i*2){						//Logically divides the array into sizes of 1,2,4,8
			for(int j=0; j<=a.length-1; j+= i*2){				// makes successive calls to the merge method. Grabs elements for the merge method
				merge(j,(j+i-1),j+(2*i)-1 ,a);					//calls the merge method with the calculated from, mid, to variables.
			}

		}
		
	}

	//***** You do not need to change this method *****//
	//***** You do need to understand this method *****//
	public static void merge(int from, int mid, int to, int[] a) {
		// Size of the range to be merged
		int n = to - from + 1;

		// Merge both halves into a temporary array b
		int[] b = new int[n];
		// Next element to consider in the first half
		int i1 = from; // iFirst from book
		// Next element to consider in the second half
		int i2 = mid + 1; // iSecond from book

		int j = 0; // Next open position in b

		// As long as neither i1 nor i2 past the end, move
		// the smaller element into b
		while (i1 <= mid && i2 <= to) {
			if (a[i1] < a[i2]) {
				b[j] = a[i1];
				i1++;
			} else {
				b[j] = a[i2];
				i2++;
			}
			j++;
		}

		// Note that only one of the two while loops
		// below is executed

		// Copy any remaining entries of the first half
		while (i1 <= mid) {
			b[j] = a[i1];
			i1++;
			j++;
		}
		// Copy any remaining entries of the second half
		while (i2 <= to) {
			b[j] = a[i2];
			i2++;
			j++;
		}

		// Copy back from the temporary array
		for (j = 0; j < n; j++) {
			a[from + j] = b[j];
		}
	}
}