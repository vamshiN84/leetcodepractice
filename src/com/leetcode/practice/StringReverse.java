package com.leetcode.practice;

public class StringReverse {
	public static String revEasy(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.reverse().toString() ;
	}
	public static String revHard(String s) {
		//Converting the string into a character array
		char c[]=s.toCharArray();
		String reverse="";
		//For loop to reverse a string
		for(int i=c.length-1;i>=0;i--){
		reverse+=c[i];
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		String str ="vamshi";
		revEasy(str);
		revHard(str);
	}
}
