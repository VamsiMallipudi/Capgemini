package junitbasics;

import java.util.Arrays;

public class Assign1Q1 {

	public int[] MinMaxFinder(int arr[]) {
		
		Arrays.sort(arr);
		int arr2[] = new int[2];
		int min = arr[0];
		int max = arr[arr.length-1];
		arr2[0] = min;
		arr2[1] = max;
		return arr2;
}
}
