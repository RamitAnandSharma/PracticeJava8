package com.java8.comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareComparator {

	public static void main(String[] args) {
		ArrayList<CompareA> list = new ArrayList<CompareA>();
		list.add(new CompareA(1));
		list.add(new CompareA(5));
		list.add(new CompareA(2));
		list.add(new CompareA(8));
		list.add(new CompareA(1));
		list.add(new CompareA(0));

		Collections.sort(list);

		Collections.sort(list, new ComparetorA());

		Comparator<CompareA> com = (CompareA a, CompareA b) -> a.getValue() - b.getValue();

		Comparator<CompareA> com2 = Comparator.comparing(CompareA::getValue);

		Collections.sort(list, com2);
		
		
	}
}
