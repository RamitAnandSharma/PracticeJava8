package com.concept.bit;

public class BitOperations {

	static final int NO_EXTRAS = 0; // In binary: 00000
	static final int HAS_POOL = 1; // In binary: 00001
	static final int HAS_GYM = 2; // In binary: 00010
	static final int HAS_LAUNDRY = 4; // In binary: 00100
	static final int ALLOWS_PETS = 8; // In binary: 01000
	static final int HAS_INTERNET = 16; // In binary: 10000

	public static void main(String[] args) throws Exception {

		System.out.println("Main Method exceuted");
		
		int vFlags = NO_EXTRAS;

		int vIdealHotel = HAS_POOL | HAS_GYM | HAS_LAUNDRY;
		if ((vFlags & vIdealHotel) == vIdealHotel)
			System.out.println("True");  

		
		int vMask = HAS_POOL | HAS_GYM | HAS_LAUNDRY | ALLOWS_PETS;
		vIdealHotel = HAS_POOL | HAS_GYM | HAS_LAUNDRY;
		if ((vFlags & vMask) == vIdealHotel)
			System.out.println("False"); 
		
		System.out.println("Main Method Ended");
	}

}
