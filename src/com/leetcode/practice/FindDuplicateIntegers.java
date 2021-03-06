package com.leetcode.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateIntegers {
	// find duplicate integers in given int[] arrays
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };// define ints
		isHavingDuplicates(nums);// call method
		isHavingDuplicates1(nums);
	}

	private static void isHavingDuplicates(int[] nums) {
		HashSet<Integer> numbers = new HashSet<Integer>();// create an instance for hashset which famous for eliminating
															// duplicates
		for (int i = 0; i < nums.length; i++) {// loop through all the elements
				numbers.add(i);
		}
		System.out.println("legacy style" + numbers);

	}

	private static void isHavingDuplicates1(int[] nums) {
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		list.parallelStream().collect(Collectors.toSet()).forEach(val -> System.out.print(val+","));
	}

}
