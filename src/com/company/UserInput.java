package com.company;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
    	//Collect User Inputs
	Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter First Initial: ");
	String firstInitial = keyboard.next();
		System.out.println("Enter Last Name: ");
	String lastName  = keyboard.next();
		System.out.println("Enter House Number: ");
	String houseNumber = keyboard.next();
		System.out.println("Enter Street Name: ");
	String streetName = keyboard.next();
		System.out.println("Enter Street Type: ");
	String streetType = keyboard.next();
		System.out.println("City: ");
	String city = keyboard.next();

	//Display all inputs on a line
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
