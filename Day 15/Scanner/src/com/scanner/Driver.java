package com.scanner;

import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the Fisrt Name");
		
		String name=sc.nextLine();
		
		System.out.println("Please Enter the Middle Name");
		String middle=sc.nextLine();
		
		
		System.out.println("Please Enter the last Name");
		String lastname=sc.nextLine();
		
		System.out.println("First Name="+name);
		System.out.println("Middle Name="+middle);
		System.out.println("Last Name="+lastname);
		
		sc.close();
	}

}
