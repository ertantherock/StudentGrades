/**
 * This program finds the prime number
 * Student ID: 2021719087
 * @author Ertan Kaya
 * @since 22.11.2021
 * There is studenNames array which stores Student Names and there is random array which genarets 
 * random stundent grades. 
 */


import java.util.Random;

import java.util.*;


public class studentgrades {
	
	private static int index;

	public static void main(String args[]){  
			 
	
	String[] studentNames =  {"Ertan", "Ahmet", "Ayse", "Fatma", "Ali","Mehmet"};// Created string array
	
	//System.out.println(StudentNames[2]);// array tested
	
	int[] randomNumbers = new int[6];
	for(int index = 0; index< randomNumbers.length; index++) {
		randomNumbers[index] = (int) (Math.random()*100);		
	} //End for loop
	for(int index = 0; index< randomNumbers.length; index++) {
		System.out.println((index+1)+"."+ studentNames[index] + ":" + randomNumbers[index]);		
	} // End for loop
	
	int total = 0;
	
	for(int i=0; i<randomNumbers.length; i++){//start for loop for average
    	total = total + randomNumbers[i];
    }	//end for loop for average
	
	/* randomNumbers.length returns the number of elements 
    * present in the array
    */
	double average = total / randomNumbers.length;
	
	System.out.printf("The average is: %.0f", average);
	
	for(int x=0; x<randomNumbers.length; x++) {
		if(randomNumbers[x]<average) {
			
		System.out.printf("%n"+  studentNames[x] + " "+ "below the average. " + studentNames[x]+"'s "+ "Grade is:  "+ randomNumbers[x]);
		}
		
	}
	
	} // End main
	
	
	
	
	}  // End main
	

