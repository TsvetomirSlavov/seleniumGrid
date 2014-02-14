package com.test.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayListSample {

	ArrayList<String> arrayList = new ArrayList<String>();

	@Test
	public void insertEntries() {

		// add
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");

		arrayList.add(1, "inserted");

		System.out.println(arrayList);

		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("added");
		arraylist2.add("added");

		// add other arraylist to existing arraylist
		arrayList.addAll(arraylist2);

		System.out.println(arrayList);

		// Arraylist to array
		Object[] objArray = arrayList.toArray();
		System.out.println(objArray);
		
		System.out.println("**** Printing");
		//Array to list
		List<Object> list = Arrays.asList(objArray);
		System.out.println(list);
		

		// Iterator
		Iterator<String> itr = arrayList.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// List Iterator
		Iterator<String> list_itr = arrayList.listIterator(2);
		System.out.println("******");

		while (list_itr.hasNext()) {

			System.out.println(list_itr.next());

		}

		// to replace one element
		arraylist2.set(1, "replaced");

		// search for an element in array list
		boolean isTextpresent = arrayList.contains("2");

		System.out.println(isTextpresent);

		// sort elements in a array list

		Collections.sort(arrayList);

		System.out.println(arrayList);
		
		
		//Copy elements from one array list to another
		Collections.copy(arrayList, arraylist2);
		Collections.copy(arrayList, arrayList);
		arrayList.addAll(arrayList);
		
		HashSet<String> hSet = new HashSet<String>();
		hSet.iterator();
		
		Iterator<String> addedlist = arrayList.listIterator();
		System.out.println("&&&&&&&&&&&");
		while(addedlist.hasNext()){
			System.out.println(addedlist.next());
		}
		
		Comparator<Object> comparator = Collections.reverseOrder();
	}

}
