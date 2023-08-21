package com.java.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		Comparator c = new BasicComparator();
		SortedSet employList = new TreeSet(c);
		employList.add(new Employ(1, "Chetan", 84232));
		employList.add(new Employ(2, "Ankit", 91033));
		employList.add(new Employ(3, "Riddhi", 90541));
		employList.add(new Employ(4, "Rushikesh", 73131));
		employList.add(new Employ(5, "Makarand", 76322));
		employList.add(new Employ(6, "Kumar Sawant", 89321));
		System.out.println("Employ List");
		for (Object object : employList) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
	}
}
