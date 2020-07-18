package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findDups {
	public static void main(String[] args) {
		String[] agrs = {"i","cmae","i","see"};
		String[] agrs1 = {"i","see","i","saw"};
	   //convert to list
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(args));
		list.addAll(Arrays.asList(agrs1));
		Set<List<String>> distinctWords1 = Stream.of(list).collect(Collectors.toSet());
		System.out.println(distinctWords1.size()+ 
                " distinct words: " + 
                distinctWords1);
		//finding duplicates in multiple ways
		//method 1 old technic
		String firstStr = "ABCD DCBD ABCS ABCD";
		String secondStr = "ABCD DCBD ABCS ABCD";
		
	   Set<String> hs = new HashSet<String>();
	   hs.add(firstStr);
	   hs.add(secondStr);
	   System.out.println(hs);
	   // terchnique 2 
	   String[] strArray = new String[] {firstStr,secondStr};//convert strings to array of strings
	   Set<String> distinctWords = Stream.of(strArray).collect(Collectors.toSet());
	   System.out.println("distinctWords"+distinctWords);
		
	   String str = "ABCD ABCD";
		Map<Character,LongAdder> map = new ConcurrentHashMap<Character, LongAdder>();
		for (Character character:str.toCharArray()) {
			map.computeIfAbsent(character, ch-> new LongAdder()).increment();
		}
		System.out.println(map);
		
	}

}
