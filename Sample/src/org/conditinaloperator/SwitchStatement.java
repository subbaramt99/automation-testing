package org.conditinaloperator;

public class SwitchStatement {

	public static void main(String[] args) {
		char Grade='b';
		
		switch(Grade) {
		case 'a':
			System.out.println("Exelent");
			break;
		case 'b':
			System.out.println("Amazing");
			break;
		case 'c':
			System.out.println("Very Good");
			break;
		case 'd':
			System.out.println("You are Pass");
			break;
			default:
				System.out.println("Please Check Your Grade");
		}

	}

}
