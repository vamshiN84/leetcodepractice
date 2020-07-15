package com.leetcode.practice;

import java.util.Arrays;
import java.util.HashSet;

public class PrintStarts {
	public static void main(String[] args) {
		String s1 = "Geeks hello i m fine";
		 String str = " Geeks for Geeks "; 
		 String s5 = str.concat(s1);
	        String[] arrOfStr = s5.split(" "); 
	        HashSet<String> setOfAccounts = new HashSet<>(Arrays.asList(arrOfStr));
	       // System.out.println(setOfAccounts);
	       /* for (String a : setOfAccounts) 
	            System.out.print(" " + a);
	        

    }*/
	        setOfAccounts.stream().forEach(System.out::print);
}
}
