package com.java.collections;

import java.util.Comparator;

public class CgpComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		if (s1.cgp >= s2.cgp) {
			return 1;
		}
		return -1;
	}

}
