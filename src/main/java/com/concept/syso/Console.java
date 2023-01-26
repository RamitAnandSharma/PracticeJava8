package com.concept.syso;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Console {

	public static void main(String[] args) throws Exception {
		//overwriteSYSO(); 
		final String x;
		x="hashas asd ad";
		System.out.println(x);
		
	}

	private static void overwriteSYSO() throws Exception {
		java.lang.System c = null;
		c.out.println("print");

		char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println(charArray);
		//
		// It seems the call System.out.print(null) is ambiguous to compiler
		// because print(null) here will find the two best specific matches
		// i.e. print(String) and print(char[]) . So compiler is unable to
		// determine which method to call here
		// System.out.println(null);
		System.out.println((String) null);// null
		//System.out.println((char[]) null);
		System.out.println((Object) null);// null

		// PrintStream printStream = new PrintStream(System.out);
		// printStream.println("Hi");
		// System.out.println("TestCls.main()");

		File file = new File("C:\\Users\\sbbras\\Desktop/test.txt");
		FileOutputStream fis = new FileOutputStream(file);
		PrintStream out = new PrintStream(fis);

		System.setOut(out);
		System.out.println("First Line");
		System.out.println("Second Line");
		System.out.println("Third Line");
		System.out.println("Fourth Line");

	}

}
