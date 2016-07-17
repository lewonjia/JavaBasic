package com.javabasic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPersonExample {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("1", "Kevin", "kevin@email.com"));
		personList.add(new Person("2", "Brian", "brian@email.com"));
		personList.add(new Person("3", "Steve", "steve@email.com"));
		personList.add(new Person("4", null, "brill@email.com"));
		personList.add(new Person("5", "Obama", "obama@email.com"));
		
		SortPersonExample sortExample = new SortPersonExample();
		System.out.println("Before sorting:" + personList);
		sortExample.sortList(personList);
		System.out.println("After sorting:" + personList);
		
	}
	
	private void sortList(List<Person> list) {
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person person1, Person person2) {
				if(person1.getName() == null && person2.getName() == null) {
					return 0;
				}
				
				if(person1.getName() == null) {
					return -1;
				}
				
				if(person2.getName() == null) {
					return 1;
				}
				
				
				return person1.getName().compareTo(person2.getName());
			}
			
		});
	}

}














