package com.Z1;

import java.util.Arrays;

public class ZeroAtFirst {
	
	// Output : array zero at first :[0, 0, 0, 0, 1, 2, 2, 3, 2, 1, 9, 2]

	public static void m1(int[] arr) {
		int nonZeroIndex = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[nonZeroIndex--] = arr[i];
			}
		}

		while (nonZeroIndex >= 0) {
			arr[nonZeroIndex--] = 0;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 0, 0, 3, 2, 1, 0, 9, 2, 0 };
		m1(arr);
		System.out.println("array zero at first :" + Arrays.toString(arr));
	}
}