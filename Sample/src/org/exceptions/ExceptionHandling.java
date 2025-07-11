package org.exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
	//ArithmeticException
		int i=10;
		int j=0;
		try {
			System.out.println(i/j);
		}
	catch(ArithmeticException e) {
		System.out.println("Cannot devided by 0");
	}
		
		//NullPointerException
		String s=null;
		try {
		System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("No value for Null");
		}
		
		//ArrayIndexOutOfBoundsException
		int [] a= {1,2,3,4,5};
		try {
		System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index Number");
		}
		
		//InputMismatchException
		Scanner sr=new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		try {
		int ni = sr.nextInt();
		
		System.out.println(ni);
		}
		catch(InputMismatchException e) {
			System.out.println("Cannot Accept String Value");
		}
		
		//IndexOutOfBoundsException
		List<Integer> li=new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		System.out.println(li);
		try {
		Integer ir = li.get(4);
		System.out.println(ir);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Invalid Index Number");
		}
		//NumberFormatException
		String st="122.344jr";
		try {
		int nu=Integer.parseInt(st);
		System.out.println(nu);
		}
		catch(NumberFormatException e) {
			System.out.println("Cannot Convert String to Integer");
		}
		//StringIndexOutOfBoundsException
		String str="Hello";
		try {
		char c = str.charAt(5);
		System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Invalid Index Number");
		}
		
	}

}
