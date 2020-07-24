package com.leetcode.practice;
public class ArmstrongNumber{
    public static void main(String[] args) {
        int num = 371, originalNum, remainder, result = 0;
        while(num<0) {
        	remainder = num%10;
        	result+=Math.pow(remainder, 3);
        	num /= 10;
        }
        if(num==result) {
        	
        }
}
    }
//understanding the code 
/*
 * 
 */
