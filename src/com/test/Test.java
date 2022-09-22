package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void reverseArray(int[] arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
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
		
		int[] a= {2,3,9,1,10,20,34};
		reverseArray(a);
		System.out.println(Arrays.toString(a));
	}

}
