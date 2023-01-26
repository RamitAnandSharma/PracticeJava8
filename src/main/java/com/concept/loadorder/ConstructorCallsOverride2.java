package com.concept.loadorder;

/**
 * class must obey to allow inheritance. Constructors must not invoke
 * overridable methods, directly or indirectly. If you violate this rule,
 * program failure will result. The superclass constructor runs before the
 * subclass constructor, so the overriding method in the subclass will be
 * invoked before the subclass constructor has run. If the overriding method
 * depends on any initialization performed by the subclass constructor, the
 * method will not behave as expected.
 * 
 * @author sbbras
 *
 */
public class ConstructorCallsOverride2 {
	static abstract class A {
		abstract void foo();

		A() {
			System.out.println("Constructing A");
			foo();
		}
	}

	static class C extends A {
		C() {
			System.out.println("Constructing C");
		}

		void foo() {
			System.out.println("Using C");
		}
	}

	public static void main(String[] args) {
		C c = new C();
	}
}
