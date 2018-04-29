package com.abhi.algo.sort;

import java.util.ArrayList;

public class SelectionSort implements InterfaceSort {

	@Override
	public ArrayList<Integer> sort(ArrayList<Integer> arr) {
		ArrayList<Integer> result = new ArrayList<>();
		int length = arr.size();
		if (length == 0) {
			System.out.println("The array is already sorted!!");
		}
		System.out.println("The array length is :" + arr.size());
		result = selectionSort(arr, length);
		return result;
	}

	private ArrayList<Integer> selectionSort(ArrayList<Integer> arr, int length) {
		for (int index = 0; index < length - 1; index++) {
			// Find the minimum number after index
			for (int checkAfterIndex = index + 1; checkAfterIndex < length; checkAfterIndex++) {
				if (arr.get(index) > arr.get(checkAfterIndex)) {
					int temp = arr.get(checkAfterIndex);
					arr.set(checkAfterIndex, arr.get(index));
					arr.set(index, temp);
				}

			}
			System.out.println(arr);
		}
		return arr;
	}

}
