package com.abhi.algo.sort;

import java.util.ArrayList;

public class BubbleSort implements InterfaceSort {

	@Override
	public ArrayList<Integer> sort(ArrayList<Integer> arr) {
		ArrayList<Integer> result = new ArrayList<>();
		int length = arr.size();
		if (length == 0) {
			System.out.println("The array is already sorted!!");
		}
		System.out.println("The array length is :"+arr.size());
		result = bubbleSort(arr, length);
		return result;
	}

	private ArrayList<Integer> bubbleSort(ArrayList<Integer> arr, int length) {
		for (int numberOfElemement = 0; numberOfElemement< length - 1; numberOfElemement++) {
			for (int index = 1; index <= arr.size() - 1; index++) {
				if (arr.get(index - 1) > arr.get(index)) {
					// Swapping the values
					int temp = arr.get(index - 1);
					arr.set(index - 1, arr.get(index));
					arr.set(index, temp);
				}
			}
		}
		return arr;
	}

}
