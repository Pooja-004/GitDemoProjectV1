package com.test;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static String removeDuplicateWord(String str) {
		StringBuffer sb=new StringBuffer();
		Set<String> hs=new HashSet<String>();
		String[] words=str.split(" ");
		for(String w:words) {
			if(!hs.contains(w)) {
				hs.add(w);
				sb.append(w);
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String str="my name my name is ramakant is ramakant";
		System.out.println(removeDuplicateWord(str));
	}

}
