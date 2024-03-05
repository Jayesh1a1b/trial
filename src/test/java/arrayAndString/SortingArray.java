package arrayAndString;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,30,23};
		System.out.println("Before sorting "+Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After sorting "+Arrays.toString(a));

	}

}
