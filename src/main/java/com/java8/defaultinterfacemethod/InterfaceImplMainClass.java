package com.java8.defaultinterfacemethod;

public class InterfaceImplMainClass implements InterfaceChild {
	public static void main(String[] args) {
		InterfaceImplMainClass child = new InterfaceImplMainClass();
		child.test4();
	}

	@Override
	public void test2() {
		System.out.println("Hi");
	}

	@Override
	public void test() {
	}

	@Override
	public void test3() {
		System.out.println("Hi test 3");
	}

	@Override
	public void test4() {
		System.out.println("ahasdhas");
		 //super.test4();
	}
}
