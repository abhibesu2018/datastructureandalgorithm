package com.abhi.algo.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class MainSort {

	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.addAll(Arrays.asList(9, 8, 5, 6, 3, 9));
		System.err.println("Unsorted array is: "+arr);
		InterfaceSort interfaceSort = new SelectionSort();
		interfaceSort.sort(arr);
		System.out.println(arr);
	}
}
