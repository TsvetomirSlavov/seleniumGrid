package com.test.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetSample {

	Set<String> hashSet = new HashSet<String>();
	Set<String> treeSet = new TreeSet<String>();
	Set<String> linkedHashSet = new LinkedHashSet<String>();

	@Test
	public void hashSet() {
		hashSet.add("1");
		hashSet.add("2");
		hashSet.add("3");
		hashSet.add("0");
		hashSet.add("a");
		hashSet.add("d");
		hashSet.add("e");

		System.out.println("Sizer of the set is " + hashSet.size());

		hashSet.remove("2");

		System.out.println("Size of hash set after removal " + hashSet.size());

		System.out.println("Iterator in hash set");
		Iterator<String> hashSetIterator = hashSet.iterator();

		while (hashSetIterator.hasNext()) {
			System.out.println(hashSetIterator.next());

		}
	}

	@Test
	public void treeSet() {
		treeSet.add("2");
		treeSet.add("2");
		treeSet.add("1");
		treeSet.add("2");
		treeSet.add("3");
		treeSet.add("0");
		treeSet.add("a");
		treeSet.add("d");
		treeSet.add("e");

		System.out.println("Sizer of the set is " + treeSet.size());


		hashSet.remove("2");

		System.out.println("Size of tree set after removal " + treeSet.size());

		Iterator<String> hashSetIterator = treeSet.iterator();

		System.out.println("Iterator in tree set");
		while (hashSetIterator.hasNext()) {
			System.out.println(hashSetIterator.next());

		}
	}

	@Test
	public void linkedHashSet() {
		linkedHashSet.add("3");
		linkedHashSet.add("z");
		linkedHashSet.add("2");
		linkedHashSet.add("2");
		linkedHashSet.add("1");
		linkedHashSet.add("2");
		linkedHashSet.add("3");
		linkedHashSet.add("0");
		linkedHashSet.add("a");
		linkedHashSet.add("d");
		linkedHashSet.add("e");

		System.out.println("Sizer of the set is " + linkedHashSet.size());

		Iterator<String> linkedHashSetItr = linkedHashSet.iterator();
		System.out.println("Iterator in Linkedhash set");
		while (linkedHashSetItr.hasNext()) {
			System.out.println(linkedHashSetItr.next());

		}
		
		linkedHashSet.add("added");
		
		linkedHashSetItr = linkedHashSet.iterator();
		System.out.println("after adding");
		while (linkedHashSetItr.hasNext()) {
			System.out.println(linkedHashSetItr.next());

		}
		
		linkedHashSet.remove("1");
		linkedHashSetItr = linkedHashSet.iterator();
		System.out.println("After deleting");
		while (linkedHashSetItr.hasNext()) {
			System.out.println(linkedHashSetItr.next());

		}
	}

}
