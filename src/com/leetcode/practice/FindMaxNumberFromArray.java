package com.leetcode.practice;


public class FindMaxNumberFromArray {
public static void main(String[] args) {
	int[] a = new int[] { 22, 3, 550, 4, 11, 100};
	int max =a[0];//initially assign first value as max value
	for (int i = 0; i < a.length; i++) {//iterate through all feilds
		if(a[i]>max) {//check the first assigned value is greater thans the iteraryted value
			max=a[i];//if yes asign
				}
		
	}
}
}
