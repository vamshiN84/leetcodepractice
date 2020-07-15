package com.leetcode.practice;

import java.util.Arrays;

public class TwoSum2 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] result = twosum(nums ,3);
		System.out.println(Arrays.toString(result));
	}
	
public static int[] twosum(int[] numbers,int i) {
	
	int a_pointer=0;//define a pointer at index 0
	int b_pointr =numbers.length-1;//define a pointer at index n
	
	while(a_pointer<b_pointr) {//if index [0] is greater than [n] loop
		int sum = numbers[a_pointer]+numbers[b_pointr];// index[0]+index[n]
		if(sum>i) {// sum is greater than target
			b_pointr-=1; //decrease the pointer to move back words
		} else if(sum<i) {//if some is less than the target 
			a_pointer+=1;
		} else {
			return new int[] {a_pointer+1,b_pointr+1};// if the sum is equals  
			//increase the pointers will give the actuals indexes
		}
	}
	return new int[] {a_pointer+1,b_pointr+1};
	
}
}
