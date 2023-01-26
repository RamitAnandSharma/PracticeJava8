package com.concept.loadorder;

public class StaticLoadMainClass {

	public static void main(final String[] args) {
		
		System.out.println(StaticLoadClass.THE_ONE); 
		// will *not* cause
		// initialization of static
		// fields (e.g. conn)
		System.out.println(StaticLoadClass.NOT_THE_ONE); 
		// will cause										
		// initialization
		// of static fields (e.g.
		// conn)
		

		System.out.println(StaticLoadClass.serverConnection); 
	}

}
