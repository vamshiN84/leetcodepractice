package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findDups {
	public static void main(String[] args) {
		String[] agrs = { "i", "cmae", "i", "see" };
		String[] agrs1 = { "i", "see", "i", "saw" };
		
		// convert to list
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(agrs));
		list.addAll(Arrays.asList(agrs1));
		//find distinct values using set
		Set<String> distincts = list.parallelStream().collect(Collectors.toSet());
		
		System.out.println(distincts.size() + " distinct words: " + distincts);
		
		// find duplicate values
		List<String> dupStr = list.stream().filter(l -> Collections.frequency(list, l) > 1)
				.collect(Collectors.toList());

		System.out.println("duplicate strings" + dupStr);
		
		// finding duplicates in multiple ways
		// method 1 old technic
		String firstStr = "ABCD DCBD ABCS ABCD";
		String secondStr = "ABCD DCBD ABCS ABCD";

		Set<String> hs = new HashSet<String>();
		hs.add(firstStr);
		hs.add(secondStr);
		System.out.println("After adding to set"+hs);
		// terchnique 2
		String[] strArray = new String[] { firstStr, secondStr };// convert strings to array of strings
		List<String> list1 = Arrays.asList(strArray);
		Set<String> distinctWords = list1.stream().collect(Collectors.toSet());
		System.out.println("distinctWords" + distinctWords);

		String str = "ABCD ABCD BCNS";
		Map<Character, LongAdder> map = new ConcurrentHashMap<Character, LongAdder>();
		for (Character character : str.toCharArray()) {
			map.computeIfAbsent(character, ch -> new LongAdder()).increment();
		}
		System.out.println(map);
		String[] conStr = str.split(" ");
		Stream.of(conStr).collect(Collectors.toSet()).forEach(l->System.out.println(l));;
		
		
		
	}

}
