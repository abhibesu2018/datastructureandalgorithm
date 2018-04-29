package com.abhi.algo.sort;

import java.util.List;

public class InsertionSort implements InterfaceSort {

	@Override
	public List<Integer> sort(List<Integer> arr) {

		int length = arr.size();
		if (length == 0) {
			System.out.println("The array is already sorted!!");
		}
		int index = 1;
		List<Integer> result = insertionSort(arr,index);
		return result;
	}

	private List<Integer> insertionSort(List<Integer> subArr, int index) {
		System.err.println("intermediate result: "+subArr);
		System.err.println("intermediate index: "+index);
		
		//get the key element need to insert
		int key = subArr.get(index);
		System.err.println(key);
		
		//number of element to check in the array
		int numberOfElementToCheck = index -1;
		
		//Now search the position of the key in the already sorted array
		//Check key is less than the last element in the array and so on.
		//
		while(numberOfElementToCheck>=0 && key<subArr.get(numberOfElementToCheck)) {
			//Set the values of number of element check and key
			subArr.set(numberOfElementToCheck+1, subArr.get(numberOfElementToCheck));
			subArr.set(numberOfElementToCheck, key);
			
			//Decrease the number of element
			numberOfElementToCheck--;
		}
		
		//Increment the index for the recursion call
		if(index<subArr.size()-1) {
			index++;
			insertionSort(subArr, index);
		}
		
		return subArr;
	}
	
}
