package com.java8.comparison;

public class CompareA implements Comparable<CompareA> {

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public CompareA(int value) {
		super();
		this.value = value;
	}

	public CompareA() {
		super();
	}

	@Override
	public int compareTo(CompareA b) {
		if (this.getValue() > b.getValue()) {
			return -1;
		}
		if (this.getValue() < b.getValue()) {
			return 1;
		} else {
			return 0;
		}
	}
}
