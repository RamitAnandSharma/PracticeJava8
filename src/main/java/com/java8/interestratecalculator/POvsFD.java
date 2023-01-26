package com.java8.interestratecalculator;

import java.util.stream.IntStream;

public class POvsFD {

 
	private float RATE_OF_INTREST = 0.074f;
	
	private int principalAmount = 100000;
	private int nextYearPrincipal = principalAmount;  
	private int maturityYear = 5; 
	private int interestAmount = 0; 
	private float returnAmount = 0; 
	
	public static void main(String[] args) {
		new POvsFD().calculate();
	}
	
	private void calculate(){
		
		IntStream.range(1, maturityYear).forEach((counter) -> {
			interestAmount = (int) (nextYearPrincipal * RATE_OF_INTREST);
			System.out.println("Yearly Intrest [" + counter + "] - " + interestAmount);
			
			returnAmount = nextYearPrincipal + interestAmount;
			System.out.println("Year return with principal - " + returnAmount);
			System.out.println(returnAmount);
		});
		
		System.out.println("Total Paid - " + principalAmount*maturityYear);
		
		System.out.println("Total Return - " + returnAmount);
		
	}
	
	
//private void calculate(){
//		
//		intrestAmount = (int) (principalAmount * RATE_OF_INTREST * year);
//		System.out.println("Yearly Intrest " + intrestAmount);
//		
//		
//		totalfinalAmountYearly = principalAmount * (1 + (RATE_OF_INTREST*year)) ;
//		System.out.println(totalfinalAmountYearly);
//		interestAmount = totalfinalAmountYearly - principalAmount;
//		System.out.println(interestAmount);
//	}
}
