package arrayAndString;

import java.util.Arrays;
import java.util.Collections;

public class SortingInDecendingOrder {

	public static void main(String[] args) {
		
		//Integer array need to be created for Collection.reverseOrder() to work
		Integer a[]= {10,20,30,40,30,23};
		System.out.println("Before sorting "+Arrays.toString(a));
		  // Sorting the array in descending order
		Arrays.sort(a,Collections.reverseOrder());
		// Printing the elements
		System.out.println("After sorting "+Arrays.toString(a));
		
	}

}
