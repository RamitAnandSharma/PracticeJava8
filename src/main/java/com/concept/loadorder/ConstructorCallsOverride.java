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
public class ConstructorCallsOverride {
	public static void main(String[] args) {

		abstract class Base {
			Base() {
				overrideMe();
			}

			abstract void overrideMe();
		}
		class Child extends Base {
			final int x;

			Child(int x) {
				this.x = x;
			}

			@Override
			void overrideMe() {
				System.out.println(x);
			}
		}
		new Child(42); // prints "0"

	}
}
