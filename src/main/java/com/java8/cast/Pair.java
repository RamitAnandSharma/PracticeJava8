package com.java8.cast;

public class Pair<X, Y> {

	private X first;
	private Y second;

	public X getFirst() {
		return first;
	}

	public void setFirst(X first) {
		this.first = first;
	}

	public Y getSecond() {
		return second;
	}

	public void setSecond(Y second) {
		this.second = second;
	}

	public Pair(X first, Y second) {
		super();
		this.first = first;
		this.second = second;
	}

	public Pair() {
		super();
		// TODO Auto-generated constructor stub
	}

}
