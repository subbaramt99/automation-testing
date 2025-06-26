package org.conditinaloperator;

public class StudentMarks {

	public static void main(String[] args) {
		int Marks=120;
		
		if(Marks>=0 && Marks<=100) {
			if(Marks>=35) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
			
			
		}else {
			System.out.println("Please Enter the Marks for 0 to 100");
		}

	}

}
