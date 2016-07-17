package com.javabasic.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortExample {

	private List<String> nameList = Arrays.asList("Kevin", "Brian", "Steve", "Bill", "Obama");
	
	public static void main(String[] args) {
		SortExample sortExample = new SortExample();
		System.out.println("Before sorting:" + sortExample.nameList);
		
		sortExample.sortList(sortExample.nameList);
		System.out.println("List in ascending order:" + sortExample.nameList);
		
		sortExample.reverseSortList(sortExample.nameList);
		System.out.println("List in descending code : " + sortExample.nameList);
		
		List<String> keepOriginalOrderList = Arrays.asList("Kevin", "Brian", "Steve", "Bill", "Obama");
		List<String> sortedList = sortExample.sortListWithoutModifyingOriginalList(keepOriginalOrderList);
		System.out.println("List has preserved order : " + keepOriginalOrderList);
		System.out.println("New sorted list : " + sortedList);
	}

	private <E extends Comparable<E>> void sortList(List<E> list) {
		Collections.sort(list);
	}
	
	private <E extends Comparable<E>> void reverseSortList(List<E> list) {
		Collections.sort(list, Collections.reverseOrder());
	}
	
	private <E extends Comparable<E>> List<E> sortListWithoutModifyingOriginalList(List<E> list) {
		List<E> newList = new ArrayList<E>(list);
		Collections.sort(newList);
		return newList;
	}

	
}



























