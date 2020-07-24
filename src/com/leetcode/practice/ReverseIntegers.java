package com.leetcode.practice;

import java.util.Iterator;
import java.util.List;

public class ReverseIntegers {
	public static int revHard(int num) { 
		int rev_num = 0; 
    while(num > 0) 
    { 
        rev_num = rev_num * 10 + num % 10; //
        num = num / 10; 
       
    } 
    System.out.println(rev_num);
    return rev_num; 
	}
	public static void main(String[] args) {
		revHard(4872);
	}
	 
}
