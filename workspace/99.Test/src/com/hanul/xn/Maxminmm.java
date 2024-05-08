package com.hanul.xn;


public class Maxminmm {
	public int getMax(int[] arr) {
		int max = arr[0];	
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {	 
				max = arr[i];	 
			}//if
		}//for
		return max;
	}//getMax()
	
	public int getMin(int[] arr) {
		int min = arr[0];	
	
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {	 
				min = arr[i];	 
			}//if
		}//for
		return min;
	}//getMax()
	
	
}
