package com.java8.comparison;

import java.util.Comparator;

public class ComparetorA implements Comparator<CompareA> {

 

	@Override
	public int compare(CompareA a, CompareA b) {
		if (a.getValue() > b.getValue()) {
			return -1;
		}
		if (a.getValue() < b.getValue()) {
			return 1;
		} else {
			return 0;
		}
	}
}
