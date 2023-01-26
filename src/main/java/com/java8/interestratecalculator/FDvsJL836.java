package com.java8.interestratecalculator;

import java.util.stream.IntStream;

public class FDvsJL836 {

 
	private float RATE_OF_INTREST = 0.065f;
	
	private int principalAmount = 115760;
	private int nextYearPrincipal = principalAmount; 
	private int paybleYear = 16; 
	private int maturityYear = 25; 
	private int interestAmount = 0; 
	private float returnAmount = 0; 
	
	public static void main(String[] args) {
		new FDvsJL836().calculate();
	}
	
	private void calculate(){
		
		IntStream.range(1, maturityYear).forEach((counter) -> {
			interestAmount = (int) (nextYearPrincipal * RATE_OF_INTREST);
			System.out.println("Yearly Intrest [" + counter + "] - " + interestAmount);
			
			returnAmount = nextYearPrincipal + interestAmount;
			System.out.println("Year return with principal - " + returnAmount);
			
			if(counter <= paybleYear) {
				nextYearPrincipal = (int) (returnAmount + principalAmount);
				System.out.println("Next Year Principal [" + counter +"] - " + nextYearPrincipal);
			} else {
				nextYearPrincipal = (int) (returnAmount);
				System.out.println("Next Year Principal [" + counter +"] - " + nextYearPrincipal);
			}
			System.out.println(nextYearPrincipal);
		});
		
		System.out.println("Total Paid - " + principalAmount*paybleYear);
		
		System.out.println("Total Return - " + nextYearPrincipal);
		
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
