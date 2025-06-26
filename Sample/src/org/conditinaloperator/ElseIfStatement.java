package org.conditinaloperator;

public class ElseIfStatement {

	public static void main(String[] args) {
		   int marks=125;
		   
		   if(marks>=35 && marks<=100) {
			   System.out.println("You Are Pass");
		   }
		   else if(marks>=0 && marks<35) {
			   System.out.println("You Are Fail");
		   }
		   else {
			   System.out.println("Please Enter the marks 0 to 100");
		   }

	}

}
