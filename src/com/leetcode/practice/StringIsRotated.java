package com.leetcode.practice;

public class StringIsRotated {

	public static void main(String[] args) {

		System.out.println(isRotated("dabc", "abcd"));
		System.out.println(isRotatedVersion("dabc", "abcd"));
	}

	public static boolean isRotated(String input, String rotated) {
		if (input == null || rotated == null) {
			return false;
		} else if (input.length() != rotated.length()) {
			return false;
		}
		int index = rotated.length() - 1;
		if (index > -1) {
			if (input.equalsIgnoreCase(rotated)) {
				return true;
			}
			int finalPos = rotated.length() - index;
			return rotated.charAt(0) == input.charAt(finalPos)
					&& input.substring(finalPos).equals(rotated.substring(0, index));
		}
		return false;
	}

	public static boolean isRotatedVersion(String str, String rotated) {
		boolean isRotated = false;
		if (str == null || rotated == null) {
			return false;
		} else if (str.length() != rotated.length()) {
			isRotated = false;
		} else {
			String concatenated = str + str;
			isRotated = concatenated.contains(rotated);
		}
		return isRotated;
	}

}
