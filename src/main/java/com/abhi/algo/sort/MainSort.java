package com.abhi.algo.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class MainSort {

	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.addAll(Arrays.asList(9, 8, 5, 6, 3));
		InterfaceSort interfaceSort = new SelectionSort();
		interfaceSort.sort(arr);
	}
}
