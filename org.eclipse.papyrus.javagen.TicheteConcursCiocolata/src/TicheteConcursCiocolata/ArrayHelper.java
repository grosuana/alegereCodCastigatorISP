package TicheteConcursCiocolata;

import java.util.Arrays;

public class ArrayHelper {
	public static <T> T[] push(T[] arr, T item) {
		T[] tmp = Arrays.copyOf(arr, arr.length + 1);
		tmp[tmp.length - 1] = item;
		return tmp;
	}

	public static Concurs[] removeTheElement(Concurs[] arr, int index){ 

		if (arr == null|| index < 0|| index >= arr.length) { return arr; } 
		
		// Create another array of size one less 
		Concurs[] anotherArray = new Concurs[arr.length - 1]; 
		
		// Copy the elements except the index 
		// from original array to the other array 
		for (int i = 0, k = 0; i < arr.length; i++) { 
		
		// if the index is 
		// the removal element index 
		if (i == index) { continue; } 
		
		// if the index is not 
		// the removal element index 
		anotherArray[k++] = arr[i]; 
		} 
		
		// return the resultant array 
		return anotherArray; 
	}
}