package org.abstraction;

public class Animal extends Abstraction{
	public void cat() {
		System.out.println("Running");
		
	}


	public void dog() {
		System.out.println("Parking");
		
	}


	public static void main(String[] args) {
		
		Animal am=new Animal();
		am.cat();
		am.dog();
		am.tiger();
	
	}


	
}
