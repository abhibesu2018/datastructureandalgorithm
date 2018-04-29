package com.abhi.algo.sort;

import java.util.List;

public class MergeSort implements InterfaceSort {

	@Override
	public List<Integer> sort(List<Integer> arr) {
		int length = arr.size();
		if (length == 0) {
			System.out.println("The array is already sorted!!");
		}
		List<Integer> result = mergeSort(arr);
		return result;
	}

	private List<Integer> mergeSort(List<Integer> arr) {
		return null;	
	}

}
