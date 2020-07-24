package com.leetcode.practice;

import java.util.function.Predicate;

public class PolyndromExample {
	public static void main(String[] args) {
		isPolyndrome("dad");
		String str ="dad";
		//to check polyndrom or not this is more than enough
		Predicate<String> st = s->s.charAt(0)!=s.charAt(s.length()-1);
		//if u want to print polyndrom use below
		String s = reverseString("vamshi");
		System.out.println(s);

	}

	public static boolean isPolyndrome(String str) {
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		if (reverse.equalsIgnoreCase(str)) {
			return true;
		} else {
			return false;
		}

	}
	public static String reverseString(String str) {
		String reverse ="";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
		
		
	}

}
