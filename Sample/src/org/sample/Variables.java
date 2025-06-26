package org.sample;

public class Variables {
	static int i=10;
	
	
	String s="hi";	//instance variable
	
	public void variable() {
		int a=30;	//local variable
		System.out.println(a);
		System.out.println(s);
		final int in=10;


	}

	public static void main(String[] args) {
		Variables vr=new Variables();
		vr.variable();
		
		System.out.println(i);

	}

}
