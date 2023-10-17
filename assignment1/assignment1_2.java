package com.sunbeam;

import java.util.Scanner;

public class assignment1_2 {
	

	 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first double value: ");
	        if (scanner.hasNextDouble()) {
	            double firstValue = scanner.nextDouble();
	            scanner.nextLine(); // Consume the newline character

	            System.out.print("Enter the second double value: ");
	            if (scanner.hasNextDouble()) {
	                double secondValue = scanner.nextDouble();
	                scanner.close(); // Close the scanner

	                double average = (firstValue + secondValue) / 2;
	                System.out.println("Average of the two double values: " + average);
	            } else {
	                System.out.println("The second input is not a valid double.");
	            }
	        } else {
	            System.out.println("The first input is not a valid double.");
	        }
	    }
	}

}
